package com.example.multtable

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MultiplicationTable : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multiplication_table)

        //get the table number from the bundle
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        //convert table number into integer
        val tableNumber = tableString?.toInt()

        //display heading so the action can be seen working
        val multiplicationTable = findViewById<TextView>(
            R.id.multiplicationTableTextView)

        multiplicationTable.text = "$tableNumber x table"

        // convert the table into an integer that is not nullable
        var tableNumber = tableString!!.toInt()

        //display the heading in order to see the value in action
        val multiplicationTable = findViewById<TextView>(
                                 R.id.multiplicationTableTextView)

        //start with the heading and add two new lines
        var tableDisplay: = "$tableNumber x table\n\n"

        //loop 10 times and keep adding the string

        //set the string onto the display

        multiplicationTable.text = tableDisplay

        //declare the control variable

        var counter = 1
        while (counter <=10) {  //check the control variable
            val answer = tableNumber * counter
            tableNumber += "$tableNumber x $counter = ${answer}\n"

            // declare the control variable

            var counter = 1
            while (counter <=10) { //check the control variable
                //skip 3
                if (counter == 3) {
                    counter++
                    continue
                }

                val answer = tableNumber * counter
                tableDisplay += "$tableNumber x $counter =  ${answer}\n"
                counter++           //update the control variable


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}