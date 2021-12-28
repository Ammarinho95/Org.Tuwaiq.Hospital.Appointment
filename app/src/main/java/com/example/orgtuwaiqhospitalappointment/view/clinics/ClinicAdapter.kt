package com.example.orgtuwaiqhospitalappointment.view.clinics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgtuwaiqhospitalappointment.R
import com.example.orgtuwaiqhospitalappointment.model.Clinic
import com.squareup.picasso.Picasso

class ClinicAdapter(var data:List<Clinic>):RecyclerView.Adapter<ClinicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClinicViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.clinic_item_row,null)
        return  ClinicViewHolder(v)
    }

    override fun onBindViewHolder(holder: ClinicViewHolder, position: Int) {
        holder.cliniTitle.text = data[position].name
        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return data.size
    }


}

class ClinicViewHolder(v:View):RecyclerView.ViewHolder(v){
    var cliniImage = v.findViewById<ImageView>(R.id.imageViewClinicAdap)
    var cliniTitle = v.findViewById<TextView>(R.id.textViewClinicAdap)

}