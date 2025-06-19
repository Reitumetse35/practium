package com.example.myplaylist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Playlists
import android.provider.MediaStore.Audio.PlaylistsColumns
import android.provider.Telephony.Mms.Rate
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    // delcare the interface
    val PlaylistButton = findViewById<Button>(R.id.PlaylistButton)
    val theartistname = findViewById<EditText>(R.id.Artistname)
    val rate = findViewById<EditText>(R.id.Rate)
    val EditText = findViewById<EditText>(R.id.Usercomment)
    val SongTitle = findViewById<EditText>(R.id.SongTitle)
val    ExistButton = findViewById<Button>(R.id.Exist)

}





        val intent=Intent( this, Result:: class.java)
      StartActivty(intent)









