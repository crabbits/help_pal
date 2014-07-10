package com.cistudios.helppal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cistudios.helppal.droidform.DroidForm;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class CreateAccountActivity extends Activity {

	private DroidForm createAccountForm;
	private Button createAccountButton;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);
	
		createAccountForm = new DroidForm(this);
		
		createAccountButton = (Button) findViewById(R.id.create_account_button);
		
		createAccountForm.addField(R.id.name, true);
		createAccountForm.addField(R.id.mobile_number, true);
		createAccountForm.addField(R.id.password, true);
		createAccountForm.addField(R.id.password_confirmation, true);
		
		setSubmitCreateAccountListener();
	}
	
	private void setSubmitCreateAccountListener() {
		createAccountButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				createAccount();
			}
		});
	}
	
	private void createAccount() {
		ParseUser user = new ParseUser();
		user.setUsername(createAccountForm.valueOf(R.id.name));
		user.setPassword(createAccountForm.valueOf(R.id.password));
		user.put("mobile", Integer.parseInt(createAccountForm.valueOf(R.id.mobile_number)));
		
		user.signUpInBackground(new SignUpCallback() {
			public void done(ParseException e) {
				if(e == null) {
					
				} else {
					Log.e("error", e.getLocalizedMessage());
				}
			}
		});
	}
}
