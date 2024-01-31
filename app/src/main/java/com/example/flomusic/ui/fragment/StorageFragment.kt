package com.example.flomusic.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.flomusic.R
import com.example.flomusic.databinding.FragmentStorageBinding
import com.example.flomusic.ui.base.BaseFragment

/** 보관함 화면 **/
class StorageFragment : BaseFragment<FragmentStorageBinding>() {

    override fun getLayout(): Int {
        return R.layout.fragment_storage
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}