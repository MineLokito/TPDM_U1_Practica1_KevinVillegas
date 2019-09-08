package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main3Activity : AppCompatActivity() {

    var btn2:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btn2=findViewById(R.id.boton2)

    btn2?.setOnClickListener {

        finish()
    }

    }
}
