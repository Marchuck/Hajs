package marczak.pl.hajs

import android.os.Bundle
import marczak.pl.hajs.base.BaseActivity
import marczak.pl.hajs.home.HomeFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_main_placeholder, HomeFragment())
            .commit()

    }
}
