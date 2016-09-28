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

public class ConfiguracionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_configuracion, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Configuración");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentConfiguracion);

        final TextView textViewConfiguracionFragment = (TextView) view.findViewById(R.id.textViewConfiguracionFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewConfiguracionFragment.setText("This is the Configuración Fragment");
                textViewConfiguracionFragment.setTextColor(getResources().getColor(R.color.md_yellow_800));

            }
        });

        return view;
    }


}
