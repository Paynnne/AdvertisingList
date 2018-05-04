package com.vayne.advertisinglist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.vayne.advertisinglist.R;
import com.vayne.advertisinglist.adapter.viewholder.RecyclerImageViewHolder;
import com.vayne.advertisinglist.adapter.viewholder.RecyclerListViewHolder;

import java.util.List;

/**
 * @Author: chupengda
 * @CreateDate: 2018/5/4
 * @Description:
 */

public class RecyclerListViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<String> list;
    private RecyclerListViewHolder holder;

    public RecyclerListViewAdapter(Context context) {
        this.context = context;
    }

    //设置数据
    public void setData(List<String> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout_recyclerview_item, parent, false);
            return new RecyclerListViewHolder(view);
        } else if (viewType == 1) {
            View view2 = LayoutInflater.from(context).inflate(R.layout.layout_recyclerview_image_item, parent, false);
            return new RecyclerImageViewHolder(view2);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 1) {
            ((RecyclerImageViewHolder) holder).scrollingImageView.setImageResource(R.mipmap.one);
        } else {
            ((RecyclerListViewHolder) holder).title.setText(list.get(position));
        }
    }

    @Override
    public int getItemViewType(int position) {
        // Just as an example, return 0 or 2 depending on position
        // Note that unlike in ListView adapters, types don't have to be contiguous
        return position == 7 ? 1 : 0;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
