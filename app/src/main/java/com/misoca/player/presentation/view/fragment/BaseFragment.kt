package com.misoca.player.presentation.view.fragment

import android.graphics.Color
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.annotation.LayoutRes
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.misoca.player.R
import com.misoca.player.databinding.FragmentLibraryBinding
import dagger.android.support.DaggerFragment
import net.steamcrafted.materialiconlib.MaterialDrawableBuilder

abstract class BaseFragment : DaggerFragment() {

    internal fun replaceFragment(fragment: Fragment, @IdRes @LayoutRes layoutResId: Int, addStack: Boolean) {
        val ft = activity!!.supportFragmentManager.beginTransaction()
        ft.replace(layoutResId, fragment, fragment.javaClass.simpleName)
        if (addStack) {
            ft.addToBackStack(fragment.javaClass.simpleName)
        }
        ft.commit()
    }

}