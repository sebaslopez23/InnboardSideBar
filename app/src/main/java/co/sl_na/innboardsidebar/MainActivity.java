package co.sl_na.innboardsidebar;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import co.sl_na.innboardsidebar.fragments.ConfiguracionFragment;
import co.sl_na.innboardsidebar.fragments.ContactosFragment;
import co.sl_na.innboardsidebar.fragments.InicioFragment;
import co.sl_na.innboardsidebar.fragments.PerfilFragment;
import co.sl_na.innboardsidebar.fragments.ProyectosFragment;


public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public Toolbar toolbar;
    public ActionBar actionBar;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        if (navigationView != null) {
            setupNavigationDrawerContent(navigationView);
        }

        setupNavigationDrawerContent(navigationView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupNavigationDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.item_navigation_drawer_inicio:
                                menuItem.setChecked(true);
                                setFragment(0);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.item_navigation_drawer_perfil:
                                menuItem.setChecked(true);
                                setFragment(1);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.item_navigation_drawer_proyectos:
                                menuItem.setChecked(true);
                                setFragment(2);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.item_navigation_drawer_configuracion:
                                menuItem.setChecked(true);
                                setFragment(3);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.item_navigation_drawer_contactos:
                                menuItem.setChecked(true);
                                setFragment(4);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                        }
                        return true;
                    }
                });
    }
    public void setFragment(int position) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        switch (position) {
            case 0:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                InicioFragment inicioFragment = new InicioFragment();
                fragmentTransaction.replace(R.id.fragment, inicioFragment);
                fragmentTransaction.commit();
                break;
            case 1:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                PerfilFragment perfilFragment = new PerfilFragment();
                fragmentTransaction.replace(R.id.fragment, perfilFragment);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ProyectosFragment proyectosFragment = new ProyectosFragment();
                fragmentTransaction.replace(R.id.fragment, proyectosFragment);
                fragmentTransaction.commit();
                break;
            case 3:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ConfiguracionFragment configuracionFragment = new ConfiguracionFragment();
                fragmentTransaction.replace(R.id.fragment, configuracionFragment);
                fragmentTransaction.commit();
                break;
            case 4:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ContactosFragment contactosFragment = new ContactosFragment();
                fragmentTransaction.replace(R.id.fragment, contactosFragment);
                fragmentTransaction.commit();
                break;
        }
    }
}
