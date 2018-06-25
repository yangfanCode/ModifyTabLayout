# ModifyTabLayout
android自定义下划线的TabLayout

![image](https://github.com/yangfanCode/ModifyTabLayout/blob/master/readme1.png)

![image](https://github.com/yangfanCode/ModifyTabLayout/blob/master/readme2.png)

        使用

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
        int width=getResources().getDisplayMetrics().widthPixels;
        tabLayout.setNeedEqual(true,width);
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
        
        如果不配合ViewPager使用可直接使用setTabData()方法
