package co.sl_na.innboardsidebar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.sl_na.innboardsidebar.MainActivity;
import co.sl_na.innboardsidebar.R;

public class ContactosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_contactos, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Contactos");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentContactos);

        final TextView textViewContactosFragment = (TextView) view.findViewById(R.id.textViewContactosFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewContactosFragment.setText("This is the Inicio Fragment");
                textViewContactosFragment.setTextColor(getResources().getColor(R.color.md_yellow_800));

            }
        });

        return view;
    }

}