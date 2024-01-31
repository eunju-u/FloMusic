package com.example.flomusic.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.flomusic.R
import com.example.flomusic.databinding.FragmentAroundBinding
import com.example.flomusic.ui.base.BaseFragment

/** 둘러보기 화면 **/
class AroundFragment : BaseFragment<FragmentAroundBinding>() {

    override fun getLayout(): Int {
        return R.layout.fragment_around
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}