package core.views

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.kotlinhandbook.MainActivity

abstract class BaseFragment : Fragment() {

    abstract val viewModel: BaseViewModel

    fun notifyScreenUpdates(){
        (requireActivity() as FragmentsHolder).notifyScreenUpdates()
    }
}