package com.example.decentralizedvotingsystemwithblockchain.ui.vote;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.decentralizedvotingsystemwithblockchain.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VoteFragment extends Fragment {


    public VoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vote, container, false);
    }

}
