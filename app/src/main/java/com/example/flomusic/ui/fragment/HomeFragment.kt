package com.example.flomusic.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.flomusic.R
import com.example.flomusic.databinding.FragmentHomeBinding
import com.example.flomusic.ui.base.BaseFragment

/** 홈 화면 **/
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayout(): Int {
        return R.layout.fragment_home
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}