package com.example.eva1_7_transicion;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView img=findViewById(R.id.imageView);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this, Main2Activity.class);
                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, img, ViewCompat.getTransitionName(img));
                startActivity(in, options.toBundle());
            }
        });
    }
}
