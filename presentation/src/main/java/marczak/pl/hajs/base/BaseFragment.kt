package marczak.pl.hajs.base

import androidx.fragment.app.Fragment

abstract class BaseFragment<T : BaseActivity> : Fragment() {

    fun getParent(): T? = activity as? T
}