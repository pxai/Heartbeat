package android.frontend.h.eartbe.at.heartbeat;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageItem extends BaseAdapter {

    private Activity activity;
    private ArrayList<Message> messages;

    /**
     * Constructor
     *
     * @param activity
     * @param messages
     */
    public MessageItem(Activity activity, ArrayList<Message> messages) {
        super();
        this.activity = activity;
        this.messages = messages;
    }


    /**
     * return number of items
     * @return int
     */
    public int getCount() {
        // TODO Auto-generated method stub
        return messages.size();
    }

    /**
     * returns one object in a given position
     * @param position
     * @return Object
     */
    public Object getItem(int position) {
        return messages.get(position);
    }

    /**
     * returns id for the custom_list_item(position)
     */
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * for each list custom_list_item it call this method to render it in the ListView
     * @param position
     * @param convertView
     * @param parent
     * @result View
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        int icons[] = { android.R.drawable.ic_dialog_info,
                android.R.drawable.ic_dialog_info,
                android.R.drawable.ic_dialog_alert,
                android.R.drawable.ic_dialog_email};
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_message_item,null);
        }

        Message message = messages.get(position);
        Log.d("PELLODEBUG", message.toString());


        TextView textViewTitle = (TextView) view.findViewById(R.id.textViewName);
        textViewTitle.setText(message.getText().toString());

        TextView textViewText = (TextView) view.findViewById(R.id.textViewDescription);
        textViewText.setText(message.getDate().toString());



        return view;


    }





}