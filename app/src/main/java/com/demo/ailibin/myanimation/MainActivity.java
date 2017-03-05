package com.demo.ailibin.myanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) this.findViewById(R.id.demo_imageview);
        initAnimation();
    }

    private void initAnimation() {
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //代码控制
//                AnimationSet animationSet = new AnimationSet(true);
//                AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
//                RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
//                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 100);
//                ScaleAnimation scaleAnimation=new ScaleAnimation(0.0f,1.5f,0.0f,1.5f,
//                       0.5f,0.5f);
//                animationSet.setDuration(3000);
//                animationSet.addAnimation(alphaAnimation);
//                animationSet.addAnimation(rotateAnimation);
//                animationSet.addAnimation(translateAnimation);
//                animationSet.addAnimation(scaleAnimation);
//                image.startAnimation(animationSet);

                //使用xml解析
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.set_animation);
                image.startAnimation(animation);
            }
        });
    }
}
