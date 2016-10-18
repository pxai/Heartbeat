package android.frontend.h.eartbe.at.heartbeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Date;
import java.util.ArrayList;

public class conversation extends AppCompatActivity {
    private ListView listViewMessages;
    private ArrayList<Message> message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
        setupData();
        setupCustomList();
    }

    private void setupData() {
        message = new ArrayList<Message>();
        message.add(new Message("Mensage1Mio", new Date(2,2,2), true));
        message.add(new Message("Mensage2Mio", new Date(2,2,2), true));
        message.add(new Message("Mensage3Mio",new Date(2,2,2), true));
        message.add(new Message("mensage1Otro", new Date(2,2,2), false));
        message.add(new Message("mensage2Otro", new Date(2,2,2), false));
        message.add(new Message("mensage3Otro", new Date(2,2,2), false));
    }

    /**
     * sets up the customized list
     */
    private void setupCustomList() {

        MessageItem messageItem = new MessageItem(this, message);

        listViewMessages = (ListView) findViewById(R.id.listViewMessage);

        listViewMessages.setAdapter(messageItem);


        listViewMessages.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(conversation.this, "You pressed " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}