package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main11Activity : AppCompatActivity() {
    var btn10: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        btn10=findViewById(R.id.boton10)



        btn10?.setOnClickListener {
            finish()

        }
    }
}
