package com.meass.admin_b_haque;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class PackageAdapter extends RecyclerView.Adapter<PackageAdapter.myview> {
    public List<Package_user> data;
    FirebaseFirestore firebaseFirestore;
    FirebaseAuth firebaseAuth;

    public PackageAdapter(List<Package_user> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PackageAdapter.myview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.papa, parent, false);
        return new PackageAdapter.myview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PackageAdapter.myview holder, final int position) {
        firebaseFirestore= FirebaseFirestore.getInstance();
        firebaseAuth= FirebaseAuth.getInstance();

        holder.customer_name.setText("Username : " + data.get(position).getUsername());
        holder.customer_number.setText("Package  : " + data.get(position).getPackage_name());
        holder.customer_area.setText(data.get(position).getDate());
        holder.logout.setText(data.get(position).getStatus());




    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class myview extends RecyclerView.ViewHolder {
        TextView customer_name, customer_number, customer_area, logout;
        CardView card_view8;
        ImageView image;

        public myview(@NonNull View itemView) {
            super(itemView);
            customer_name = itemView.findViewById(R.id.customer_name);
            customer_number = itemView.findViewById(R.id.customer_number);
            customer_area = itemView.findViewById(R.id.customer_area);
            logout = itemView.findViewById(R.id.logout);
            card_view8=itemView.findViewById(R.id.card_view8);
            image=itemView.findViewById(R.id.image);

        }
    }
}