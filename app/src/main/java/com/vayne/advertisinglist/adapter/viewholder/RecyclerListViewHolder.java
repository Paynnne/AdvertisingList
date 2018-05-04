package com.vayne.advertisinglist.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.vayne.advertisinglist.R;

/**
 * @Author: chupengda
 * @CreateDate: 2018/5/4
 * @Description: ViewHolder
 */
public class RecyclerListViewHolder extends RecyclerView.ViewHolder {

    public ImageView iv;
    public TextView title;
    public LinearLayout llGone;

    public RecyclerListViewHolder(View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.layout_recycleview_item_iv);
        title = itemView.findViewById(R.id.layout_recycleview_item_tvtitle);
        llGone = itemView.findViewById(R.id.layout_recycleview_item_llgone);

    }
}
