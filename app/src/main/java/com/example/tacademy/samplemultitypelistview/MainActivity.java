package com.example.tacademy.samplemultitypelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputView;
    RadioGroup categoryView;
    ChattingAdapter mAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView = (TextView)findViewById(R.id.edit_input);
        categoryView = (RadioGroup)findViewById(R.id.category);
        listView = (ListView)findViewById(R.id.listView);
        mAdapter = new ChattingAdapter();
        listView.setAdapter(mAdapter);

        Button btn = (Button)findViewById(R.id.button_insert);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int id = categoryView.getCheckedRadioButtonId();
                switch(id){

                }

            }
        });
    }


}
