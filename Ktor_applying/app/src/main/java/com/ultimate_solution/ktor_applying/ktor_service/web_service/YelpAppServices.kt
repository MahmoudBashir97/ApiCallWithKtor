package com.ultimate_solution.ktor_applying.ktor_service.web_service

import com.ultimate_solution.ktor_applying.response.SearchResponse

interface YelpAppServices {
    suspend fun search( term: String = "burger",
                        location: String = "california",
                        limit: Int = 50,):SearchResponse
}