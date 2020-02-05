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


public class played_matches extends Fragment {

    private RecyclerView playedMatches_recycle_view;
    private Context context;
    private ArrayList<PlayedMatches_Lists> playedMatchesLists;
    private PlayedMatches_Adapter playedMatchesAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_played_matches, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getActivity().getApplicationContext();

        playedMatches_recycle_view =view.findViewById(R.id.playedMatches_recycle_view);
        playedMatchesLists = new ArrayList<PlayedMatches_Lists>();
        playedMatchesLists.clear();

        playedMatchesLists.add(new PlayedMatches_Lists("Team 1",R.drawable.user));
        playedMatchesLists.add(new PlayedMatches_Lists("Team 2",R.drawable.user ));
        playedMatchesLists.add(new PlayedMatches_Lists("Team 3",R.drawable.user));
        playedMatchesLists.add(new PlayedMatches_Lists("Team 4",R.drawable.user));
        playedMatchesLists.add(new PlayedMatches_Lists("Team5",R.drawable.user));
        playedMatchesLists.add(new PlayedMatches_Lists("Team 6",R.drawable.user));

        playedMatchesAdapter = new PlayedMatches_Adapter(playedMatchesLists,context);
        playedMatchesAdapter.notifyDataSetChanged();
        playedMatches_recycle_view.setLayoutManager(new LinearLayoutManager(context));
        playedMatches_recycle_view.setAdapter(playedMatchesAdapter);

    }
}
