package com.sourcey.givetime;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sourcey.materiallogindemo.R;


public class answer4earth extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

// program starts here
// create string array called attraction
        String[ ] attraction={"   answer4earth website"};
// create new list adapter (shows list of items set to array)
// an adapter provides a data model for the layout of the list
// you will need to import ArrayAdapter by pressing Alt + Enter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_answer4earth, R.id.earth, attraction));
    }



    // click event for listview control called travel
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.answer4earth.com")));
                break;

        }
    }


}

