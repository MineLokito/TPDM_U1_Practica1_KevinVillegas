package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main5Activity : AppCompatActivity() {

    var btn4: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        btn4=findViewById(R.id.boton4)



        btn4?.setOnClickListener {
            finish()

        }

    }


}
