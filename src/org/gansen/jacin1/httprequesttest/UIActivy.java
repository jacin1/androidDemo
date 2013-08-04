package org.gansen.jacin1.httprequesttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class UIActivy extends Activity {

	
	TextView myTextView;
	
	Button myButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_uiactivy);
		
		myTextView =  (TextView)findViewById(R.id.myTextView);
		myButton  = (Button)findViewById(R.id.myButton);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uiactivy, menu);
		return true;
	}

}
