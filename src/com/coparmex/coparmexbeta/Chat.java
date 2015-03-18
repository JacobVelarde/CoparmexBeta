package com.coparmex.coparmexbeta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Chat extends Activity implements OnClickListener {
	
	ImageButton btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chat);
		
		btn=(ImageButton)findViewById(R.id.imageButton1);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.imageButton1){
			Toast.makeText(this, "Esto es una version Beta", Toast.LENGTH_SHORT).show();
		}
		
	}

}
