package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main9Activity : AppCompatActivity() {
    var btn8: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        btn8=findViewById(R.id.boton8)



        btn8?.setOnClickListener {
            finish()

        }
    }
}
