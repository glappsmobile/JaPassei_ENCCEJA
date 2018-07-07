package com.glapps.mobile.japasseiencceja.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;

/**
 * Created by GlaucoVillasBoas on 03/05/2017.
*/

public class MainListAdapter extends BaseAdapter {
    String [] result;
    int [] imageId ;
    Context context;


    private static LayoutInflater inflater=null;
    public MainListAdapter(Context contexto, String[] prgmText, int[] prgmInt) {
        // TODO Auto-generated constructor stub
            result = prgmText;
            imageId = prgmInt;
            context = contexto;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;

    }

    ViewGroup lista;
    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        // TODO Auto-generated method stub
        final Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.main_list_view_item, null);
        lista = parent;
        holder.tv=(TextView) rowView.findViewById(R.id.textoMain);
        holder.img=(ImageView) rowView.findViewById(R.id.imageMain);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        return rowView;
    }

}
