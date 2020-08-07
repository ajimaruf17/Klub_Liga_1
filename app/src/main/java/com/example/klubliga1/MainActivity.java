package com.example.klubliga1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKlub;
    private ArrayList<Klub> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKlub = findViewById(R.id.rv_klub);
        rvKlub.setHasFixedSize(true);

        list.addAll(KlubData.getListData());
        showRecyclerList();
    }


    private void showRecyclerList(){
        rvKlub.setLayoutManager(new LinearLayoutManager(this));
        ListKlubAdapter listKlubAdapter = new ListKlubAdapter(list);
        rvKlub.setAdapter(listKlubAdapter);

        listKlubAdapter.setOnItemClickCallback(new ListKlubAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Klub klub) {
                Intent moveIntent = new Intent(MainActivity.this, Persib.class);
                moveIntent.putExtra(Persib.ITEM_EXTRA, klub);
                startActivity(moveIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, About.class);
                startActivity(moveIntent);
                break;
        }
    }
}