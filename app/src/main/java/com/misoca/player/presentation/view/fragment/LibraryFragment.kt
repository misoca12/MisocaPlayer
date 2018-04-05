package com.misoca.player.presentation.view.fragment

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.BottomSheetBehavior
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.misoca.player.R
import com.misoca.player.databinding.FragmentLibraryBinding
import net.steamcrafted.materialiconlib.MaterialDrawableBuilder


class LibraryFragment : BaseFragment() {

    lateinit var binding: FragmentLibraryBinding
    val playlistsFragment: PlaylistsFragment = PlaylistsFragment()
    val songsFragment: SongsFragment = SongsFragment()
    val albumsFragment: AlbumsFragment = AlbumsFragment()
    val artistsFragment: ArtistsFragment = ArtistsFragment()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLibraryBinding.inflate(inflater, container, false)
        val view = binding.root

        val bottomNavigation: BottomNavigationView = view.findViewById(R.id.bottom_navigation_view)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.playlists -> {
                    replaceFragment(playlistsFragment, R.id.content_view, true)
                }
                R.id.songs -> {
                    replaceFragment(songsFragment, R.id.content_view, true)                }
                R.id.albums -> {
                    replaceFragment(albumsFragment, R.id.content_view, true)                }
                R.id.artists -> {
                    replaceFragment(artistsFragment, R.id.content_view, true)                }
            }
            return@setOnNavigationItemSelectedListener true
        }

        val playlistsDrawable = MaterialDrawableBuilder.with(context)
                .setIcon(MaterialDrawableBuilder.IconValue.PLAYLIST_PLAY)
                .setColor(Color.BLACK)
                .setToActionbarSize()
                .build()
        bottomNavigation.getMenu().findItem(R.id.playlists).setIcon(playlistsDrawable);

        val songsDrawable = MaterialDrawableBuilder.with(context)
                .setIcon(MaterialDrawableBuilder.IconValue.MUSIC)
                .setColor(Color.BLACK)
                .setToActionbarSize()
                .build()
        bottomNavigation.getMenu().findItem(R.id.songs).setIcon(songsDrawable);

        val albumsDrawable = MaterialDrawableBuilder.with(context)
                .setIcon(MaterialDrawableBuilder.IconValue.ALBUM)
                .setColor(Color.BLACK)
                .setToActionbarSize()
                .build()
        bottomNavigation.getMenu().findItem(R.id.albums).setIcon(albumsDrawable);

        val artistsDrawable = MaterialDrawableBuilder.with(context)
                .setIcon(MaterialDrawableBuilder.IconValue.ACCOUNT)
                .setColor(Color.BLACK)
                .setToActionbarSize()
                .build()
        bottomNavigation.getMenu().findItem(R.id.artists).setIcon(artistsDrawable);

        val miniPlayer: View = view.findViewById(R.id.mini_player_view)
        val behavior =  BottomSheetBehavior.from(miniPlayer)
        behavior.setBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                bottomNavigation.alpha = Math.abs(1- slideOffset)
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        bottomNavigation.visibility = View.INVISIBLE
                    }
                    else -> {
                        bottomNavigation.visibility = View.VISIBLE
                    }
                }
            }

        })

        return view
    }

    override fun onStart() {
        super.onStart()
        replaceFragment(playlistsFragment, R.id.content_view, true)
    }

    companion object {
        fun newInstance(): LibraryFragment {
            val fragment = LibraryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

}
