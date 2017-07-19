package com.jam.recyclervieweasy.grid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jam.recyclervieweasy.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jam on 17/7/19.
 */

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.GridViewHolder> {

    private static Context mContext;
    private String[] mNames;

    public GridRecyclerAdapter(Context context, String[] names) {
        mContext = context;
        mNames = names;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(mContext)
                .inflate(R.layout.item_grid, parent, false));
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        holder.nameTv.setText(mNames[position]);
    }

    @Override
    public int getItemCount() {
        if (mNames == null) {
            return 0;
        }
        return mNames.length;
    }

    public static class GridViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name)
        TextView nameTv;

        public GridViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "OnClick ---> " + getPosition(), Toast.LENGTH_SHORT).show();;
                }
            });
        }
    }
}
