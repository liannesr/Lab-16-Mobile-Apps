package com.techexchange.mobileapps.lab16;


import android.support.v4.app.Fragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}
