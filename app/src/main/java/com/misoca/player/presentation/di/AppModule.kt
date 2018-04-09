package com.misoca.player.presentation.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [
    MainActivitySubComponent::class
])
internal object AppModule {
    @Singleton @Provides @JvmStatic
    fun provideContext(application: Application): Context = application
}