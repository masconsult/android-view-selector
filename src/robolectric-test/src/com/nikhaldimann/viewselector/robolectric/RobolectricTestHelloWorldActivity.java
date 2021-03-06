package com.nikhaldimann.viewselector.robolectric;

import android.app.Activity;
import android.os.Bundle;

/**
 * Robolectric 1.2 can't see resources from an Android library, so we
 * need to create a separate activity here with a layout defined in
 * this project rather than the shared test library.
 */
public class RobolectricTestHelloWorldActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }

}
