package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main7Activity : AppCompatActivity() {
    var btn6: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)


        btn6=findViewById(R.id.boton6)



        btn6?.setOnClickListener {
            finish()

        }

    }
}
