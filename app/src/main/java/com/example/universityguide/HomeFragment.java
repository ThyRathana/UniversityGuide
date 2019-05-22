package com.example.universityguide;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.example.universityguide.adapter.SchoolAdapter;
import com.example.universityguide.model.SchoolModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.zip.Inflater;


public class HomeFragment extends Fragment {

    private SchoolAdapter adapter1;
    private List<SchoolModel> modelList;
    private ListView ListView1;
    ListView listView1;
    LinearLayout listItem;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        listItem = v.findViewById(R.id.each_linear_view);
        modelList=new ArrayList<>();
        ListView1 =v.findViewById(R.id.tv_home);
        SchoolModel model1 = new SchoolModel();

        model1.setImage_id(R.drawable.rupp_logo);
        model1.setName("Royal University of Phnom Penh");
        modelList.add(model1);

        SchoolModel model2 = new SchoolModel();
        model2.setImage_id(R.drawable.rufa_logo);
        model2.setName("Royal University of Fine Arts");
        modelList.add(model2);

        SchoolModel model3 = new SchoolModel();
        model3.setImage_id(R.drawable.itc_logo);
        model3.setName("Institute of Technology of Cambodia");
        modelList.add(model3);

        SchoolModel model4 = new SchoolModel();
        model4.setImage_id(R.drawable.niptict);
        model4.setName("National Institute of Posts,Telecoms and ITC");
        modelList.add(model4);

        SchoolModel model5 = new SchoolModel();
        model5.setImage_id(R.drawable.num_logo);
        model5.setName("National University of Management");
        modelList.add(model5);

        SchoolModel model6 = new SchoolModel();
        model6.setImage_id(R.drawable.rule);
        model6.setName("Royal University of Law and Economics");
        modelList.add(model6);

        SchoolModel model7 = new SchoolModel();
        model7.setImage_id(R.drawable.num_logo);
        model7.setName("National University of Management");
        modelList.add(model7);

        SchoolModel model8 = new SchoolModel();
        model8.setImage_id(R.drawable.rule);
        model8.setName("Royal University of Law and Economics");
        modelList.add(model8);

        adapter1=new SchoolAdapter(getContext(),modelList);
        ListView1.setAdapter(adapter1);

//        ListView1.setOnItemClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment fragment = new University_fragment();
//                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container, fragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
//            }
//        });
        ListView1.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {

                Intent intent = new Intent(getActivity(), UniversityActivity.class);
                startActivity(intent);


            }
        });

        return v;
    }




}