package com.example.lokersoloandronity.model

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("logo_pt")
	val logoPt: String? = null,

	@field:SerializedName("admin_id")
	val adminId: Int? = null,

	@field:SerializedName("wa")
	val wa: String? = null,

	@field:SerializedName("no_telp")
	val noTelp: String? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("posisi")
	val posisi: String? = null,

	@field:SerializedName("judul_loker")
	val judulLoker: String? = null,

	@field:SerializedName("id_loker")
	val idLoker: Int? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)