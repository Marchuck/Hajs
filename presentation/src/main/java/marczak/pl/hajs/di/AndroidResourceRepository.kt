package marczak.pl.hajs.di

import android.content.Context

class AndroidResourceRepository(val context: Context) : ResourceRepository {


    override fun getString(resId: Int, vararg args: Any) = context.getString(resId, args)
}
