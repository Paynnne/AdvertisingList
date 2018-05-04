package com.vayne.advertisinglist.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.vayne.advertisinglist.R;

/**
 * @Author: chupengda
 * @CreateDate: 2018/5/4
 * @Description: ViewHolder
 */
public class RecyclerImageViewHolder extends RecyclerView.ViewHolder {

    public ImageView scrollingImageView;

    public RecyclerImageViewHolder(View itemView) {
        super(itemView);
        scrollingImageView = itemView.findViewById(R.id.layout_recycleview_item_scrollimageview);

    }
}
