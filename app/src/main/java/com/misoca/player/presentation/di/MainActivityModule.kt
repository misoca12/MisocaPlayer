package com.misoca.player.presentation.di

import com.misoca.player.presentation.view.activity.MainActivity
import dagger.Module
import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds


@Module(subcomponents = [
    MainActivitySubComponent::class
])
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
}