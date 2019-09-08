package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main15Activity : AppCompatActivity() {

    var btn14: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)


        btn14=findViewById(R.id.boton14)



        btn14?.setOnClickListener {
            finish()

        }
    }
}
