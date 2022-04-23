package com.example.recyclerviewexample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder>{

    private ArrayList<Contact> contacts = new ArrayList<>();
    private final Context context;
    //empty constructor
    public ContactsRecViewAdapter(Context context) {
        this.context = context;
    }

    // below 3 mandatory methods for creating constructor
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.textName.setText(contacts.get(position).getName());
        holder.textEmail.setText(contacts.get(position).getEmail());
//        holder.viewImage.setText(contacts.get(position).getName()); cant be used in this way instead use Glide
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, contacts.get(position).getName()+ " selected", Toast.LENGTH_SHORT).show();
            }
        });
        Glide.with(context)
                .asBitmap()
                .load(contacts.get(position).getImageUrl())
                .into(holder.viewImage);



    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView textName;
        private final TextView textEmail;
        private final ImageView viewImage;
        private final CardView parent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textName);
            textEmail = itemView.findViewById(R.id.textEmail);
            viewImage = itemView.findViewById(R.id.viewImage);
            parent = itemView.findViewById(R.id.parent);



        }
    }


}
