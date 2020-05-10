package com.rungenes.aboutrungene

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rungenes.aboutrungene.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var bidding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bidding =ActivityMainBinding.inflate(layoutInflater)
        val view = bidding.root
        setContentView(view)

        bidding.buttonDone.setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view: View) {

        val editTextNickName = bidding.editTextNickName

        val textViewNickName = bidding.textViewNickName


        textViewNickName.text = editTextNickName.text
        editTextNickName.visibility = View.GONE
        view.visibility = View.GONE
        textViewNickName.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
