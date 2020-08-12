package cl.desafiolatam.ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import com.example.ciromine.ciclobike.Ciclovia
import com.example.ciromine.ciclobike.SetupCiclovias
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().init())
        // Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().comuna())
    }

    fun SinFiltro (view : View){

        Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().init())

    }

    fun FiltrarlasCondes(view : View){

        Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().comuna())

    }
}