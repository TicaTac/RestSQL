package clm.restsql;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<veganRest> allRestraunts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //myDbCommands
        MyDbCommands dbhelper = new MyDbCommands(this);
        allRestraunts=dbhelper.getAllRestraunts();

        // Catch ListView

        ListView lv = (ListView) findViewById(R.id.listView);

        // Connect to ListView

        MySQLDbHelper helper = new MySQLDbHelper(this);
        Cursor cursor = helper.getReadableDatabase().rawQuery("SELECT * FROM "+DBConstants.DATABASE_TABLE,null);

        String[] from = {DBConstants.REST_NAME,DBConstants.REST_ADDRESS};
        int[] to = { R.id.nameTV, R.id.addressTV};

       // SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,R.layout.single_item_1, cursor,from,to);
        veganRestAdapter myAdapter = new veganRestAdapter(this,R.layout.activity_list,allRestraunts);

        lv.setAdapter(myAdapter);




    }
}
