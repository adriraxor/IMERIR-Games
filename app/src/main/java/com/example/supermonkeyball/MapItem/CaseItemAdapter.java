package com.example.supermonkeyball.MapItem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.supermonkeyball.R;

import java.util.ArrayList;

public class CaseItemAdapter extends BaseAdapter {

    private ArrayList<Case> caseArrayList;
    private Context context;
    private LayoutInflater layoutInflater;

    public CaseItemAdapter(Context context, ArrayList<Case> caseArrayList){
        this.context = context;
        this.caseArrayList = caseArrayList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return caseArrayList.size();
    }

    @Override
    public Case getItem(int i) {
        return caseArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.case_item_adapter, null);

        TextView textView = view.findViewById(R.id.tvItemType);

        Case cell = getItem(i);

        textView.setText(String.valueOf(cell.getItemType()));

        if (cell.getItemType()==1){
            ImageView imageView = view.findViewById(R.id.imItemType);
            imageView.setImageResource(R.drawable.coin);
        }

        System.out.println("ITEM TYPE ----------> " + i);

        return view;
    }
}
