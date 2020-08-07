package com.example.klubliga1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Persib extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persib);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);
        TextView tvDidirikan = findViewById(R.id.tv_item_didirikan);
        TextView tvPelatih = findViewById(R.id.tv_item_pelatih);
        TextView tvBasis = findViewById(R.id.tv_item_basis);
        TextView tvStadion = findViewById(R.id.tv_item_stadion);
        ImageView imgStadion = findViewById(R.id.img_item_stadion);

        Klub klub = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (klub != null) {
            Glide.with(this).load(klub.getPhoto()).into(imgItemPhoto);
            Glide.with(this).load(klub.getStadion()).into(imgStadion);
            tvName.setText(klub.getName());
            tvDetail.setText(klub.getDetail());
            tvDidirikan.setText(klub.getBerdiri());
            tvPelatih.setText(klub.getManajer());
            tvBasis.setText(klub.getBasis());
            tvStadion.setText(klub.getNamastadion());
        }

            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setTitle("Klub Detail");
            }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}