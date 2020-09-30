package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void clickit(View buttonView)
    {
//        EditText ptxt=findViewById(R.id.edtname);
//        Log.i("NAME",ptxt.getText().toString());
//        EditText phone=findViewById(R.id.phn);
//        Log.i("NUMBER",phone.getText().toString());
//        Toast.makeText(MainActivity.this,"UR NAME IS:"+ptxt.getText().toString()+"\n"+"AND UR PHONE NUMBER :"+phone.getText().toString(),Toast.LENGTH_SHORT).show();

        ImageView myimage = findViewById(R.id.imageView3);
        myimage.setImageResource(R.drawable.highrise);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
