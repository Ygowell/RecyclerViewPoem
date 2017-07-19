package com.jam.recyclervieweasy.grid;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jam.recyclervieweasy.BaseActivity;
import com.jam.recyclervieweasy.R;

import butterknife.BindView;

public class GridActivity extends BaseActivity {

    @BindView(R.id.grid_recycler_view)
    RecyclerView mGridRecyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_grid;
    }

    @Override
    protected void initContentView() {
        mGridRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mGridRecyclerView.setAdapter(new GridRecyclerAdapter(this,
                getResources().getStringArray(R.array.names)));
    }
}
