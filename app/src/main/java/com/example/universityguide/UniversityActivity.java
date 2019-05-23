package com.example.universityguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;


public class UniversityActivity extends AppCompatActivity{

    private LinearLayout layoutAboutSchool;
    private LinearLayout layoutMajorFees;
    private LinearLayout layoutLocation;
    private LinearLayout layoutRecommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.university);
        setTitle("University");

//        Toolbar toolbar =(Toolbar) findViewById(R.id.toolBar);
//        setSupportActionBar(toolbar);
//        TextView tvtitle = toolbar.findViewById(R.id.tv_head);
//       // tvtitle.setText("University Guide");

        layoutAboutSchool = (LinearLayout) findViewById(R.id.linear_school);
        layoutMajorFees = (LinearLayout) findViewById(R.id.linear_major);
        layoutLocation = (LinearLayout) findViewById(R.id.linear_location);
        layoutRecommend = (LinearLayout) findViewById(R.id.line_recommence);

        layoutAboutSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversityActivity.this, AboutSchool_Activity.class);
                startActivity(intent);
            }
        });
        layoutMajorFees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversityActivity.this, MajorFees_Activity.class);
                startActivity(intent);
            }
        });
        layoutLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversityActivity.this, Location_Activity.class);
                startActivity(intent);
            }
        });
        layoutRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversityActivity.this, Recommend_Activity.class);
                startActivity(intent);
            }
        });

    }

}
