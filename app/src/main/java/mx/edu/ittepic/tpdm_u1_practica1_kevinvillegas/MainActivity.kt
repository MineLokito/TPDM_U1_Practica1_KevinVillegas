package mx.edu.ittepic.tpdm_u1_practica1_kevinvillegas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var img1: ImageView?=null
    var img2: ImageView?=null
    var img3: ImageView?=null
    var img4: ImageView?=null
    var img5: ImageView?=null
    var img6: ImageView?=null
    var img7: ImageView?=null
    var img8: ImageView?=null
    var img9: ImageView?=null
    var img10: ImageView?=null
    var img11: ImageView?=null
    var img12: ImageView?=null
    var img13: ImageView?=null
    var img14: ImageView?=null
    var img15: ImageView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img1= findViewById(R.id.img1)
        img2=findViewById(R.id.img2)
        img3=findViewById(R.id.img3)
        img4=findViewById(R.id.img4)
        img5=findViewById(R.id.img5)
        img6=findViewById(R.id.img6)
        img7=findViewById(R.id.img7)
        img8=findViewById(R.id.img8)
        img9=findViewById(R.id.img9)
        img10=findViewById(R.id.img10)
        img11=findViewById(R.id.img11)
        img12=findViewById(R.id.img12)
        img13=findViewById(R.id.img13)
        img14=findViewById(R.id.img14)
        img15=findViewById(R.id.img15)

        img1?.setOnClickListener {

            var otroActivity  = Intent(this, Main2Activity::class.java)
            startActivity(otroActivity)

        }

        img2?.setOnClickListener {


            var otroActivity1  = Intent(this, Main3Activity::class.java)
            startActivity(otroActivity1)
        }

        img3?.setOnClickListener {
            var otroActivity2  = Intent(this, Main4Activity::class.java)
            startActivity(otroActivity2)

        }

        img4?.setOnClickListener {

            var otroActivity3  = Intent(this, Main5Activity::class.java)
            startActivity(otroActivity3)

        }

        img5?.setOnClickListener {

            var otroActivity4  = Intent(this, Main6Activity::class.java)
            startActivity(otroActivity4)

        }

        img6?.setOnClickListener {

            var otroActivity5  = Intent(this, Main7Activity::class.java)
            startActivity(otroActivity5)

        }
        img7?.setOnClickListener {

            var otroActivity6  = Intent(this, Main8Activity::class.java)
            startActivity(otroActivity6)

        }
        img8?.setOnClickListener {

            var otroActivity7  = Intent(this, Main9Activity::class.java)
            startActivity(otroActivity7)

        }

        img9?.setOnClickListener {

            var otroActivity8  = Intent(this, Main10Activity::class.java)
            startActivity(otroActivity8)

        }
        img10?.setOnClickListener {

            var otroActivity9  = Intent(this, Main11Activity::class.java)
            startActivity(otroActivity9)

        }
        img11?.setOnClickListener {

            var otroActivity11  = Intent(this, Main12Activity::class.java)
            startActivity(otroActivity11)

        }
        img12?.setOnClickListener {

            var otroActivity12  = Intent(this, Main13Activity::class.java)
            startActivity(otroActivity12)

        }
        img13?.setOnClickListener {

            var otroActivity13  = Intent(this, Main14Activity::class.java)
            startActivity(otroActivity13)

        }
        img14?.setOnClickListener {

            var otroActivity14  = Intent(this, Main15Activity::class.java)
            startActivity(otroActivity14)

        }
        img15?.setOnClickListener {

            var otroActivity14  = Intent(this, Main16Activity::class.java)
            startActivity(otroActivity14)

        }






    }


}
