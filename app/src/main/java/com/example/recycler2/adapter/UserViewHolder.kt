package com.example.recycler2.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler2.databinding.UserItemBinding
import com.example.recycler2.Data.User

class UserViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val binding:UserItemBinding = UserItemBinding.bind(view)

    fun render(user: User) {
        binding.tvName.text = user.name
        binding.tvLastname.text = user.lastName
        binding.tvAge.text = user.age.toString()
        binding.tvDni.text = user.dni
    }
}