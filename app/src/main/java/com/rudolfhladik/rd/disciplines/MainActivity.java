package com.rudolfhladik.rd.disciplines;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rudolfhladik.rd.disciplines.adapters.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends Activity {

    private LinearLayout leftDrawer;
    private RelativeLayout drawerRelativeLayout;
    private ListView drawerListView;
    private ListView drawerMenuListView;
    private DrawerItem[] drawerItems;
    private DrawerItem[] drawerMenuItems;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    private ExpandableListView mExpListView;
    private ExpandableListAdapter mExpListAdapter;
    private List<String> mListDataHeader;
    private HashMap<String, List<String>> mListDataChild;
    private String userId;
    public SQLiteDatabase db;
    String s = "";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, new CharViewerFragment()).commit();
        //// drawer Toggle
        mTitle = mDrawerTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.drawable.ic_menu, R.string.drawer_open, R.string.drawer_close) {

            /**
             * Called when a drawer has settled in a completely closed state.
             */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu();     // creates call to onPrepareOptionsMenu()
            }

            /**
             * Called when a drawer has settled in a completely open state.
             */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu();      // creates call to onPrepareOptionsMenu()
            }
        };


        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);


        User user = new User();
        CRUDer localAdapter = new CRUDer(getApplicationContext());
        user = localAdapter.getUserfromDB();


        TextView textView = (TextView) findViewById(R.id.idTV);
        textView.setText(user.getUserID());


        /// end drawer toggle







        mExpListView = (ExpandableListView) findViewById(R.id.expList);
        mListDataHeader = new ArrayList<String>();
        mListDataChild = new HashMap<String, List<String>>();

        mListDataHeader.add("Characters");
        mListDataHeader.add("Disciplines");
        mListDataHeader.add("History");
        mListDataHeader.add("Settings");
        mListDataHeader.add("Help");

        List<String> mChildrenSales = new ArrayList<String>();
        mChildrenSales.add("Republic chars");
        mChildrenSales.add("Imperial chars");

        List<String> mChildrenQR = new ArrayList<String>();
        List<String> mChildrenHistory = new ArrayList<String>();
        List<String> mChildrenSettings = new ArrayList<String>();
        List<String> mChildrenHelp = new ArrayList<String>();
        


        mListDataChild.put(mListDataHeader.get(0), mChildrenSales);
        mListDataChild.put(mListDataHeader.get(1), mChildrenQR);
        mListDataChild.put(mListDataHeader.get(2), mChildrenHistory);
        mListDataChild.put(mListDataHeader.get(3), mChildrenSettings);
        mListDataChild.put(mListDataHeader.get(4), mChildrenHelp);

        mExpListAdapter = new ExpandableListAdapter(this, mListDataHeader, mListDataChild);
        mExpListView.setAdapter(mExpListAdapter);
        mExpListView.setGroupIndicator(null);

        mExpListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        mListDataHeader.get(groupPosition)
                                + " : "
                                + mListDataChild.get(
                                mListDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();

                switch (childPosition){
                    case 0: selectItem(0);
                        break;
                    case 1: selectItem(0);
                        break;
                }

                return false;
            }
        });
        mExpListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                 Toast.makeText(getApplicationContext(),
                 "Group Clicked " + mListDataHeader.get(groupPosition) + groupPosition,
                 Toast.LENGTH_SHORT).show();

                switch (groupPosition){

                    case 1: selectItem(groupPosition);
                        break;
                    case 2: selectItem(groupPosition);
                        break;
                    case 3: selectItem(groupPosition);
                        break;
                    case 4: selectItem(groupPosition);
                        break;
                }
                return false;
            }
        });



         }








    private void selectItem(int position) {
        // update the main content by replacing fragments

        FragmentManager fragmentManager = getFragmentManager();
        Intent intent;
        switch (position){

            case 0:
                fragmentManager.beginTransaction().replace(R.id.content_frame, new CharViewerFragment()).commit();
                mDrawerLayout.closeDrawers();
//                intent = new Intent(this, Sales.class);
//                startActivity(intent);
                break;

            case 1:

                fragmentManager.beginTransaction().replace(R.id.content_frame, new DisciplineEditFragment()).commit();
                mDrawerLayout.closeDrawers();


                break;
            case 2:

                fragmentManager.beginTransaction().replace(R.id.content_frame, new CharViewerFragment()).commit();
                mDrawerLayout.closeDrawers();


                break;

            case 3: intent = new Intent(this, Settings.class);
                startActivity(intent);
                break;
            case 4:intent = new Intent(this, Help.class);
                startActivity(intent);
                break;




        }

     }




    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {

            return true;
        }
        // Handle your other action bar items...

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
