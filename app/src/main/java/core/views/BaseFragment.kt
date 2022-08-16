package core.views

import androidx.fragment.app.Fragment
import com.example.kotlinhandbook.MainActivity

abstract class BaseFragment : Fragment() {

    abstract val viewModel: BaseViewModel

    fun notifyScreenUpdates(){
        (requireActivity() as MainActivity).notifyScreenUpdates()
    }
}