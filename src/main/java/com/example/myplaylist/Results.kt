package com.example.myplaylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
    }

    // declare
    val TextView = findViewById<TextView>(R.id.songs)


    val comment = findViewById<TextView>(R.id.Usercomment)
val artist=findViewById<TextView>(R.id.artistname)

    val rating=findViewById<TextView>(R.id.Rate)

    val button=findViewById<Button>(R.id.songButton)
    val average=findViewById<TextView>(R.id.Average)
    val mainmenu=findViewById<TextView>(R.id.Back)

}
     // show list of songs
val song= listOf<String>().toString()
val songs = arrayListOf< String>(
    "in the morning","come and see me","humble","kill my vibe " ,"21 savage freestyle" ," sickomode"
)



val artists= listOf<String>().toString()
   val textView= arrayListOf<String>(
       "Drake","Kendrick", " partynextdoor","travis sccot","21 savage"
   )
val rate = arrayListOf<Int>(
    5,5,1,3,4,5
)
 val comments= arrayListOf<String>("R&B","RAP","TRAP","RAP","DANCE"
 )




       // allow button to move from one activity to another









