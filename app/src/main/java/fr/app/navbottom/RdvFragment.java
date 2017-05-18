package fr.app.navbottom;


import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class RdvFragment extends Fragment {

   // View view;
    //android.app.FragmentManager fragmentManager = getFragmentManager();
    //android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    public RdvFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_rdv, container, false);



    }


}
