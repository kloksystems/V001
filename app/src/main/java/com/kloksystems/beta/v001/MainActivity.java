package com.kloksystems.beta.v001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Runnable;

import com.kloksystems.beta.v001.com.kloksystems.beta.v001.utils.JsonClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {

            @Override
            public void run() {

            // Do network action in this function
                JsonClient jsc = new JsonClient();
                String jsonString = jsc.executePost("http://kloksystems.com/scripts/jsonServer.php", "");
            }

        }).start();

    }
}
