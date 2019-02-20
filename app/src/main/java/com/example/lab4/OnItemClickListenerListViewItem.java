/*
package com.example.lab4;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


*/
/*
 * Here you can control what to do next when the user selects an item
 *//*



public class OnItemClickListenerListViewItem implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Context context = view.getContext();

            ListView listViewItem = ((ListView) view.findViewById(R.id.visualDisplayList));

            // get the clicked item name
            String listItemText = listViewItem.getText().toString();

            // get the clicked item ID
            String listItemId = listViewItem.getTag().toString();

            // just toast it
            Toast.makeText(context, "Item: " + listItemText + ", Item ID: " + listItemId, Toast.LENGTH_SHORT).show();

            ((ListViewChat) context).alertDialogStores.cancel();

        }

    }

*/
