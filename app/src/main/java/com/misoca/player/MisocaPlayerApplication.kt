package com.misoca.player

import android.content.Context
import android.support.multidex.MultiDex
import com.orhanobut.hawk.Hawk
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

open class MisocaPlayerApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    override fun onCreate() {
        super.onCreate()
        setupHawk()
        setupTimber()
    }
    private fun setupHawk() {
        Hawk.init(this).build()
    }
    private fun setupTimber() {
        Timber.plant(Timber.DebugTree())
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}