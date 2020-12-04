package com.example.lokersoloandronity.model

import com.google.gson.annotations.SerializedName

data class Responseloker(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)