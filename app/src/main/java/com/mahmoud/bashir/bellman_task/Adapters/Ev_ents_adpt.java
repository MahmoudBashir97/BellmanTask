package com.mahmoud.bashir.bellman_task.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mahmoud.bashir.bellman_task.R;
import com.mahmoud.bashir.bellman_task.pojo.inside_data.events;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Ev_ents_adpt extends RecyclerView.Adapter<Ev_ents_adpt.ViewHolder> {

    Context context;
    List<String> mlist;

    public Ev_ents_adpt(Context context, List<String> mlist) {
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

        Picasso.get().load(mlist.get(position)).into(holder.img_v);

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_v;
        TextView name,sort;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_v=itemView.findViewById(R.id.img_v);
            name=itemView.findViewById(R.id.name);
            sort=itemView.findViewById(R.id.sort);
        }
    }
}
