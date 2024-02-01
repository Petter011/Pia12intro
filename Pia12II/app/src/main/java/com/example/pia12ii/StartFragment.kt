package com.example.pia12ii

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pia12ii.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    var letscount = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("CommitTransaction")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startText

        binding.button.setOnClickListener {
            binding.startText.text = "Apelsin"
        }

        binding.startGoButton.setOnClickListener {

            var gofrag = ReadmoreFragment()
            gofrag.myNumber = 123

            requireActivity()
                .supportFragmentManager
                .beginTransaction().add(R.id.fragcon, gofrag)
                .addToBackStack(null)
                .commit()
        }
    }
}