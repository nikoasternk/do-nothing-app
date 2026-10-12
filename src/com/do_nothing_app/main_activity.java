package com.do_nothing_app;

import android.app.Activity;
import android.os.Bundle;

public class main_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        overridePendingTransition(0, 0);
    }
}
