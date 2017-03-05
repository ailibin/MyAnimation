package com.demo.ailibin.myanimation;

import android.graphics.Interpolator;

/**
 * Created by aifengbin on 2017/3/5.
 */

//自定义速率变化器
public class MyInterpolator extends Interpolator{
    public MyInterpolator(int valueCount) {
        super(valueCount);
    }

    public MyInterpolator(int valueCount, int frameCount) {
        super(valueCount, frameCount);
    }
}
