package com.example.aarongoodman.tabletopcharactermanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aarongoodman on 4/2/17.
 */

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
//
    ArrayList<Character> playerCharacterList;

//    //This was from the google tutorial:
//    public static class ViewHolder extends RecyclerView.ViewHolder{
//        public TextView mTextView;
//        public ViewHolder(TextView v) {
//            super(v);
//            mTextView = v;
//
//        }
//
//    }
    //Here's my viewholder class declaration

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        protected ImageView image;
        protected TextView characterName;
        protected TextView characterHP;

        public MyViewHolder(View itemView) {
            super(itemView);
            //image= (ImageView) itemView.findViewById(R.id.textViewName);
            characterName = (TextView) itemView.findViewById(R.id.textViewActualName);
            characterHP = (TextView) itemView.findViewById(R.id.textViewHpNumber);
            // TODO: 4/3/17 hook up all of the stats, put in a picture, and set up healing/hurting
            // and level up
        }
    }



    //my constructor
    public MyAdapter(ArrayList<Character> playerCharacterList, Context context) {
        this.playerCharacterList = playerCharacterList;
    }

    // constructor from google tutorial
//
//    public MyAdapter(String[] myDataSet) {
//        mDataSet = myDataSet;
//    }



    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
//        TextView v = (TextView) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.my_text_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.character_layout,parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {

        //holder.image.setImageResource(R.drawable.characterImage);
        holder.characterName.setText(playerCharacterList.get(position).getName());
        holder.characterHP.setText(Integer.toString(
                playerCharacterList.get(position).getHp()));

    }

    @Override
    public int getItemCount() {
        return playerCharacterList.size();
    }
}
