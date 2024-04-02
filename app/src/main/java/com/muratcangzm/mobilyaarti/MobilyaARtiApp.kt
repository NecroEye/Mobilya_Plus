package com.muratcangzm.mobilyaarti

import android.app.Application
import com.muratcangzm.mobilyaarti.ui.utils.BuildConfig
import timber.log.Timber

class MobilyaARtiApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())


    }

}