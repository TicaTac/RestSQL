package clm.restsql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jbt on 7/17/2016.
 */
public class MyDbCommands {
    Context c;
    MySQLDbHelper helper;

    public MyDbCommands(Context c) {
        this.c = c;
        helper=new MySQLDbHelper(c);
    }

    public void addRestraunt(veganRest Restraunt)
    {
        int isVegan = (Restraunt.isVegan() ? 1: 0 );

        // Save SQL Query with ContentValues
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.REST_NAME,Restraunt.getRestname());
        contentValues.put(DBConstants.REST_ADDRESS,Restraunt.getAddress());
        contentValues.put(DBConstants.IS_VEGAN, isVegan);

        helper.getWritableDatabase().insert(DBConstants.DATABASE_TABLE,null,contentValues);
        Toast.makeText(c, "added "+Restraunt.getRestname() ,Toast.LENGTH_SHORT).show();


    }



    public ArrayList<veganRest> getAllRestraunts ()
    {
        ArrayList<veganRest> allRestraunts= new ArrayList<veganRest>();
        //best practice -- get a cursor from the
        Cursor cursor = helper.getReadableDatabase().query(DBConstants.DATABASE_TABLE,null,null,null,null,null,null);

        while (cursor.moveToNext()){
            veganRest currentRestraunt;
            int nameColumn = cursor.getColumnIndexOrThrow(DBConstants.REST_NAME);
            String restName= cursor.getString(nameColumn);

            int addressColumn = cursor.getColumnIndexOrThrow(DBConstants.REST_ADDRESS);
            String addressName= cursor.getString(addressColumn);

            int isVeganColumn = cursor.getColumnIndexOrThrow(DBConstants.IS_VEGAN);
            boolean isVegan= cursor.getInt(isVeganColumn)==1;
            currentRestraunt=new veganRest(restName,addressName,isVegan);
            allRestraunts.add(currentRestraunt );
        }

        return allRestraunts;

    }



}
