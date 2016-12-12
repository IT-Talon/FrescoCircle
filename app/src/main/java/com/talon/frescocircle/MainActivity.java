package com.talon.frescocircle;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    private SimpleDraweeView iconImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iconImg = (SimpleDraweeView) findViewById(R.id.img_icon);
        Uri uri = Uri.parse("http://qlogo1.store.qq.com/qzone/731838568/731838568/100?1365354959");
        iconImg.setImageURI(uri);
        iconImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "lalala", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
