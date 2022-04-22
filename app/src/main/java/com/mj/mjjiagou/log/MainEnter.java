package com.mj.mjjiagou.log;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.mj.mjjiagou.R;

public class MainEnter extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);

        JustLogManager.getInstance().init(new JustLogConfig());

        findViewById(R.id.print).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JustLog.v("123");
            }
        });

    }
}
