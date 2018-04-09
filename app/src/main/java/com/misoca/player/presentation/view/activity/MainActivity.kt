package com.misoca.player.presentation.view.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.misoca.player.R
import com.misoca.player.databinding.ActivityMainBinding
import com.misoca.player.presentation.view.fragment.LibraryFragment
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject lateinit var libraryFragment: LibraryFragment
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        replaceFragment(libraryFragment, R.id.container, true)
    }

}
