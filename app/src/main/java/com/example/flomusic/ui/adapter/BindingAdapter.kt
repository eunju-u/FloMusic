package com.example.flomusic.ui.adapter

import androidx.databinding.BindingAdapter
import com.example.flomusic.Menu
import com.example.flomusic.R
import com.google.android.material.bottomnavigation.BottomNavigationView

@BindingAdapter("selectedItemId")
fun setSelectedItemId(view: BottomNavigationView, menu: Menu) {
    val item = when (menu) {
        Menu.AROUND -> R.id.menu_around
        Menu.AUDIO -> R.id.menu_audio
        Menu.SEARCH -> R.id.menu_search
        Menu.STORAGE -> R.id.menu_storage
        else -> R.id.menu_home
    }
    view.selectedItemId = item
}