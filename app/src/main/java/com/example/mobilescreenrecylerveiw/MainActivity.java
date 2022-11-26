package com.example.mobilescreenrecylerveiw;

import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        ArrayList<Object> productList = new ArrayList<>();


        //adding some items to our list



        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                        ));

        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));
        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));

        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                )); productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));

        productList.add(
                new Product(
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        "FaceBook",
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb,
                        R.drawable.fb
                ));



        ProductAdapter adapter = new ProductAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}