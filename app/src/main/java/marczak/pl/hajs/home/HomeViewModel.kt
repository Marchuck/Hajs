package marczak.pl.hajs.home

import marczak.pl.hajs.R
import marczak.pl.hajs.base.BaseViewModel
import marczak.pl.hajs.di.ResourceRepository

class HomeViewModel(resourceRepository: ResourceRepository) : BaseViewModel(resourceRepository) {

    override fun getTitle():String {
        return resourceRepository.getString(R.string.app_name)
    }
}