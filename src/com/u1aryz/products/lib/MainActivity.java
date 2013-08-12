package com.u1aryz.products.lib;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

import com.u1aryz.products.lib.view.BounceListView;

public class MainActivity extends Activity {

    BounceListView listView;

    static final String[] SAMPLE_DATAS = new String[] { "a", "b", "c", "d",
            "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (BounceListView) findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, SAMPLE_DATAS));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
