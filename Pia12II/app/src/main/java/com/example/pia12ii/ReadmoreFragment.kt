package com.example.pia12ii

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.pia12ii.databinding.FragmentReadmoreBinding


class ReadmoreFragment : Fragment() {


    private var _binding : FragmentReadmoreBinding? = null
    private val binding get() = _binding!!

    var myNumber = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentReadmoreBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textreadmore.text = "hej"

        binding.textView2.text = myNumber.toString()
    }

}