package clm.restsql;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        Cursor cursor = helper.getReadableDatabase().rawQuery("SELECT * FROM VeganRest",null);


    }
}
