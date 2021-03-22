package com.example.demo_to319.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo_to319.R;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

//public class MuAdapter extends BaseMultiItemQuickAdapter<UserBean,BaseViewHolder> {
public class MuAdapter extends BaseMultiItemQuickAdapter{
    public MuAdapter() {
        addItemType(UserBean.TYPE_HOME,R.layout.item_home);
        addItemType(UserBean.TYPE_PERSONAL,R.layout.item_user);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

//    @Override
//    protected void convert(@NotNull BaseViewHolder holder, UserBean item) {
//        holder.setText(R.id.tv_name,item.getName());
//        switch (holder.getItemViewType()){
//            case UserBean.TYPE_HOME:
//                holder.setText(R.id.tv_context,item.getContext())
//                        .setText(R.id.tv_writer,item.getWriter());
//                break;
//            case UserBean.TYPE_PERSONAL:
//                holder.setText(R.id.tv_age,item.getAge());
//                holder.setText(R.id.tv_sex,item.getSex());
//                break;
//            default:
//                break;
//        }
//
//    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, Object o) {

    }
}
