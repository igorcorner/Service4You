package com.s4y.service4you.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.VideoView;
import com.s4y.service4you.R;
/**
 * Created by boldi on 2018. 09. 04..
 */

public class MainActivity extends AppCompatActivity implements
              NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private NavigationView navView;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        navView = findViewById(R.id.navcigation_view);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
        mDrawerLayout = findViewById(R.id.mdrawlayout);
        toolbar.setBackgroundColor(R.color.toolbarRed);

        if (navView != null){
            navView.setNavigationItemSelectedListener(this);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { item.getItemId();

        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.edit_porfile){
            Intent i = new Intent(MainActivity.this,EditProfileAvtivity.class);
            startActivity(i);
        }else if (id == R.id.history){
            Intent i = new Intent(MainActivity.this,HistoryActivity.class);
            startActivity(i);
        }else if (id == R.id.new_offer){

        }else if (id == R.id.logout){

        }
        return false;
    }
}