package com.qianmi.baselibrary;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

public class WelcomeBaseActivity extends BaseActivity {


    private android.widget.TextView tvtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_base);
        this.tvtext = (TextView) findViewById(R.id.tv_text);

    //    tvtext.setTextColor(ContextCompat.getColor(this, R.color.app_color));

    }
}
