package com.example.universityguide.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.universityguide.R;
import com.example.universityguide.model.SchoolModel;

import java.util.List;

public class SchoolAdapter extends BaseAdapter {

    private Context context;
    private List<SchoolModel> modelList;

    public SchoolAdapter(Context context, List<SchoolModel>modelList){
        this.context = context;
        this.modelList = modelList;

    }


    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context,R.layout.home_view, null);
        ImageView img = v.findViewById(R.id.img_logo);
        TextView tvName = v.findViewById(R.id.tv_name);

        SchoolModel obj = modelList.get(position);
        img.setImageResource(obj.getImage_id());
        tvName.setText(obj.getName());
        return v;
    }


}
