package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Win Than on 8/31/2016.
 */
public class MiWokAdapter extends ArrayAdapter<MiWok> {


    public MiWokAdapter(Context context, ArrayList<MiWok> wordsList) {
        super(context, 0,wordsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        MiWok currentWord = getItem(position);

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.tv_miwok);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.tv_default);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        return listItemView;
    }
}
