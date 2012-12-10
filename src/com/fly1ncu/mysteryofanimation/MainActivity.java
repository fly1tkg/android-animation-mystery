
package com.fly1ncu.mysteryofanimation;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private List<Mystery> mMysteries = new ArrayList<Mystery>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addMysteries();
        setupList();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        startActivity(new Intent(this, mMysteries.get(position).cls));
    }

    private void addMysteries() {
        mMysteries.add(new Mystery(R.string.mystery1, Mystery1Activity.class));
        mMysteries.add(new Mystery(R.string.mystery2, Mystery2Activity.class));
    }

    private void setupList() {
        List<String> titles = new ArrayList<String>();
        for (Mystery recipe : mMysteries) {
            titles.add(getString(recipe.resId));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, titles);
        setListAdapter(adapter);
    }

    class Mystery {
        int resId;
        Class<?> cls;

        Mystery(int resId, Class<?> cls) {
            this.resId = resId;
            this.cls = cls;
        }
    }

}
