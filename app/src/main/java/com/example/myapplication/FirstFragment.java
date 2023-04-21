package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private ArrayList<Tarea> listaTareas;
    private ArrayAdapter<Tarea> adaptadorTareas;
    private ListView listViewTareas;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        listaTareas = new ArrayList<>();
        adaptadorTareas = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listaTareas);
        listViewTareas = view.findViewById(R.id.listViewTareas);
        listViewTareas.setAdapter(adaptadorTareas);

        return view;
    }

    public void agregarTarea(Tarea tarea) {

        adaptadorTareas.add(tarea);
    }
}
