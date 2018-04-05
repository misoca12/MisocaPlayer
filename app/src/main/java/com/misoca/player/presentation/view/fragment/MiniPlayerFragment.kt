package com.misoca.player.presentation.view.fragment

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.misoca.player.R
import com.misoca.player.databinding.FragmentLibraryBinding
import com.misoca.player.databinding.FragmentMiniPlayerBinding
import net.steamcrafted.materialiconlib.MaterialDrawableBuilder

class MiniPlayerFragment : Fragment() {

    lateinit var binding: FragmentMiniPlayerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMiniPlayerBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}