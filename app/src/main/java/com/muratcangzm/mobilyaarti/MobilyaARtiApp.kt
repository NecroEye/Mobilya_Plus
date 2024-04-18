package com.muratcangzm.mobilyaarti

import android.app.Application
import com.muratcangzm.mobilyaarti.utils.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.compose.koinInject
import org.koin.core.context.startKoin
import timber.log.Timber

class MobilyaARtiApp : Application() {

    override fun onCreate() {
        super.onCreate()

       startKoin{
           androidContext(this@MobilyaARtiApp)
           modules()
       }

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
        else
            Timber.plant(Timber.asTree())


    }

}