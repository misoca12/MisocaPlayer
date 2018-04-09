package com.misoca.player.presentation.di

import com.misoca.player.MisocaPlayerApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class
])
interface AppComponent: AndroidInjector<MisocaPlayerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MisocaPlayerApplication): Builder
        fun build(): AppComponent
    }
    override fun inject(app: MisocaPlayerApplication)
}