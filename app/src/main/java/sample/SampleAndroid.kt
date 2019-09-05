package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.main_text)
        textView.text = Greeting().hello()
    }
}

actual class KMPDate actual constructor(formatString: String) {

    private val dateFormat = SimpleDateFormat(formatString)

    actual fun asString(): String {
        return dateFormat.format(Date())
    }
}