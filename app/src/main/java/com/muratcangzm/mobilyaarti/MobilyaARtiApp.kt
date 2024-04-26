package com.muratcangzm.mobilyaarti

import android.app.Application
import com.muratcangzm.mobilyaarti.utils.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MobilyaARtiApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
        else
            Timber.plant(Timber.asTree())


    }

}