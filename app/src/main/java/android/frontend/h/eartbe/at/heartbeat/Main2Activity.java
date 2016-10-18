package android.frontend.h.eartbe.at.heartbeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
