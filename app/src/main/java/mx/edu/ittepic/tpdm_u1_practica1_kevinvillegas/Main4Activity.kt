package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main4Activity : AppCompatActivity() {
    var btn3: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btn3=findViewById(R.id.boton3)

        btn3?.setOnClickListener {

            finish()
        }

    }



    }

