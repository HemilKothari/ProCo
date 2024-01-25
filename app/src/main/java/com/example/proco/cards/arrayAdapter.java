package com.example.proco.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<cards> {
    Context context;
    public arrayAdapter(@NonNull Context context, int resourceId, List<cards> items) {
        super(context, resourceId, items);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        cards card_item=getItem(position);

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item, parent,false);
        }

        TextView ame=(TextView) convertView.findViewById(R.id.name);
        ImageView image=(ImageView) convertView.findViewById(R.id.image);
        TextView budget=(TextView)convertView.findViewById(R.id.budget);
        ImageView mNeedImage=(TextView) convertView.findViewById(R.id.needImage);
        ImageView mGiveImage=(TextView) convertView.findViewById(R.id.needImage);

        name.setText(card_item.getName());
        budget.setText(card_item.getBudget());
        if(card_item.getNeed().equals("Netflix"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.netflix));

        else if(card_item.getNeed().equals("AmazonPrime"))
             mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.amazon));
        else if(card_item.getNeed().equals("Hulu"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.hulu));
        else if(card_item.getNeed().equals("Hotstar"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.hotstar));
        else if(card_item.getNeed().equals("Voot"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.voot));
        else if(card_item.getNeed().equals("HBO"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.hbo));

        else
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.none));

        if(card_item.getGive().equals("Netflix"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.netflix));

        else if(card_item.getGive().equals("AmazonPrime"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.amazon));
        else if(card_item.getGive().equals("Hulu"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.hulu));
        else if(card_item.getGive().equals("Hotstar"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.hotstar));
        else if(card_item.getGive().equals("Voot"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.voot));
        else if(card_item.getGive().equals("HBO"))
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getCotext(),R.drawable.hbo));

        else
            mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.none));

        switch(card_item.getPofileImageUrl()) {
            case default:
                Glide.with(convertView.getContext()).load(R.drawable.profile).into(image);
                break;
            default:
                Glide.clear(image);
                Glide.with(convertView.getContext()).load(card_item.getProfileImageUrl()).into(image);
                break;

        }
        return convertView;



    }
}
