package ua.com.vstoliarchuk.photogallery;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
