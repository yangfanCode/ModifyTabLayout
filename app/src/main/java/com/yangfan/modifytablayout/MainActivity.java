package com.yangfan.modifytablayout;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.yangfan.widget.CustomFragmentPagerAdapter;
import com.yangfan.widget.ModifyTabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ModifyTabLayout tabLayout=findViewById(R.id.modiftTabLayout);
        ViewPager vp=findViewById(R.id.vp);
        tabLayout.setViewHeight(dp2px(35));
        tabLayout.setBottomLineWidth(dp2px(10));
        tabLayout.setBottomLineHeight(dp2px(3));
        tabLayout.setBottomLineHeightBgResId(R.color.color_14805E);
        tabLayout.setItemInnerPaddingLeft(dp2px(6));
        tabLayout.setItemInnerPaddingRight(dp2px(6));
        tabLayout.setmTextColorSelect(ContextCompat.getColor(this,R.color.color_14805E));
        tabLayout.setmTextColorUnSelect(ContextCompat.getColor(this,R.color.color_666666));
        tabLayout.setTextSize(16);
//        int width=getResources().getDisplayMetrics().widthPixels;
//        tabLayout.setNeedEqual(true,width);
        CustomFragmentPagerAdapter adapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new TestFragment(), "巴西");
        adapter.addFrag(new TestFragment(), "西班牙");
        adapter.addFrag(new TestFragment(), "阿根廷");
        adapter.addFrag(new TestFragment(), "葡萄牙");
        adapter.addFrag(new TestFragment(), "俄罗斯");
        adapter.addFrag(new TestFragment(), "巴西");
        adapter.addFrag(new TestFragment(), "西班牙");
        adapter.addFrag(new TestFragment(), "阿根廷");
        adapter.addFrag(new TestFragment(), "葡萄牙");
        adapter.addFrag(new TestFragment(), "俄罗斯");
        vp.setAdapter(adapter);
        vp.setOffscreenPageLimit(adapter.getCount());
        tabLayout.setupWithViewPager(vp);
    }

    /**
     * dp转换成px
     */
    public int dp2px( float dpValue){
        float scale=getResources().getDisplayMetrics().density;
        return (int)(dpValue*scale+0.5f);
    }
}
