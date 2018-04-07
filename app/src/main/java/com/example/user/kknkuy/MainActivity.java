package com.example.user.kknkuy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentHome home= new FragmentHome();
        getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, home).commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentChat fragmentChat= new FragmentChat();
                getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, fragmentChat).commit();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_sign_in) {
            SignIn signIn= new SignIn();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, signIn).commit();
        } else if (id == R.id.nav_setting) {
            BelumTersedia belumTersedia= new BelumTersedia();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, belumTersedia).commit();
        } else if (id == R.id.nav_help) {
            Help help= new Help();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, help).commit();
        } else if (id == R.id.nav_about_us) {
            AboutUs aboutUs= new AboutUs();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, aboutUs).commit();
        } else if (id == R.id.nav_log_out) {
            BelumTersedia belumTersedia= new BelumTersedia();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, belumTersedia).commit();
        } else if(id==R.id.nav_home){
            FragmentHome home= new FragmentHome();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, home).commit();
        } else if(id==R.id.nav_pengumuman){
            FragmentPengumuman pengumuman= new FragmentPengumuman();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, pengumuman).commit();
        } else if(id==R.id.nav_oprec){
            FragmenOprec oprec= new FragmenOprec();
            getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, oprec).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
