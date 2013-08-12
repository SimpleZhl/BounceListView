package com.u1aryz.products.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public class BounceListView extends AdapterView<ListAdapter> {

    public BounceListView(Context context) {
        this(context, null);
    }

    public BounceListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BounceListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public ListAdapter getAdapter() {
        return null;
    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setAdapter(ListAdapter adapter) {
    }

    @Override
    public void setSelection(int position) {
    }

}
