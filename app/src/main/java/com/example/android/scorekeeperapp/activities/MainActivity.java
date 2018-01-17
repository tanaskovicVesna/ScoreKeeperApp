package com.example.android.scorekeeperapp.activities;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.scorekeeperapp.R;
import com.example.android.scorekeeperapp.dialog.AboutDialog;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    String[] sports = { "Basketball", "Handball", "Hockey", "Soccer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sports));
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.about) {
            AlertDialog alertDialog = new AboutDialog(this).prepareDialog();
            alertDialog.show();
            alertDialog.getWindow().setBackgroundDrawableResource(R.color.colorPrimary);
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent;
        switch (position) {
            case 0:
                intent= new Intent(this,BasketballActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent=new Intent(this,HandballActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent=new Intent(this,HockeyActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent=new Intent(this,SoccerActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


}

