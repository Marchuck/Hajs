package marczak.pl.hajs.di

import androidx.annotation.StringRes

interface ResourceRepository {
    fun getString(@StringRes resId: Int, vararg args: Any): String
}