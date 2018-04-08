package com.misoca.player.presentation.di

import android.app.Application
import com.misoca.player.MisocaPlayerApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
        AndroidInjectionModule::class,
        AppModule::class
])
interface AppComponent : AndroidInjector<MisocaPlayerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
//        fun networkModule(networkModule: NetworkModule): Builder
//        fun databaseModule(databaseModule: DatabaseModule): Builder
        fun build(): AppComponent
    }
    override fun inject(app: MisocaPlayerApplication)
}