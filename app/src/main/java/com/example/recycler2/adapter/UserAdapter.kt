package com.example.recycler2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler2.Data.User
import com.example.recycler2.R

class UserAdapter(val listUser:List<User>):RecyclerView.Adapter<UserViewHolder>() {

    // Retorna un objeto viewHolder con un layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UserViewHolder(layoutInflater.inflate(R.layout.user_item, parent, false))
    }

    // Tamaño de la lista
    override fun getItemCount() = listUser.size

    // Toma cada una de las posiciones de mi lista, y se la pasa a la clase ViewHolder para que lo pinte
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = listUser[position]
        holder.render(item)
    }

}