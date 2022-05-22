package com.ultimate_solution.ktor_applying.ktor_service.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ultimate_solution.ktor_applying.R
import com.ultimate_solution.ktor_applying.databinding.ActivityMainBinding
import com.ultimate_solution.ktor_applying.ktor_service.ui.views.AdapterResultList

class MainActivity : AppCompatActivity() {

    lateinit var bd:ActivityMainBinding
    lateinit var result_adapter: AdapterResultList
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bd.root)
        viewModel =ViewModelProvider(this)[MainViewModel::class.java]

        result_adapter = AdapterResultList()

        bd.recList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter=result_adapter
        }

        viewModel.search("apple")
        viewModel.list.observe(this, Observer {
            mlist ->
            if (mlist.isNotEmpty()){
                AdapterResultList.mlist = mlist
                bd.recList.adapter=result_adapter
            }
        })


    }
}