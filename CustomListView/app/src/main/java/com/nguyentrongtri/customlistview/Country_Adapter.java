package com.nguyentrongtri.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Country_Adapter extends BaseAdapter {
    private ArrayList<Country> dsQuocGia;
    private Context context;
    private LayoutInflater inflater;

    public Country_Adapter(ArrayList<Country> dsQuocGia, Context context) {
        this.dsQuocGia = dsQuocGia;
        this.context = context;
        this.inflater= LayoutInflater.from(context);
    }
    class ControlHolder{
        ImageView imageViewFlag;
        TextView textViewName;
        TextView textViewPopulation;
    }
    @Override
    public int getCount() {
        return dsQuocGia.size();
    }

    @Override
    public Object getItem(int i) {
        return  dsQuocGia.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ControlHolder itemControlHolder;
        if(view==null){
            view=inflater.inflate(R.layout.item_layout_country,null);
            itemControlHolder = new ControlHolder();
            itemControlHolder.imageViewFlag=view.findViewById(R.id.imageViewFlag);
            itemControlHolder.textViewName= view.findViewById(R.id.textViewCountryName);
            itemControlHolder.textViewPopulation=view.findViewById(R.id.textViewPopulation);

            view.setTag(itemControlHolder);
        }
        else{
            itemControlHolder=(ControlHolder)view.getTag();
        }
        Country nationI=dsQuocGia.get(i);
        itemControlHolder.textViewName.setText(nationI.getCountryName());
        itemControlHolder.textViewPopulation.setText("Population"+nationI.getPopulation());
        int resImageID= context.getResources().getIdentifier(
                nationI.getCountryFlag(),"mipmap",context.getPackageName()
        );
        itemControlHolder.imageViewFlag.setImageResource(resImageID);
        return view;
    }
}
