package cl.desafiolatam.ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.example.ciromine.ciclobike.Ciclovia
import com.example.ciromine.ciclobike.SetupCiclovias
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().init())

    }

    fun SinFiltro (){
        Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().init())

    }

    fun FiltrarlasCondes(){
        Recyclear_view.adapter = CicloviaAdapter(SetupCiclovias().comuna())

    }
}