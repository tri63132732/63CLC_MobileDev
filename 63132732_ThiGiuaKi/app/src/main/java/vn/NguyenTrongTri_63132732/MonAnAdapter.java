package vn.NguyenTrongTri_63132732;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn;
    private Context context;
    private LayoutInflater inflater;

    public MonAnAdapter(ArrayList<MonAn> dsMonAn, Context context) {
        this.dsMonAn = dsMonAn;
        this.context = context;
        this.inflater= LayoutInflater.from(context);
    }
    class ControlHolder{
        TextView textViewName;
        TextView textViewDescription;
    }
    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return  dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ControlHolder itemControlHolder;
        if(view==null){
            view=inflater.inflate(R.layout.activity_item_layout,null);
            itemControlHolder = new ControlHolder();
            itemControlHolder.textViewName= view.findViewById(R.id.item_title);
            itemControlHolder.textViewDescription=view.findViewById(R.id.item_description);

            view.setTag(itemControlHolder);
        }
        else{
            itemControlHolder=(ControlHolder)view.getTag();
        }
        MonAn foodI=dsMonAn.get(i);
        itemControlHolder.textViewName.setText(foodI.getName());
        itemControlHolder.textViewDescription.setText("Population"+foodI.getDesciption());
        int resImageID= context.getResources().getIdentifier(
                foodI.getDesciption(),"mipmap",context.getPackageName()
        );
        return view;
    }
}
