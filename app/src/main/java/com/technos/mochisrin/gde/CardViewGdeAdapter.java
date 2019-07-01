package com.technos.mochisrin.gde;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewGdeAdapter extends RecyclerView.Adapter<CardViewGdeAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Gde> listGde;
    private ArrayList<Gde> getListGde() {
        return listGde;
    }
    public void setListGde(ArrayList<Gde> listGde) {
        this.listGde = listGde;
    }
    public CardViewGdeAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(com.technos.mochisrin.gde.R.layout.item_card_gde, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Gde p = getListGde().get(i);
        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvRemarks.setText(p.getRemarks());
        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
                Toast.makeText(context, "Favorite "+getListGde().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListGde().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListGde().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(com.technos.mochisrin.gde.R.id.img_item_photo);
            tvName = itemView.findViewById(com.technos.mochisrin.gde.R.id.tv_item_name);
            tvRemarks = itemView.findViewById(com.technos.mochisrin.gde.R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(com.technos.mochisrin.gde.R.id.btn_set_favorite);
            btnShare = itemView.findViewById(com.technos.mochisrin.gde.R.id.btn_set_share);
        }
    }
}
