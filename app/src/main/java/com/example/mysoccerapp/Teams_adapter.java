package com.example.mysoccerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Teams_adapter extends RecyclerView.Adapter<Teams_adapter.ViewHolder> {

    private ArrayList<Team_List> team_ArrayList;
    private Context context;
    private View.OnClickListener teamListener;

    public Teams_adapter(ArrayList<Team_List>  team_ArrayList,Context context){
        this.team_ArrayList = team_ArrayList;
        this.context = context;
}

    @NonNull
    @Override
    public Teams_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_recycle_item,parent,false);


        return new Teams_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Teams_adapter.ViewHolder holder, int position) {

    holder.team_name.setText(team_ArrayList.get(position).getTeam_name());
    holder.team_icon.setImageResource(team_ArrayList.get(position).getTeam_icon());


    }

    public void setOnClickListenetr(View.OnClickListener clickListenetr) {

        teamListener = clickListenetr;
    }


    @Override
    public int getItemCount() {
        return team_ArrayList.size();
    }


        public class ViewHolder extends RecyclerView.ViewHolder{

    TextView team_name;
    ImageView team_icon;

    public  ViewHolder(View itemView){
        super(itemView);

            team_name = itemView.findViewById(R.id.team_name);
            team_icon = itemView.findViewById(R.id.team_icon);

            itemView.setTag(this);

            itemView.setOnClickListener(teamListener);

    }

}
}