package com.example.blooddonation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DonationCenterAdapter extends RecyclerView.Adapter<DonationCenterAdapter.ViewHolder> {

    private List<DonationCenter> donationCenters;

    public DonationCenterAdapter(List<DonationCenter> donationCenters) {
        this.donationCenters = donationCenters;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_donation_center, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DonationCenter center = donationCenters.get(position);
        holder.nameTextView.setText(center.getName());
        holder.addressTextView.setText(center.getAddress());
        holder.phoneTextView.setText(center.getPhone());
    }

    @Override
    public int getItemCount() {
        return donationCenters.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, addressTextView, phoneTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.textViewName);
            addressTextView = itemView.findViewById(R.id.textViewAddress);
            phoneTextView = itemView.findViewById(R.id.textViewPhone);
        }
    }
}
