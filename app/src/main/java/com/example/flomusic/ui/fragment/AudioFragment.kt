package com.example.flomusic.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.flomusic.R
import com.example.flomusic.databinding.FragmentAudioBinding
import com.example.flomusic.ui.base.BaseFragment

/** 오디오 화면 **/
class AudioFragment : BaseFragment<FragmentAudioBinding>() {

    override fun getLayout(): Int {
        return R.layout.fragment_audio
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}