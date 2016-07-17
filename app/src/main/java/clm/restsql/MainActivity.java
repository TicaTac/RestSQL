package clm.restsql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //openList BTN
        Button openListBTN = (Button) findViewById(R.id.showListBTN);
        openListBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ListActivity.class);
                startActivityForResult(intent,1);
            }
        });
        Button addBTN = (Button) findViewById(R.id.addBTN);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameET = (EditText) findViewById(R.id.nameET);
                EditText addressET = (EditText) findViewById(R.id.addressET);
                EditText veganET= (EditText) findViewById(R.id.veganET);

                MyDbHelper db= new MyDbHelper(MainActivity.this);

                String query = "INSERT INTO VeganRest (Name , Address , Friendly) VALUES (‘"+nameET.getText()+"’ ,’ "+ addressET.getText()+"’, "+veganET.getText()+");";
                Toast.makeText(MainActivity.this, query, Toast.LENGTH_LONG).show();
                db.getWritableDatabase().execSQL(query);
                Toast.makeText(MainActivity.this, query, Toast.LENGTH_LONG).show();
            }
        });



    }
}
