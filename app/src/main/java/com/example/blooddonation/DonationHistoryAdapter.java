package com.example.blooddonation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DonationHistoryAdapter extends RecyclerView.Adapter<DonationHistoryAdapter.DonationHistoryViewHolder> {

    private List<DonationRecord> donationHistoryList;

    public DonationHistoryAdapter(List<DonationRecord> donationHistoryList) {
        this.donationHistoryList = donationHistoryList;
    }

    @NonNull
    @Override
    public DonationHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation_history_item, parent, false);
        return new DonationHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonationHistoryViewHolder holder, int position) {
        DonationRecord record = donationHistoryList.get(position);
        holder.donationDateTextView.setText(record.getDonationDate());
        holder.donationLocationTextView.setText(record.getDonationLocation());
    }

    @Override
    public int getItemCount() {
        return donationHistoryList.size();
    }

    public static class DonationHistoryViewHolder extends RecyclerView.ViewHolder {

        TextView donationDateTextView;
        TextView donationLocationTextView;

        public DonationHistoryViewHolder(View itemView) {
            super(itemView);
            donationDateTextView = itemView.findViewById(R.id.tvDonationDate);
            donationLocationTextView = itemView.findViewById(R.id.tvDonationLocation);
        }
    }
}
