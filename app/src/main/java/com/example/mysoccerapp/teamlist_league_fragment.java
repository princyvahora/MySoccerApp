package com.example.mysoccerapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class teamlist_league_fragment extends Fragment {

    private RecyclerView teamlist_league_recycle_view;
    private Context context;
    private ArrayList<Team_List> teamLists;
    private Teams_adapter teamsAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_teamlist_league, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getActivity().getApplicationContext();

        teamlist_league_recycle_view =view.findViewById(R.id.teamlist_league_recycle_view);
        teamLists = new ArrayList<Team_List>();
        teamLists.clear();

        teamLists.add(new Team_List("Team 1",R.drawable.user));
        teamLists.add(new Team_List("Team 2",R.drawable.user ));
        teamLists.add(new Team_List("Team 3",R.drawable.user));
        teamLists.add(new Team_List("Team 4",R.drawable.user));
        teamLists.add(new Team_List("Team5",R.drawable.user));
        teamLists.add(new Team_List("Team 6",R.drawable.user));

        teamsAdapter = new Teams_adapter(teamLists,context);
        teamsAdapter.notifyDataSetChanged();
        teamlist_league_recycle_view.setLayoutManager(new LinearLayoutManager(context));
        teamlist_league_recycle_view.setAdapter(teamsAdapter);

    }
}
