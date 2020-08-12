package cl.desafiolatam.ciclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia

class CicloviaAdapter (val lista :MutableList<Ciclovia>): RecyclerView.Adapter<CicloviaVieholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CicloviaVieholder {
        val itemView =
       LayoutInflater.from(parent.context).inflate(R.layout.item_ciclobike,parent,false)
        return CicloviaVieholder(itemView)

    }

    override fun getItemCount(): Int {
      return lista.size
    }

    override fun onBindViewHolder(holder: CicloviaVieholder, position: Int) {

        holder.texciclovia.text = lista[position].nombre
        holder.texComuna.text = lista[position].comuna


    }

}
class CicloviaVieholder(itemView: View) :RecyclerView.ViewHolder(itemView){
     val texciclovia : TextView
     val texComuna : TextView

    init {
        texciclovia = itemView.findViewById(R.id.Ciclovia)
        texComuna = itemView.findViewById(R.id.Comuna)

    }

}