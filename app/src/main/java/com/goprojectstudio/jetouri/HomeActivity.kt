package com.goprojectstudio.jetouri

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import java.util.*


class HomeActivity : AppCompatActivity() {

//    var activityMainBinding: ActivityMainBinding? = null
    var adapter: ListAdapter? = null

    var arrayList: List<String> = ArrayList()
    lateinit var listView: ListView
    lateinit var searchView: SearchView
    lateinit var btn_back: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        arrayList.toMutableList().add("january")
//        arrayList.toMutableList().add("February")
//        arrayList.toMutableList().add("March")

        btn_back = findViewById(R.id.btn_back)

        btn_back.setOnClickListener {
            finish()
        }

        arrayList = (listOf("Taman Nasional Karimun Jawa",
                "Pulau Panjang",
                "Pantai Bandengan",
                "Pantai Kartini",
                "Pantai Gua Manik",
                "Jepara Ocean Park",
                "Hutan Wisata Sreni Indah",
                "Benteng Portugis",
                "Musium Kartini",
                "Makam Sultan Hadirin dan Ratu Kalinyamat",
                "Air Terjun Songgo Langit",
                "Shopping Center Jepara (SCJ)"))

        adapter = ListAdapter(arrayList)

        listView = findViewById(R.id.list_view)



        searchView = findViewById(R.id.search)

        searchView.isActivated = true
        searchView.queryHint = "Cari Destinasi"
        searchView.onActionViewExpanded()
        searchView.isIconified = false
        searchView.clearFocus()
//
        searchView.setOnClickListener {
            adapter = ListAdapter(arrayList)
            listView.adapter = adapter
//            (adapter as com.goprojectstudio.jetouri.ListAdapter).filter.filter("xxxxxxxxx")
        }

        searchView.setOnSearchClickListener {
            adapter = ListAdapter(arrayList)
            listView.adapter = adapter
//            (adapter as com.goprojectstudio.jetouri.ListAdapter).filter.filter("xxxxxxxxx")
        }

        listView.setOnItemClickListener { parent, view, position, id ->
            adapter = ListAdapter(arrayList)
            listView.adapter = adapter
            (adapter as com.goprojectstudio.jetouri.ListAdapter).filter.filter("xxxxxxxxx")
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
//                listView.visibility = View.GONE
                adapter = ListAdapter(arrayList)
                listView.adapter = adapter
                (adapter as com.goprojectstudio.jetouri.ListAdapter).filter.filter("xxxxxxxxx")
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                adapter = ListAdapter(arrayList)
                listView.adapter = adapter
                (adapter as com.goprojectstudio.jetouri.ListAdapter).filter.filter(newText)
                return false
            }

        })
    }
}