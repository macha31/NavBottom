package fr.app.navbottom;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TryFragment.OnFragmentInteractionListener {
    ConfitFragment confitFragment;
    android.app.FragmentManager manager;

    RdvFragment rdvFragment;
   CalendarFragment calendarFragment;
    TryFragment tryFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        confitFragment = new ConfitFragment();
        manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.contentLayout,
                confitFragment,
                confitFragment.getTag()).commit();

        rdvFragment = new RdvFragment();
       calendarFragment = new CalendarFragment();
       tryFragment = new TryFragment();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.contentLayout,
                            confitFragment,
                            confitFragment.getTag()).commit();

                    return true;
                case R.id.navigation_dashboard:
                    android.app.FragmentManager rdv = getFragmentManager();
                    rdv.beginTransaction().replace(R.id.contentLayout,
                            rdvFragment,
                            rdvFragment.getTag()).commit();

                    return true;
                case R.id.navigation_notifications:
                    android.app.FragmentManager calendar = getFragmentManager();
                    calendar.beginTransaction().replace(R.id.contentLayout,
                            calendarFragment,
                            calendarFragment.getTag()).commit();

                    return true;
             //   case R.id.navigation_calendar:
               //     android.app.FragmentManager tryy = getFragmentManager();
                 //   tryy.beginTransaction().replace(R.id.contentLayout,
                   //         tryFragment,
                     //       tryFragment.getTag()).commit();

                    //return true;



            }


            return false;

        }



    };


}
