package com.cistudios.helppal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class SplashActivity extends Activity {

	private Intent signinMenuIntent;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Parse.initialize(this, "GvCpgg7uqlho4qPuaVSsJCA8DaHwCvJt56bih1SO", "jHjezRxdVycYgw15lG9h4hPsjQixnXoDwAn8Xycz");

		signinMenuIntent = new Intent(SplashActivity.this, SigninMenuActivity.class);
		startActivity(signinMenuIntent);
		finish();
	}
}
