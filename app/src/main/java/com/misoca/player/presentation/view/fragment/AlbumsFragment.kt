package com.misoca.player.presentation.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.misoca.player.databinding.FragmentAlbumsBinding
import dagger.android.support.DaggerFragment

class AlbumsFragment : BaseFragment() {

    lateinit var binding: FragmentAlbumsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAlbumsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}