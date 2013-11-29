package com.tomhanley.plusone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
String counter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		counter = "";
		final EditText et = (EditText) findViewById(R.id.editText1);
		
		Button one = (Button) findViewById(R.id.button1);
		one.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "1";
				et.setText("" + counter);
			}
		});
		
		Button two = (Button) findViewById(R.id.button2);
		two.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "2";
				et.setText("" + counter);			
			}
		});
		
		Button three = (Button) findViewById(R.id.button3);
		three.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "3";
				et.setText("" + counter);			
			}
		});
		
		Button four = (Button) findViewById(R.id.button4);
		four.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "4";
				et.setText("" + counter);			
			}
		});
		
		Button five = (Button) findViewById(R.id.button5);
		five.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "5";
				et.setText("" + counter);			
			}
		});
		
		Button six = (Button) findViewById(R.id.button6);
		six.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "6";
				et.setText("" + counter);			
			}
		});
		
		Button seven = (Button) findViewById(R.id.button7);
		seven.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "7";
				et.setText("" + counter);			
			}
		});
		
		Button eight = (Button) findViewById(R.id.button8);
		eight.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "8";
				et.setText("" + counter);			
			}
		});
		
		Button nine = (Button) findViewById(R.id.button9);
		nine.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "9";
				et.setText("" + counter);			
			}
		});
		Button zero = (Button) findViewById(R.id.button10);
		zero.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter += "0";
				et.setText("" + counter);			
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
