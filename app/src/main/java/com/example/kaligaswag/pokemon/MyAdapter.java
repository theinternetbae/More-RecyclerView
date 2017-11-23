package com.example.kaligaswag.pokemon;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kaligaswag on 23/11/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<PokemonModel> objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<PokemonModel> objectList){
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        PokemonModel current = objectList.get(position);
        holder.setData(current, position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView imgThumb, imgDelete, imgCopy;
        private int position;
        private PokemonModel currentObject;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);
            imgThumb = (ImageView) itemView.findViewById(R.id.imgThumb);
            imgDelete = (ImageView) itemView.findViewById(R.id.img_delete);
            imgCopy = (ImageView) itemView.findViewById(R.id.img_copy);
        }

        public void setData(PokemonModel currentObject, int position) {
            this.title.setText(currentObject.getTitle());
            this.imgThumb.setImageResource(currentObject.getImageID());
            this.position = position;
            this.currentObject = currentObject;
        }
    }
}
