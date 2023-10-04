package com.example.tkea.ui.search_store

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tkea.R

class SearchStoreFragment : Fragment() {

    companion object {
        fun newInstance() = SearchStoreFragment()
    }

    private lateinit var viewModel: SearchStoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_store, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchStoreViewModel::class.java)
        // TODO: Use the ViewModel
    }

}