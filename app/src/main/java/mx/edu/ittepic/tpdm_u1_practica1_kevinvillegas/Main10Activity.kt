package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main10Activity : AppCompatActivity() {

    var btn9: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        btn9=findViewById(R.id.boton9)



        btn9?.setOnClickListener {
            finish()

        }
    }
}
