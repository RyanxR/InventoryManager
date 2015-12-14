package com.daafdroid.steventory;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity1 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SQLiteDatabase database;
        SimpleCursorAdapter cursorAdapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1);

        DBHandler myDBHandler=new DBHandler(this, null, null, 1);
        database = myDBHandler.getWritableDatabase();

        //Get the ListView to populate
        ListView listViewToPopulate = getListView();

        //Fill cursor with some data
        Cursor dataCursor = database.rawQuery("SELECT * FROM products", null);

        //Define table columns we want to use to populate our ListView, as defined in DBHandler class
        String[] columns = new String[] {
                //myDBHandler.ROW_ID,
                myDBHandler.ROW_PRODUCTNAME,
                myDBHandler.ROW_MANUFACTURER,
                myDBHandler.ROW_QUANTITY,
        };

        //the XML defined views which the data will be bound to (Defined in entry.xml)
        int[] to = new int[] {
                R.id.productName,
                R.id.manufacturer,
                R.id.stockAmount
        };

        //Create SimpleCursorAdapter to populate ListView with database records
        cursorAdapter = new SimpleCursorAdapter(this, R.layout.entry, dataCursor, columns, new int[]{R.id.productName, R.id.manufacturer, R.id.stockAmount}, 0);

        listViewToPopulate.setHeaderDividersEnabled(true);

        setListAdapter(cursorAdapter);
    }

    public void addNewProduct(View view) {
    //This method is called when button with id "btn_" is clicked

        Toast.makeText(MainActivity1.this, "BUTTON NEW PRODUCT CLICKED", Toast.LENGTH_SHORT).show();
    }
}