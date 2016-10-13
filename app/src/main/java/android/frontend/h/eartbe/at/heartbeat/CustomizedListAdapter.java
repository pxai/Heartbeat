package android.frontend.h.eartbe.at.heartbeat;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Asier on 13/10/2016.
 */

public class CustomizedListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Beat> beats;

    /**
     * Constructor
     *
     * @param activity
     * @param beats
     */
    public CustomizedListAdapter(Activity activity, ArrayList<Beat> beats) {
        super();
        this.activity = activity;
        this.beats = beats;
    }


    /**
     * return number of items
     * @return int
     */
    public int getCount() {
        // TODO Auto-generated method stub
        return beats.size();
    }

    /**
     * returns one object in a given position
     * @param position
     * @return Object
     */
    public Object getItem(int position) {
        return beats.get(position);
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
            view = inflater.inflate(R.layout.custom_list_item,null);
        }

        Beat beat = beats.get(position);
        Log.d("PELLODEBUG", beat.toString());

        ImageView imageViewIcon = (ImageView) view.findViewById(R.id.imageViewIcon);
        imageViewIcon.setImageResource(R.drawable.heartbeat);

        TextView textViewTitle = (TextView) view.findViewById(R.id.textViewName);
        textViewTitle.setText(beat.getIdfrom());

        TextView textViewText = (TextView) view.findViewById(R.id.textViewDescription);
        textViewText.setText(beat.getMessage());


        return view;


    }





}