package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main6Activity : AppCompatActivity() {
    var btn5: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        btn5 = findViewById(R.id.boton5)



        btn5?.setOnClickListener {
            finish()

        }
    }
}
