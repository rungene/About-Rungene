package com.rungenes.aboutrungene

import android.content.Context
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.rungenes.aboutrungene.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var bidding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bidding =DataBindingUtil.setContentView(this,R.layout.activity_main)



        bidding.buttonDone.setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view: View) {

        bidding.apply {
            textViewNickName.text = bidding.editTextNickName.text
            invalidateAll()
            editTextNickName.visibility= View.GONE
            buttonDone.visibility = View.GONE
            textViewNickName.visibility=View.VISIBLE
        }


        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
