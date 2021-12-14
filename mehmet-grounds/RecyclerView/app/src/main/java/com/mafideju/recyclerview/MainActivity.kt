package com.mafideju.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


// CRIAR O RECYCLER VIEW DENTRO DO MAIN ACTIVITY
// CRIAR UM CARD-DESIGN (COMPONENTE ONDE SERÃO EXIBIDOS OS DADOS)
// CRIAR UM ADAPTER QUE CONECTA O DESIGN E O RECYCLER VIEW COMPONET
// DEFINIR O ADAPTADOR ENTRE RECYCLER E O MAIN ACTIVITY

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CountriesAdapter
    lateinit var recyclerView: RecyclerView
    var countryNameList = ArrayList<String>()
    var details = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CRIAR O RECYCLER VIEW DENTRO DO MAIN ACTIVITY
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)

        populate()

        // CRIAR UM ADAPTER QUE CONECTA O DESIGN E O RECYCLER VIEW COMPONENT
        adapter = CountriesAdapter(countryNameList, details, imageList, applicationContext)
        recyclerView.adapter = adapter
    }

    private fun populate() {
        countryNameList.add("United Kingdom")
        countryNameList.add("Australia")
        countryNameList.add("Fiji Islands")
        countryNameList.add("Brazil")
        countryNameList.add("Argentina")
        countryNameList.add("Uruguai")
        countryNameList.add("France")
        countryNameList.add("Italy")

        details.add("Bandeira do Reino Unido")
        details.add("Bandeira dos Cangurus")
        details.add("Bandeira do Pacifico Sul")
        details.add("Bandeira do Brasil")
        details.add("Bandeira do Argentina")
        details.add("Bandeira do Uruguai")
        details.add("Bandeira do França")
        details.add("Bandeira do Itália")

        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.uk)
    }
}