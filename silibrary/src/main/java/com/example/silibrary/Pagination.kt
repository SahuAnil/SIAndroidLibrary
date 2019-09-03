package com.example.silibrary

data class Pagination(
	val perPage: Int? = null,
	val total: Int? = null,
	val count: Int? = null,
	val links: Any? = null,
	val totalPages: Int? = null,
	val currentPage: Int? = null
)
