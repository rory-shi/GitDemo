package com.example.xinghua.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;

/**
 * Created by weikuo on 2016/1/18.
 */
public class SecondActivity  extends Activity{
    private Button btn_firstEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_firstEvent = (Button) findViewById(R.id.btn_first_event);
        btn_firstEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(
                        new FirstEvent("FirstEvent btn clicked")
                );
            }
        });
    }
}
