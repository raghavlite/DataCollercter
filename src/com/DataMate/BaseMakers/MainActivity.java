package com.DataMate.BaseMakers;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button Start,Stop,Pothole,Speedbraker,Rbraker;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.main_layout);
	
	Start=(Button)findViewById(R.id.start);
	Stop=(Button)findViewById(R.id.stop);
	Pothole=(Button)findViewById(R.id.potter);
	Speedbraker=(Button)findViewById(R.id.sbreaker);
	Rbraker=(Button)findViewById(R.id.rbraker);
	
	

	
	
	
	
	
	
	
Start.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_SHORT/3).show();
			
		}
	});
	
Stop.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Stop", Toast.LENGTH_SHORT/3).show();
	}
});

Pothole.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "PHole", Toast.LENGTH_SHORT/3).show();
	}
});



Speedbraker.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "SBraker", Toast.LENGTH_SHORT/3).show();
	}
});
	
	


	Rbraker.setOnClickListener(new OnClickListener() {
		
		@Override	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "RBraker", Toast.LENGTH_SHORT/3).show();
		}
	});




	
}
	
	
	
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	
	
	
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	
	
	
	
	
	

}
