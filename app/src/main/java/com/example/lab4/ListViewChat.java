package com.example.lab4;

public class ListViewChat extends MainActivity { }
  /*  // ADDED WEDNESDAY
        AlertDialog alertDialogStores;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_view_row_item);

            // a button to show the pop up with a list view
            View.OnClickListener handler = new View.OnClickListener(){
                public void onClick(View v) {
                    switch (v.getId()) {

                        case R.id.textViewItem12:
                            showPopUp();
                            break;
                    }
                }
            };

            findViewById(R.id.textViewItem12).setOnClickListener(handler);

        }

        public void showPopUp(){

            // add your items, this can be done programatically
            // your items can be from a database
            ObjectItem[] ObjectItemData = new ObjectItem[20];

            ObjectItemData[0] = new ObjectItem(91, "Mercury");
            ObjectItemData[1] = new ObjectItem(92, "Watson");
            ObjectItemData[2] = new ObjectItem(93, "Nissan");
            ObjectItemData[3] = new ObjectItem(94, "Puregold");
            ObjectItemData[4] = new ObjectItem(95, "SM");
            ObjectItemData[5] = new ObjectItem(96, "7 Eleven");
            ObjectItemData[6] = new ObjectItem(97, "Ministop");
            ObjectItemData[7] = new ObjectItem(98, "Fat Chicken");
            ObjectItemData[8] = new ObjectItem(99, "Master Siomai");
            ObjectItemData[9] = new ObjectItem(100, "Mang Inasal");
            ObjectItemData[10] = new ObjectItem(101, "Mercury 2");
            ObjectItemData[11] = new ObjectItem(102, "Watson 2");
            ObjectItemData[12] = new ObjectItem(103, "Nissan 2");
            ObjectItemData[13] = new ObjectItem(104, "Puregold 2");
            ObjectItemData[14] = new ObjectItem(105, "SM 2");
            ObjectItemData[15] = new ObjectItem(106, "7 Eleven 2");
            ObjectItemData[16] = new ObjectItem(107, "Ministop 2");
            ObjectItemData[17] = new ObjectItem(108, "Fat Chicken 2");
            ObjectItemData[18] = new ObjectItem(109, "Master Siomai 2");
            ObjectItemData[19] = new ObjectItem(110, "Mang Inasal 2");

            // our adapter instance
            ArrayAdapterItem adapter = new ArrayAdapterItem(this, R.layout.list_view_row_item, ObjectItemData);

            // create a new ListView, set the adapter and item click listener
            ListView listViewItems = new ListView(this);
            listViewItems.setAdapter(adapter);
            listViewItems.setOnItemClickListener(new OnItemClickListenerListViewItem());

            // put the ListView in the pop up
            alertDialogStores = new AlertDialog.Builder(ListViewChat.this)
                    .setView(listViewItems)
                    .setTitle("Stores")
                    .show();

        }

    }






























































       /*



        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_listview);


            // Array of strings...
            String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
                    "WebOS", "Ubuntu", "Windows7", "Max OS X"};

            // ORIGINAL: adapter = new ArrayAdapter<String>(ListViewChat.this, R.layout.activity_listview, R.id.mobile_list, mobileArray);
            ListView listView = (ListView) findViewById(R.id.mobile_list);
            ListAdapter adapter;
            listView.setAdapter(adapter);
*/
/*
            SpinnerAdapter adapter = new SpinnerAdapter(new AdapterView.adapter) {
                @Override
                public View getDropDownView(int position, View convertView, ViewGroup parent) {
                    return null;
                }

                @Override
                public void registerDataSetObserver(DataSetObserver observer) {

                }

                @Override
                public void unregisterDataSetObserver(DataSetObserver observer) {

                }

                @Override
                public int getCount() {
                    return 0;
                }

                @Override
                public Object getItem(int position) {
                    return null;
                }

                @Override
                public long getItemId(int position) {
                    return 0;
                }

                @Override
                public boolean hasStableIds() {
                    return false;
                }

                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    return null;
                }

                @Override
                public int getItemViewType(int position) {
                    return 0;
                }

                @Override
                public int getViewTypeCount() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }
            };}

        }

/*
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

    /*

public class ListViewChat extends ArrayAdapter<mobileArray> {

    SpinnerAdapter spinnerAddToListAdapter = new SpinnerAdapter(MyActivity.this, R.id.text_view, new ArrayList<>());



    private Context context;
    private List<mobileArray> mobileArray;

    public ListViewChat(Context context, int mobile_list,
                        List<mobileArray> mobileArray) {

        //Pass in the resource id:  R.id.text_view
        super(context, mobile_list, mobileArray);

        this.context = context;
        this.values = mobileArray;
    }
} */