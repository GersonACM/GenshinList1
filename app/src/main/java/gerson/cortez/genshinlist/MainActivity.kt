package gerson.cortez.genshinlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import gerson.cortez.genshinlist.Adapter.Adapter
import gerson.cortez.genshinlist.modelo.PersonajeGenshin

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonajes = ArrayList<PersonajeGenshin>()

        listaPersonajes.add(PersonajeGenshin("MONA","https://i.ytimg.com/vi/HTKt5xm1aFg/maxresdefault.jpg"))
        listaPersonajes.add(PersonajeGenshin("EULA","https://images5.alphacoders.com/120/1204138.jpg"))
        listaPersonajes.add(PersonajeGenshin("SHENHE","https://img.uhdpaper.com/wallpaper/genshin-impact-shenhe-400@1@e-preview.jpg?dl"))
        listaPersonajes.add(PersonajeGenshin("KEQING","https://3.bp.blogspot.com/-FHWP93jV-BY/X-8p75aOfvI/AAAAAAAAGSc/-1_YC5F3cZM8Pu_o_4RA7kPezulODIUDQCPcBGAsYHg/w919/genshin-impact-keqing-uhdpaper.com-4K-8.2608-wp.thumbnail.jpg"))
        listaPersonajes.add(PersonajeGenshin("HUTAO <3","https://3.bp.blogspot.com/-bbbkSWtO268/YKs4NVL6N6I/AAAAAAAAIWQ/rbon2p2cMzQIUJXoZ0Tm2Q1opfl-5aI-wCPcBGAsYHg/w919/genshin-impact-hu-tao-4k-uhdpaper.com-266.1_a-thumbnail.jpg"))
        listaPersonajes.add(PersonajeGenshin("AYAKA","https://lh3.googleusercontent.com/blogger_img_proxy/ABLy4Ew8SLl3STS4EjB6ZKB2Ik40Gi1RGG2m-54NmhXhpsnPgBnwCNmLlcKqNpzAw-_aHv0jkQyL6209dwypLT9u0DPIG3x6FkXZrlJK7qj6L2Savs7SUF4FaiXRJUxMvinVQZ8TQKCUsdH7YvGq8vXsykbkvYZGQIp_VYs-vtIggpS7FJ_ajYy3yNIQGQ34aA=w919"))
        listaPersonajes.add(PersonajeGenshin("BARBARA","https://images5.alphacoders.com/111/1114238.png"))

        miRecycler= findViewById(R.id.RecyclerPersonajes)

        miRecycler.adapter=Adapter(listaPersonajes)
        miRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)



    }
}