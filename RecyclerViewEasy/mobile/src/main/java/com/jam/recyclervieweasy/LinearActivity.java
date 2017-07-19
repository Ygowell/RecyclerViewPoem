package com.jam.recyclervieweasy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LinearActivity extends AppCompatActivity {

    @BindView(R.id.linear_recycler_view)
    public RecyclerView mLinearRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        ButterKnife.bind(this);

        mLinearRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mLinearRecyclerView.setAdapter(new LinearRecyclerAdapter(this,
                getResources().getStringArray(R.array.names)));
    }

    public static void startMyself(Context context) {
        Intent intent = new Intent(context, LinearActivity.class);
        context.startActivity(intent);
    }
}
