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


public class playerlist_fragment extends Fragment {

    private RecyclerView player_recycle_view;
    private Context context;
    private ArrayList<Player_List> playerLists;
    private Player_List_adapter playerAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_playerlist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        context = getActivity().getApplicationContext();

        player_recycle_view =view.findViewById(R.id.player_recycle_view);
        playerLists = new ArrayList<Player_List>();
        playerLists.clear();

        playerLists.add(new Player_List("Team 1",R.drawable.user));
        playerLists.add(new Player_List("Team 2",R.drawable.user ));
        playerLists.add(new Player_List("Team 3",R.drawable.user));
        playerLists.add(new Player_List("Team 4",R.drawable.user));
        playerLists.add(new Player_List("Team5",R.drawable.user));
        playerLists.add(new Player_List("Team 6",R.drawable.user));

        playerAdapter = new Player_List_adapter(playerLists,context);
        playerAdapter.notifyDataSetChanged();
        player_recycle_view.setLayoutManager(new LinearLayoutManager(context));
        player_recycle_view.setAdapter(playerAdapter);

    }
}
