package com.u1aryz.products.lib.view;

import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.OverScroller;

/**
 * A simple list view to bounce.
 * 
 * @author u1aryz
 * 
 */
public class BounceListView extends AdapterView<ListAdapter> implements
        OnTouchListener {

    /** Used to identify the source of a log message. */
    static final String TAG = BounceListView.class.getName();

    /** The overshoot the bounds of a scrolling operation. */
    OverScroller mScroller;

    /** The adapter with all the data. */
    ListAdapter mAdapter;

    /** Detects various gestures and events using the supplied MotionEvents. */
    GestureDetector mGestureDetector;

    /** A list of cached (re-usable) item views. */
    final List<View> mCachedItemViews = new LinkedList<View>();

    /**
     * Constructor.
     * 
     * @param context
     */
    public BounceListView(Context context) {
        this(context, null);
    }

    /**
     * Constructor.
     * 
     * @param context
     * @param attrs
     */
    public BounceListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * Constructor.
     * 
     * @param context
     * @param attrs
     * @param defStyle
     */
    public BounceListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    void init() {
        mScroller = new OverScroller(getContext());
        mGestureDetector = new GestureDetector(getContext(), mGestureListener);
        setOnTouchListener(this);
    }

    @Override
    public ListAdapter getAdapter() {
        return mAdapter;
    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setAdapter(ListAdapter adapter) {
        mAdapter = adapter;
    }

    @Override
    public void setSelection(int position) {
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return mGestureDetector.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public void computeScroll() {
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right,
            int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    /**
     * A convenience class to extend when you only want to listen for a subset
     * of all the gestures.
     */
    final SimpleOnGestureListener mGestureListener = new SimpleOnGestureListener() {

        @Override
        public boolean onDown(MotionEvent e) {
            Log.d(TAG, "onDown y:: " + e.getY());
            return true;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                float velocityY) {
            Log.d(TAG, "onFling velocityY:: " + velocityY);
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2,
                float distanceX, float distanceY) {
            Log.d(TAG, "onScroll distanceY:: " + distanceY);
            return super.onScroll(e1, e2, distanceX, distanceY);
        }
    };
}
