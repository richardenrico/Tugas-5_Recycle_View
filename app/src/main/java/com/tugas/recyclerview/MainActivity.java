package com.tugas.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewManga;
    private final List<MangaModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MangaRecyclerAdapter adapter = new MangaRecyclerAdapter(models);
        adapter.setOnItemClickCallback(new MangaRecyclerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(MangaModel data) {
                showSelectedManga(data);
            }
        });

        models.addAll(MangaDatabase.getListData());

        recyclerViewManga = findViewById(R.id.rv_manga);
        recyclerViewManga.setHasFixedSize(true);
        recyclerViewManga.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewManga.setAdapter(adapter);
    }

    private void showSelectedManga(MangaModel manga) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        intent.putExtra("Title", manga.getTitle());
        intent.putExtra("Synopsis", manga.getSynopsis());
        intent.putExtra("Author", manga.getAuthor());
        intent.putExtra("Images", manga.getImage());

        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}

