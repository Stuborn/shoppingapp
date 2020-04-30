package com.example.shopping.type.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.shopping.base.BaseFragment;

import static android.content.ContentValues.TAG;

/**
 * 分类
 */

public class TypeFragment extends BaseFragment {

    private TextView textView;

    @Override
    public View initView() {
        Log.e(TAG,"分类页面的Fragment ui被初始化");

        textView = new TextView(my_Context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;

    }

    @Override
    public void initData() {
        super.initData();
        Log.e(TAG,"分类页面的Fragment 数据被初始化");
        textView.setText("分类页面内容");
    }
}
