package marczak.pl.hajs.home

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class HomePresenterTest : Spek({

    val view by memoized { mock<HomeView>() }

    val presenter by memoized { HomePresenter() }

    beforeEachTest {
        presenter.attachView(view)
    }

    on("button click") {
        println("button click")
        presenter.buttonClicked()
        it("shows text") {
            verify(view).onTextReceived(TEXT)
        }
    }

})