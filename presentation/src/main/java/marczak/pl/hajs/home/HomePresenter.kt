package marczak.pl.hajs.home

const val TEXT = "CLICKED"
class HomePresenter {



    var view: HomeView? = null

    fun attachView(view: HomeView) {
        this.view = view
    }

    fun buttonClicked() {
        view?.onTextReceived(TEXT)
    }
}