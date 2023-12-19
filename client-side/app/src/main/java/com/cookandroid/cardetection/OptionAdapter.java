package com.cookandroid.cardetection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.OptionViewHolder> {
    private List<Option> options;

    public OptionAdapter(List<Option> options) {
        this.options = options;
    }

    @NonNull
    @Override
    public OptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new OptionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OptionViewHolder holder, int position) {
        Option currentOption = options.get(position);
        holder.optionName.setText(currentOption.getName());
    }

    @Override
    public int getItemCount() {
        return options.size();
    }

    public static class OptionViewHolder extends RecyclerView.ViewHolder {
        public TextView optionName;

        public OptionViewHolder(@NonNull View itemView) {
            super(itemView);
            optionName = itemView.findViewById(android.R.id.text1);
        }
    }
}
