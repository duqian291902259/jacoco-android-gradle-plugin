package com.dicedmelon.example.android;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import com.dicedmelon.example.android.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityMainBinding viewDataBinding =
        DataBindingUtil.setContentView(this, R.layout.activity_main);

    NumberProvider numberProvider = new NumberProvider();
    viewDataBinding.setNumber(numberProvider.provideNumber());
    if (false){
      Log.d("dq-jacoco","duqian");
    }
  }
}
