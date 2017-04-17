package com.example.anshul.listviewwork;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    // Array of strings...
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//registerClickCallback();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mobileArray); // standard row layout provided by androidmobileArray)

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

    }
}