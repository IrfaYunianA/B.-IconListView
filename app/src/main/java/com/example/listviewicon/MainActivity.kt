package com.example.listviewicon

import android.os.Bundle
import android.widget.Toast
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val a = 5
    private val b = 5
    private val c = 5
    private var lv: ListView? = null
    private var customeAdapter: CustomAdapter? = null
    private var imageModelArrayList: ArrayList<ImageModel>? = null
    private val ListGambar = intArrayOf(R.drawable.ruby, R.drawable.rails, R.drawable.python, R.drawable.js, R.drawable.php)
    private val ListNama = arrayOf("Ruby", "Rails","Python", "JavaScript", "PHP")
    private val ListKet = arrayOf("Ruby is an open-source and fully object-orienten progeming language.",
        "Ruby on Rails is server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting and ibject-oriented programing language.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language, i.e there is no need for complication.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById(R.id.listview) as ListView

        imageModelArrayList = populateList()
        Log.d("hjhjh", imageModelArrayList!!.size.toString() + "")
        customeAdapter = CustomAdapter(this, imageModelArrayList!!)
        lv!!.adapter = customeAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Anda memilih : ${ListNama[position]}", Toast.LENGTH_SHORT).show()}
    }

    private fun populateList(): ArrayList<ImageModel> {

        val list = ArrayList<ImageModel>()

        for (i in 0..4) {
            val imageModel = ImageModel()
            imageModel.setNamaa(ListNama[i])
            imageModel.setKett(ListKet[i])
            imageModel.setGambarr(ListGambar[i])
            list.add(imageModel)
        }

        return list
    }
}