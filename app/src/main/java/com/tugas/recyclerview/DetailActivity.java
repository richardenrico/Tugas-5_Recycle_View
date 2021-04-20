package com.tugas.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView ivBackBtn, ivMangaImg, ivCoverImg;
    TextView tvMangaSynopsis, tvMangaTitle, tvMangaAuthor, tvExpandableBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent getter = getIntent();
        String title = getter.getStringExtra("Title");
        String synopsis = getter.getStringExtra("Synopsis");
        String author = getter.getStringExtra("Author");
        int images = getter.getIntExtra("Images", 0);

        ivBackBtn = findViewById(R.id.iv_back_icon);
        ivBackBtn.setOnClickListener(v -> {
            Intent intent = new Intent(DetailActivity.this, MainActivity.class);
            startActivity(intent);
        });

        ivMangaImg = findViewById(R.id.iv_manga_image);
        ivMangaImg.setBackgroundResource(images);

        ivCoverImg = findViewById(R.id.iv_cover_img);
        ivCoverImg.setImageResource(images);

        tvMangaTitle = findViewById(R.id.tv_manga_title);
        tvMangaTitle.setText(title);

        tvMangaSynopsis = findViewById(R.id.tv_manga_synopsis);
        tvMangaSynopsis.setText(synopsis);
        tvMangaSynopsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandableTextView();
            }
        });

        tvMangaAuthor = findViewById(R.id.tv_manga_author);
        tvMangaAuthor.setText(author);

        tvExpandableBtn = findViewById(R.id.tv_expandableBtn);
        tvExpandableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandableTextView();
            }
        });
    }

    private void expandableTextView() {
        if (tvExpandableBtn.getText().toString().equalsIgnoreCase("less")){
            tvMangaSynopsis.setMaxLines(2);
            tvExpandableBtn.setText("more");
        } else {
            tvMangaSynopsis.setMaxLines(Integer.MAX_VALUE);
            tvExpandableBtn.setText("less");
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
    }
}