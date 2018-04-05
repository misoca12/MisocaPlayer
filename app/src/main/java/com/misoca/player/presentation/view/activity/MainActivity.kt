package com.misoca.player.presentation.view.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.misoca.player.R
import com.misoca.player.databinding.ActivityMainBinding
import com.misoca.player.presentation.view.fragment.LibraryFragment

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val fragment = LibraryFragment.newInstance()
        replaceFragment(fragment, R.id.container, true)
    }

}
