package com.example.mysoccerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

class Player_List_adapter extends RecyclerView.Adapter<Player_List_adapter.ViewHolder> {


    private Context context;
    private ArrayList<Player_List> playerLists;
    private View.OnClickListener playerListener;


    public Player_List_adapter(ArrayList<Player_List> playerLists, Context context) {

        this.playerLists = playerLists;
        this.context = context;
    }

    @NonNull
    @Override
    public Player_List_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_recycle_item, parent, false);

        return new Player_List_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Player_List_adapter.ViewHolder holder, int position) {
        holder.player_name.setText(playerLists.get(position).getPlayer_name());
        holder.player_icon.setImageResource(playerLists.get(position).getPlayer_icon());
    }

    public void setOnClickListenetr(View.OnClickListener clickListenetr) {

        playerListener = clickListenetr;
    }

    @Override
    public int getItemCount() {
        return playerLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView player_name;
        ImageView player_icon;

        public ViewHolder(View itemView) {
            super(itemView);

            player_name = itemView.findViewById(R.id.player_name);
            player_icon = itemView.findViewById(R.id.player_icon);

            itemView.setTag(this);

            itemView.setOnClickListener(playerListener);

        }
    }
}