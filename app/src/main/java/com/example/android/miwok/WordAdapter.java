package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Win Than on 8/31/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> wordsList,int mColorResourceId) {
        super(context, 0,wordsList);
        this.mColorResourceId = mColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.tv_miwok);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.tv_default);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView mImage = (ImageView)listItemView.findViewById(R.id.iv_image);

        if (currentWord.hasImage()){

            mImage.setImageResource(currentWord.getImageId());

            mImage.setVisibility(View.VISIBLE);

        }else {

            mImage.setVisibility(View.GONE);

        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
