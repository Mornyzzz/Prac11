package com.example.prac11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<String> {
    private final LayoutInflater inflater;
    private final int layout;
    private final List<String> items;

    public ListAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);
        TextView text =  (TextView)view.findViewById(R.id.textView);
        String item = items.get(position);
        text.setText(item);
        return view;
    }
}

