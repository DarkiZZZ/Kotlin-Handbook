package com.example.kotlinhandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider.*
import com.example.kotlinhandbook.views.HasScreenTitle
import com.example.kotlinhandbook.views.base.BaseFragment
import com.example.kotlinhandbook.views.base.maintopic.MainTopicFragment

class MainActivity : AppCompatActivity() {

    private val activityViewModel by viewModels<MainViewModel> { AndroidViewModelFactory(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            activityViewModel.lauchFragment(
                activity = this,
                screen = MainTopicFragment.Screen(),
                addToBackStack = false
            )
        }
        supportFragmentManager.registerFragmentLifecycleCallbacks(fragmentCallbacks, false)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onResume() {
        super.onResume()
        activityViewModel.whenActivityActive.resource = this
    }

    override fun onPause() {
        super.onPause()
        activityViewModel.whenActivityActive.resource = null
    }

    override fun onDestroy() {
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(fragmentCallbacks)
        super.onDestroy()
    }

    fun notifyScreenUpdates(){
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)

        if (supportFragmentManager.backStackEntryCount > 0){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        else{
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
        }

        if (fragment is HasScreenTitle && fragment.getScreenTitle() != null){
            supportActionBar?.title = fragment.getScreenTitle()
        }
        else{
            supportActionBar?.title = getString(R.string.app_title)
        }

        val result = activityViewModel.result.value?.getValue() ?: return
        if (fragment is BaseFragment){
            fragment.viewModel.onResult(result)
        }
    }

    private val fragmentCallbacks = object : FragmentManager.FragmentLifecycleCallbacks(){
        override fun onFragmentCreated(
            fm: FragmentManager,
            f: Fragment,
            savedInstanceState: Bundle?
        ) {
            notifyScreenUpdates()
        }
    }
}