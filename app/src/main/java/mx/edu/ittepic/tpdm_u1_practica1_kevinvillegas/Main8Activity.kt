package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main8Activity : AppCompatActivity() {

    var btn7: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        btn7=findViewById(R.id.boton7)



        btn7?.setOnClickListener {
            finish()

        }
    }
}
