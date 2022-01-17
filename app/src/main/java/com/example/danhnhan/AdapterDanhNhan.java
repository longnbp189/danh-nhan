package com.example.danhnhan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AdapterDanhNhan extends BaseAdapter  {
    private List<DanhNhan> listDN;

    public void setListDN(List<DanhNhan> listDN, String name) {
        List<DanhNhan> list = new ArrayList<>();
        for (int i = 0; i < listDN.size(); i++) {
            if( listDN.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                list.add(listDN.get(i));
            }
        }
        this.listDN = list;
    }


    @Override
    public int getCount() {
        return listDN.size();
    }

    @Override
    public Object getItem(int i) {
        return listDN.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            view = inflater.inflate(R.layout.layout_danhnhan, viewGroup, false);
        }

        TextView txt1 = view.findViewById(R.id.txt1);
        TextView txt2 = view.findViewById(R.id.txt2);
        ImageView img = view.findViewById(R.id.hinh);

        DanhNhan dto = listDN.get(i);

        txt1.setText(dto.getName());
        txt2.setText(dto.getDescription());
        img.setImageResource(dto.getImage());
        return view;
    }
}
