package com.example.tacademy.samplemultitypelistview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class DateView extends FrameLayout {
    public DateView(Context context) {
        super(context);
        init();
    }

    TextView message;
    DateData data;
    public void init(){
        inflate(getContext(), R.layout.view_send, this);
        message = (TextView)findViewById(R.id.text_message);

    }
    public void setData(DateData data){
        this.data = data;
        message.setText(data.message);
    }
}
