package android.frontend.h.eartbe.at.heartbeat;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ListView listViewBeats;
    private ArrayList<Beat> beats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupData();
        setupCustomList();
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Heartbeat");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Intent intentAbout = new Intent(Main2Activity.this, AboutActivity.class);
                startActivity(intentAbout);
                return true;
            case R.id.action_settings:
                Intent intentSettings = new Intent(Main2Activity.this, SettingsActivity.class);
                startActivity(intentSettings);
                return true;
          /*  case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;*/
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
    private void setupData () {
        beats = new ArrayList<Beat>();
        beats.add(new Beat(22,"maaaaa"));
        beats.add(new Beat(33,"mbbbb"));
        beats.add(new Beat(44,"mcccc"));
    }

    /**
     * sets up the customized list
     */
    private void setupCustomList() {

        CustomizedListAdapter customizedListAdapter = new CustomizedListAdapter(this, beats);

        listViewBeats = (ListView) findViewById(R.id.listView);

        listViewBeats.setAdapter(customizedListAdapter);


        listViewBeats.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(Main2Activity.this, conversation.class);
                startActivity(intent);
            }
        });

    }



}
