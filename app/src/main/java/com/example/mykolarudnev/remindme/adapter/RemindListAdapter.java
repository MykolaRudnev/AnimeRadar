package com.example.mykolarudnev.remindme.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.mykolarudnev.remindme.R;
import com.example.mykolarudnev.remindme.dto.RemindDto;

import java.util.List;


public class RemindListAdapter extends  RecyclerView.Adapter<RemindListAdapter.RemindViewHolder> {

    private List<RemindDto> data;


    public RemindListAdapter(List<RemindDto> data) {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item,parent,false);


        return  new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position) {

        RemindDto item= data.get(position);
        holder.title.setText(item.getTitle());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<RemindDto> data) {
        this.data = data;
    }

    public static class RemindViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView title;


        public RemindViewHolder(View itemView ) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            title= (TextView) itemView.findViewById(R.id.title);

        }
    }



}