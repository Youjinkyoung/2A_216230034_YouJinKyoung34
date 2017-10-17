package com.example.hywoman.a2a_216230034_youjinkyoung;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by hywoman on 2017-10-16.
 */

public class SubActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceSstate){
        super.onCreate(savedInstanceSstate);
        setContentView(R.layout.activity_sub);
    }

    public void onClick(View view){
        finish();
    }
}
