package com.misoca.player.presentation.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.misoca.player.databinding.FragmentSongsBinding

class SongsFragment : BaseFragment() {

    lateinit var binding: FragmentSongsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSongsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}