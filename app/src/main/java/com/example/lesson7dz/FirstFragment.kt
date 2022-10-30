package com.example.lesson7dz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.lesson7dz.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    var pictureList = arrayListOf<Picture>()
    private lateinit var adapter: PictureAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = PictureAdapter(pictureList, this::onClick)
        binding.recycler.adapter = adapter
    }

    private fun onClick(picture: Picture) {
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToResultFragment(
                picture
            )
        )
    }

    private fun loadData() {
        pictureList.add(Picture(R.drawable.ic_albert, "Dead", "Albert Einstein"))
        pictureList.add(Picture(R.drawable.ic_morty, "Alive", "Morty Smith"))
        pictureList.add(Picture(R.drawable.ic_jerry, "Alive", "Jerry Smith"))
        pictureList.add(Picture(R.drawable.ic_sanchez, "Alive", "Rick Sanchez"))
    }
}