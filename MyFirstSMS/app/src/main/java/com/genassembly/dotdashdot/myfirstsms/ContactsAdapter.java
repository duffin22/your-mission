package com.genassembly.dotdashdot.myfirstsms;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Mauve3 on 7/7/16.
 */
public class ContactsAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private final Cursor contacts;

    public ContactsAdapter(Context context, Cursor contacts) {
        inflater = LayoutInflater.from(context);
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.getCount();
    }

    @Override
    public Object getItem(int position) {
        return contacts.moveToPosition(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Log.d("SimpleAdapter: " , "Position: " + position);

        View v = convertView;
        TextView id, name, number;

        if (v == null) {

            v = inflater.inflate(R.layout.contact_list_item, parent, false);
        }

        id = (TextView) v.findViewById(R.id.identity);
        name = (TextView) v.findViewById(R.id.name);
        number = (TextView) v.findViewById(R.id.number);

        contacts.moveToPosition(position);

        id.setText(contacts.getString(contacts.getColumnIndexOrThrow("_id")));
        name.setText(contacts.getString(contacts.getColumnIndexOrThrow("display_name")));
        number.setText(contacts.getString(contacts.getColumnIndexOrThrow("data1")));


        return v;
    }
}
