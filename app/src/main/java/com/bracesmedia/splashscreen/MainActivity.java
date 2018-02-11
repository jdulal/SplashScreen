package com.bracesmedia.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView companyLogo;
    TextView mainTitle, subTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        companyLogo=findViewById(R.id.companyLogo);
        mainTitle=findViewById(R.id.mainTitle);
        subTitle=findViewById(R.id.subTitle);

        Animation company_logo = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom_animation);
        companyLogo.startAnimation(company_logo);

        Animation fadeIn  = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mainTitle.startAnimation(fadeIn);
        subTitle.startAnimation(fadeIn);
    }
}
