package com.cistudios.helppal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninMenuActivity extends Activity {

	private Button createAccountButton;
	private Intent createAccountIntent;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin_menu);
	
		createAccountButton = (Button) findViewById(R.id.create_account_button);
		createAccountIntent = new Intent(SigninMenuActivity.this, CreateAccountActivity.class);
		
		createAccountButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(createAccountIntent);
			}
		});
		
	}
}
