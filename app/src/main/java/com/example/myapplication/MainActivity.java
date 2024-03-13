package com.example.myapplication;

import static com.example.myapplication.R.id.button;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView infoTextView;
    private ListView listView;
    private Button button;
    private ImageView imageView;
    private ProgressBar progressBar;
    private LinearLayout hybridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoTextView = findViewById(R.id.infoTextView);
        listView = findViewById(R.id.listView);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        progressBar = findViewById(R.id.progressBar);
        hybridLayout = findViewById(R.id.hybridLayout);

        // Widget Informasi
        infoTextView.setText("Informasi: Ini adalah contoh widget informasi");

        // Widget Koleksi
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Item 1");
        dataList.add("Item 2");
        dataList.add("Item 3");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);

        // Widget Kontrol
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi yang ingin dilakukan saat tombol diklik
                toggleVisibility();
            }
        });
    }

    private void toggleVisibility() {
        // Widget Hibrida
        if (imageView.getVisibility() == View.VISIBLE) {
            imageView.setVisibility(View.INVISIBLE);
            progressBar.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.INVISIBLE);
        }
    }
}