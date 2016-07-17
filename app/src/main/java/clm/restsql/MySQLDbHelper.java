package clm.restsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jbt on 7/17/2016.
 */
public class MySQLDbHelper extends SQLiteOpenHelper {
    public MySQLDbHelper(Context context) {
        super(context, DBConstants.DATABASE_FILE , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createCommand = "CREATE TABLE VeganRest ( _id    INTEGER PRIMARY KEY AUTOINCREMENT," +
                " "+ DBConstants.REST_NAME +" TEXT," +
                " "+ DBConstants.REST_ADDRESS+" TEXT, " +
                " "+ DBConstants.IS_VEGAN+" INTEGER)";

        db.execSQL(createCommand);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
