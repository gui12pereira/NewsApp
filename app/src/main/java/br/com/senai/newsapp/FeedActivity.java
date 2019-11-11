package br.com.senai.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pkmmte.pkrss.Article;
import com.pkmmte.pkrss.PkRSS;

import java.util.List;

public class FeedActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private List<Article> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(adapter);

        PkRSS.with(this.load("http://www.androidpro.com.br/feed/")skip.Cache().callback().async)

    }
}
