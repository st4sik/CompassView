package com.example.compassview;


import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
		public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);
		    CompassView cv=(CompassView)this.findViewById(R.id.compassView);
		    cv.setBearing(45);
		}
}
