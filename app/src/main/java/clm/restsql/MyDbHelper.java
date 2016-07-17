package clm.restsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jbt on 7/17/2016.
 */
public class MyDbHelper extends SQLiteOpenHelper {
    public MyDbHelper(Context context) {
        super(context, "veganRest.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createCommand = "CREATE TABLE VeganRest (_id integer primary key, Name text, Address text, Friendly integer);";
        db.execSQL(createCommand);


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
