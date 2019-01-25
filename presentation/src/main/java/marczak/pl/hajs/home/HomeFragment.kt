package marczak.pl.hajs.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import marczak.pl.hajs.MainActivity
import marczak.pl.hajs.R
import marczak.pl.hajs.base.BaseFragment

class HomeFragment : BaseFragment<MainActivity>(), HomeView {

    val textView by lazy { view?.findViewById<TextView>(R.id.textView) }


    val presenter = HomePresenter()

    override fun onTextReceived(s: String) {
        textView?.text = s
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_main, container, false)

        presenter.attachView(this)

        v.findViewById<Button>(R.id.okButton).setOnClickListener {
            presenter.buttonClicked()
        }

        return v
    }

}