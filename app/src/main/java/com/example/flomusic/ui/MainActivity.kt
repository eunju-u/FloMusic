package com.example.flomusic.ui

import android.os.Bundle
import com.example.flomusic.Menu
import com.example.flomusic.R
import com.example.flomusic.databinding.ActivityMainBinding
import com.example.flomusic.ui.base.BaseActivity
import com.example.flomusic.ui.base.BaseFragment
import com.example.flomusic.ui.fragment.*
import com.example.flomusic.ui.viewModel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    private val homeFragment by lazy { HomeFragment() }
    private val aroundFragment by lazy { AroundFragment() }
    private val audioFragment by lazy { AudioFragment() }
    private val searchFragment by lazy { SearchFragment() }
    private val storageFragment by lazy { StorageFragment() }

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun getVmClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    override fun onStart() {
        super.onStart()
        //select 되는 메뉴를 고른다. Home 으로만 셋팅해도됨.
        vm.nowTab = Menu.HOME
    }

    private fun init() {
        vm.init()
        setEvent()
    }


    private fun setEvent() {
        binding.mainBottomNavigationView.setOnItemSelectedListener { menuItem ->
            var result = true
            val transactionFragment: BaseFragment<*>? = when (menuItem.itemId) {
                R.id.menu_home -> homeFragment
                R.id.menu_around -> aroundFragment
                R.id.menu_audio -> audioFragment
                R.id.menu_search -> searchFragment
                R.id.menu_storage -> storageFragment
                else -> null
            }
            if (transactionFragment != null) {
                supportFragmentManager.beginTransaction().replace(R.id.main_frameLayout, transactionFragment).commit()
            } else {
                result = false
            }
            result
        }
    }

}