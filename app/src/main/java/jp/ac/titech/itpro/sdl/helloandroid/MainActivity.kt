package jp.ac.titech.itpro.sdl.helloandroid

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var outputView: TextView
    lateinit var inputName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        outputView = findViewById(R.id.output_view)
        inputName = findViewById(R.id.input_name)
    }

    fun greet(v: View) {
        val name = inputName.text.toString().trim()
        if (name.isNotEmpty()) {
            outputView.text = "Hello $name!\nNice to see you!"
        }
    }
}
