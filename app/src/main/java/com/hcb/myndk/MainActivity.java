package com.hcb.myndk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.jni_text);
        MyNDK myNDK = new MyNDK();
        textView.setText(myNDK.getMyString());
    }
}
