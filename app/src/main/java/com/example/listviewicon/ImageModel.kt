package com.example.listviewicon

class ImageModel {
    var nama: String? = null
    var ket: String? = null
    var gambar: Int = 0

    fun getNamaa(): String {
        return nama.toString()
    }

    fun setNamaa(nama: String) {
        this.nama = nama
    }
    fun getKett(): String {
        return ket.toString()
    }

    fun setKett(ket: String) {
        this.ket = ket
    }

    fun getGambarr(): Int {
        return gambar
    }

    fun setGambarr(gambar: Int) {
        this.gambar = gambar
    }

}
