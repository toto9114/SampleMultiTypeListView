package com.example.tacademy.samplemultitypelistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class ChattingAdapter extends BaseAdapter {
    ArrayList<ChattingData> items = new ArrayList<ChattingData>();

    private static final int VIEW_TYPE_COUNT = 3;

    private static final int TYPE_RECIEVE = 0;
    private static final int TYPE_SEND = 1;
    private static final int TYPE_DATE = 2;

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public  int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        ChattingData data = items.get(position);
        if(data instanceof ReceiveData){
            return TYPE_RECIEVE;
        }
        else if(data instanceof  SendData){
            return TYPE_SEND;
        }
        else{
            return  TYPE_DATE;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch (getItemViewType(position)){
            case TYPE_RECIEVE:{
                ReceiveView view;
                if(convertView == null){
                    view = (ReceiveView)convertView;
                }
                else {
                    view = new ReceiveView(parent.getContext());
                }
                view.setData((ReceiveData)items.get(position));
                return view;
            }
            case TYPE_SEND:{
                SendView view;
                if(convertView == null){
                    view = (SendView)convertView;
                }
                else {
                    view = new SendView(parent.getContext());
                }
                view.setData((SendData) items.get(position));
                return view;
            }


            case TYPE_DATE:
                default:{
                    DateView view;
                    if(convertView == null){
                        view = (DateView)convertView;
                    }
                    else {
                        view = new DateView(parent.getContext());
                    }
                    view.setData((DateData)items.get(position));
                    return view;
                }
        }
    }


}
