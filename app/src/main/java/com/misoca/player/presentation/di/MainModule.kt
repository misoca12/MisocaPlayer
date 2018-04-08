package com.misoca.player.presentation.di

import com.misoca.player.presentation.view.activity.MainActivity
import com.misoca.player.presentation.view.fragment.LibraryFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainModule {
    @ContributesAndroidInjector
    abstract fun contributeLibraryFragment(): LibraryFragment
}