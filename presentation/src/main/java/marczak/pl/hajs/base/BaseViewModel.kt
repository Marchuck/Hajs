package marczak.pl.hajs.base

import marczak.pl.hajs.di.ResourceRepository

abstract class BaseViewModel(val resourceRepository: ResourceRepository) {
    abstract fun getTitle(): String
}