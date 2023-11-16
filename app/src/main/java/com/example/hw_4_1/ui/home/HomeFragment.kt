package com.example.hw_4_1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hw_4_1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private var List= arrayListOf(
        HomList("https://th.bing.com/th/id/OIP.3CVPdt-zzJFNvGaFMV2HDQHaHa?pid=ImgDet&rs=1","FiFine A8","новый,\n" +
                "отличный вариант микрофона\n" +
                "4000 coм"),
        HomList("https://th.bing.com/th/id/OIP.T5_C9NSx4R7ubvfMOQ8vzgHaHa?pid=ImgDet&rs=1-","Weikav meta 68 ","Продается новая механическая клавиатура \n Weikav meta 68 на красных свечах")
    )

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = AdapterHome(List)
        binding.rview.adapter=adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}