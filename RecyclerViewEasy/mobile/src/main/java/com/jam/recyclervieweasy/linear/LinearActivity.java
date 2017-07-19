package com.jam.recyclervieweasy.linear;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jam.recyclervieweasy.BaseActivity;
import com.jam.recyclervieweasy.R;

import butterknife.BindView;

public class LinearActivity extends BaseActivity {

    @BindView(R.id.linear_recycler_view)
    public RecyclerView mLinearRecyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_linear;
    }

    @Override
    protected void initContentView() {
        mLinearRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mLinearRecyclerView.setAdapter(new LinearRecyclerAdapter(this,
                getResources().getStringArray(R.array.names)));
    }
}
