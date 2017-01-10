package com.oblivion.workdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btNext)
    Button btNext;
    @Bind(R.id.btCrash)
    Button btCrash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btNext, R.id.btCrash})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btNext:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.btCrash:
                int i = 9;
                System.out.println(i / 0);
                break;
        }
    }
}
