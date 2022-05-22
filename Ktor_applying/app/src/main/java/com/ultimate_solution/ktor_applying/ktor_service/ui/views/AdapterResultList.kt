package com.ultimate_solution.ktor_applying.ktor_service.ui.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ultimate_solution.ktor_applying.R
import com.ultimate_solution.ktor_applying.response.SearchResponse

class AdapterResultList: RecyclerView.Adapter<ResultHolder>() {

    companion object{
        var mlist:List<SearchResponse.BusinessResponse> = ArrayList();
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultHolder
    = ResultHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_item_list,parent,false))

    override fun onBindViewHolder(holder: ResultHolder, position: Int) {
        holder.bind(mlist[position].name)
    }

    override fun getItemCount(): Int {
        return if (mlist.isNotEmpty()) mlist.size else 0
    }


}