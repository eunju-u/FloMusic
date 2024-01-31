package com.example.flomusic.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.flomusic.R
import com.example.flomusic.databinding.FragmentSearchBinding
import com.example.flomusic.ui.base.BaseFragment

/** 검색 화면 **/
class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    override fun getLayout(): Int {
        return R.layout.fragment_search
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}