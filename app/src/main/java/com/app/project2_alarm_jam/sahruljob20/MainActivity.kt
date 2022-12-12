package com.app.project2_alarm_jam.sahruljob20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "MUHAMMAD KHUSNU MAROM",
        "MUHAMMAD HUDA GUNAWAN",
        "MUTMAINAH SEPTIARINI",
        "NASYWA SUKRIA HANIFA",
        "NOR HIDAYAH",
        "NOVITA SARI",
        "NUR IZZA",
        "RISKA ANGGUN",
        "SAHRUL LUKMAN HAKIM",
        "SETYA NENG RAHAYU",
        "SITI AGNIA AMALIA"
    )

    val listNis = arrayOf(
        "3012",
        "3014",
        "3016",
        "3018",
        "3020",
        "3022",
        "3024",
        "3026",
        "3027",
        "3030",
        "3032"
    )


    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}