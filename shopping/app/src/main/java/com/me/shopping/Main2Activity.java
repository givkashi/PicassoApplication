package com.me.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class Main2Activity extends AppCompatActivity {
    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        img=findViewById(R.id.img);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // Picasso.with(Main2Activity.this).load("http://127.0.0.1/Flowers/photos/bonsai.jpg").into(img);
              Picasso.with(Main2Activity.this).load("http://res.cloudinary.com/oclemy/image/upload/v1460355640/crisis_m1btcv.jpg").error(R.mipmap.ic_launcher).into(img, new Callback() {
                    @Override
                    public void onSuccess() {
                        Log.d("TAG", "onSuccess");
                    }

                    @Override
                    public void onError() {
                        Toast.makeText(getApplicationContext(), "An error occurred", Toast.LENGTH_SHORT).show();
                    }
                });

            }
                //Glide.with(Main2Activity.this).load("http://192.168.1.39/Flowers/photos/bonsai.jpg").into(img);
               // Picasso.with(Main2Activity.this).load("https://192.168.1.39/Flowers/photos/bonsai.jpg").into(img);

        });

       // Picasso.with(Main2Activity.this).load("http://127.0.0.1/Flowers/photos/bonsai.jpg").into(img);


    }

}
