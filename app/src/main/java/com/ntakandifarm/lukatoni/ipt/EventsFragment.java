package com.ntakandifarm.lukatoni.ipt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {
    String[] college={"Cive","cnms","Android","php","Java","xml"};
    ListView listView;
    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        listView=(ListView) view.findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,college);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String position= String.valueOf(i);
                Toast.makeText(getContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
