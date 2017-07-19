package com.jam.recyclervieweasy;

import android.view.View;

import com.jam.recyclervieweasy.grid.GridActivity;
import com.jam.recyclervieweasy.linear.LinearActivity;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @OnClick({R.id.btn_linear})
    public void onClickLinearBtn(View view) {
        LinearActivity.startMyself(this, LinearActivity.class);
    }

    @OnClick(R.id.btn_grid)
    public void onClickGridBtn() {
        GridActivity.startMyself(this, GridActivity.class);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
