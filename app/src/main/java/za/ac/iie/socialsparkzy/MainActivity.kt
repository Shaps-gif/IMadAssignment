package za.ac.iie.socialsparkzy

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }






        //Declarations
        val EditText = findViewById<EditText>(R.id.textview3)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val textview4 = findViewById<TextView>(R.id.textview4)
        val textview3 = findViewById<TextView>(R.id.textview3)

        button1.setOnClickListener {
            val input = EditText.text.toString().trim()

            //Logic
            val Suggestion = when (input.lowercase()){
                "morning" -> "Good Morning"
                "afternoon" -> "Good Afternoon"
                "evening" -> "Good Evening"
                "night" -> "Good Night"
                else -> "Invalid Input"
            }

            textview4.text = Suggestion


        }

        button2.setOnClickListener {
            EditText.text.clear()
            textview4.text = ""
        }








                }
            }


