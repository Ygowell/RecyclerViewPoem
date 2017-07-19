package com.jam.recyclervieweasy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by jam on 17/7/19.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initContentView();
    }

    protected abstract int getLayoutId();

    protected void initContentView() {

    }

    public static <T> void startMyself(Context context, Class<? extends Activity> tClass) {
        Intent intent = new Intent(context, tClass);
        context.startActivity(intent);
    }
}
