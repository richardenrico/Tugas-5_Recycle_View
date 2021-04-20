package com.tugas.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MangaRecyclerAdapter extends RecyclerView.Adapter<MangaRecyclerAdapter.MangaViewHolder> {
    private List<MangaModel> models;
    private OnItemClickCallback onItemClickCallback;

    public MangaRecyclerAdapter(List<MangaModel> models) {
        this.models = models;
    }

    public void  setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public MangaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new MangaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MangaViewHolder holder, int position) {
        MangaModel model = models.get(position);
        holder.ivMangaImg.setImageResource(model.getImage());
        holder.tvMangaTitle.setText(model.getTitle());
        holder.tvMangaAuthor.setText(model.getAuthor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(models.get(holder.getBindingAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(MangaModel data);
    }

    public class MangaViewHolder extends RecyclerView.ViewHolder{
        ImageView ivMangaImg;
        TextView tvMangaTitle, tvMangaSynopsis, tvMangaAuthor;

        public MangaViewHolder(@NonNull View itemView) {
            super(itemView);

            ivMangaImg = itemView.findViewById(R.id.iv_manga_images);
            tvMangaTitle = itemView.findViewById(R.id.tv_manga_title);
            tvMangaSynopsis = itemView.findViewById(R.id.tv_manga_synopsis);
            tvMangaAuthor = itemView.findViewById(R.id.tv_manga_author);
        }
    }
}
