package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variable to increase the count of visitors
        var countOfVisitors = 0

        //jisko id di hai uska access mil jaye or we can say that write data of my choice on the given control
        val visitCountControl = findViewById<TextView>(R.id.Counter)

        //set text on textview
        visitCountControl.text = countOfVisitors.toString() //value : 0,1,2...

        //handle for the button
        val btnClickMe= findViewById<Button>(R.id.my_button)


        //logic to be performed when the button is clicked
        btnClickMe.setOnClickListener {
            countOfVisitors += 1
            visitCountControl.text = countOfVisitors.toString()

        }

        //handle for remove count button
        val btnRemove = findViewById<Button>(R.id.removeCount)

        btnRemove.setOnClickListener {
            countOfVisitors -=1
            visitCountControl.text = countOfVisitors.toString()
            if(countOfVisitors<0)
            {
                visitCountControl.text="VISITORS CAN'T BE NEGATIVE"
                countOfVisitors=0
            }

        }


    }
}