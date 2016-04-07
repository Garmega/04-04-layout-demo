package edu.uw.layoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "LAYOUT_DEMO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView)findViewById(R.id.image);
        image.setImageResource(R.drawable.android_maneki);
    }
}
