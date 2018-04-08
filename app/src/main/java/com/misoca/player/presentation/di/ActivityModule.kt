package com.misoca.player.presentation.di

import com.misoca.player.presentation.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun contributeMainActivity(): MainActivity
}