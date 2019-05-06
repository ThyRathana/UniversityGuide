package com.example.universityguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class UniversityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        getActivity().setTitle("University");
        //return inflater.inflate(R.layout.university, container, false);

        View view = inflater.inflate(R.layout.university, container , false);

        LinearLayout linearLayoutUniversity = (LinearLayout) view.findViewById(R.id.about_school);
        linearLayoutUniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapFragment();
            }
        });
        return view;

    }
    private void swapFragment(){
        AboutSchool_Fragment aboutSchool_fragment = new AboutSchool_Fragment();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, aboutSchool_fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
