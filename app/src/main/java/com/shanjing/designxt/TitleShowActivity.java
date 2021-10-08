package com.shanjing.designxt;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TitleShowActivity extends AppCompatActivity {

    private View rl_layout;
    private TextView mTextView,tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_show);
        AppBarLayout mAppBarLayout = findViewById(R.id.appbar);
        rl_layout = findViewById(R.id.rl_layout);
        mTextView = findViewById(R.id.tv_info);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        mAppBarLayout.addOnOffsetChangedListener((appBarLayout, verticalOffset) -> {
            float percent = Float.valueOf(Math.abs(verticalOffset)) / Float.valueOf(appBarLayout.getTotalScrollRange());
            //第一种
            int toolbarHeight = appBarLayout.getTotalScrollRange();
            int dy = Math.abs(verticalOffset);
            if (dy <= toolbarHeight) {
                float scale = (float) dy / toolbarHeight;
                float alpha = scale * 255;
                rl_layout.setBackgroundColor(Color.argb((int) alpha, 255, 255, 255));
                tv1.setTextColor(Color.argb((int) alpha, 0, 0, 0));
                tv2.setTextColor(Color.argb((int) alpha, 0, 0, 0));
                tv3.setTextColor(Color.argb((int) alpha, 0, 0, 0));
                mTextView.setText("setBackgroundColor(Color.argb((int) " + (int) alpha + ", 255, 255, 255))\n" + "mFLayout.setAlpha(" + percent + ")");
            }
        });
    }
}