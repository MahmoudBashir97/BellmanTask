package com.mahmoud.bashir.bellman_task.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mahmoud.bashir.bellman_task.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class hot_spot_adpt extends RecyclerView.Adapter<hot_spot_adpt.ViewHolder> {

    Context context;
    List<String> mlist;

    public hot_spot_adpt(Context context, List<String> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String list= mlist.get(position);

        //holder.name.setText(list.getName());

        Picasso.get().load(list).into(holder.img_v);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView  img_v;
        TextView name,sort;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_v=itemView.findViewById(R.id.img_v);
            name=itemView.findViewById(R.id.name);
            sort=itemView.findViewById(R.id.sort);
        }
    }
}
