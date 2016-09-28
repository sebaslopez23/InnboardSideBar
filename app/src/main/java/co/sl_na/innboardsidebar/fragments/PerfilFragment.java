package co.sl_na.innboardsidebar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.sl_na.innboardsidebar.MainActivity;
import co.sl_na.innboardsidebar.R;

public class PerfilFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Perfil");



        return view;
    }

}

