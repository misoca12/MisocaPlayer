package com.misoca.player.presentation.di

import com.misoca.player.presentation.view.activity.MainActivity
import dagger.android.AndroidInjector
import dagger.Subcomponent

@Subcomponent
interface MainActivitySubComponent: AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}