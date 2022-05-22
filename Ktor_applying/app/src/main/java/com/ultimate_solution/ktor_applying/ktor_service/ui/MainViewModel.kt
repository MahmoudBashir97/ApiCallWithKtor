package com.ultimate_solution.ktor_applying.ktor_service.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ultimate_solution.ktor_applying.repositories.MainRepository
import com.ultimate_solution.ktor_applying.response.SearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _list =
        MutableLiveData<List<SearchResponse.BusinessResponse>>(emptyList())
    val list: LiveData<List<SearchResponse.BusinessResponse>> = _list

    fun search(term: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _list.postValue(MainRepository.search(term))
        }
    }
}