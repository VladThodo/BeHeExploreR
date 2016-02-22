package com.vlath.beheexplorer.adapters;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.vlath.beheexplorer.R;

import java.util.ArrayList;

public class TabAdapter extends BaseAdapter{
    View rowView;
    ArrayList<String> names;
    Context context;
    ArrayList<Bitmap> images;
    private static LayoutInflater inflater=null;
    public TabAdapter(Activity mainActivity, ArrayList<String> name, ArrayList<Bitmap> prgmImages,ListView list) {
        names= name;
        context=mainActivity;
        images=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return 1;
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public class Holder{
        TextView tv;
        ImageView img;
        ImageView img_del;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        rowView = inflater.inflate(R.layout.tab_item,null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.img_del=(ImageView) rowView.findViewById(R.id.imageView2);
        holder.tv.setText(names.get(position));
        holder.img_del.setImageResource(R.drawable.del);
        holder.img.setImageResource(R.drawable.history);
        return rowView;
    }

}
