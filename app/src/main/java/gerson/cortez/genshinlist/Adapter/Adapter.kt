package gerson.cortez.genshinlist.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import gerson.cortez.genshinlist.R
import gerson.cortez.genshinlist.modelo.PersonajeGenshin
import com.squareup.picasso.Picasso

class Adapter(val listaPersonajes:ArrayList<PersonajeGenshin>): RecyclerView.Adapter<Adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vista,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNombre.text=listaPersonajes[position].nombre
        Picasso.get()
            .load(listaPersonajes[position].foto)
            .into(holder.ivFoto)
    }
    override fun getItemCount(): Int {
        return listaPersonajes.size
    }
    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista){
        val tvNombre:TextView
        val ivFoto:ImageView

        init {
            tvNombre = vista.findViewById(R.id.tvNombreP)
            ivFoto = vista.findViewById(R.id.imagenPersonaje)
        }
    }
}