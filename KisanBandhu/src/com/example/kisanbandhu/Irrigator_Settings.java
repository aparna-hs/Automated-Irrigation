package com.example.kisanbandhu;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;


public class Irrigator_Settings extends Activity {

	NumberPicker np1,np2,np3,np4;
	int n1,n2,n3,n4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_irrigator__settings);
		np1 = (NumberPicker) findViewById(R.id.numberPicker1);
		np1.setMinValue(0);
        np1.setMaxValue(10);
        np1.setWrapSelectorWheel(false);
        np1.setOnValueChangedListener( new NumberPicker.
            OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int
                oldVal, int newVal) {
            	n1=newVal;
                
            }
        });
        np2 = (NumberPicker) findViewById(R.id.numberPicker2);
		np2.setMinValue(0);
        np2.setMaxValue(10);
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener( new NumberPicker.
            OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int
                oldVal, int newVal) {
            	n2=newVal;
                
            }
        });
        np3 = (NumberPicker) findViewById(R.id.numberPicker3);
		np3.setMinValue(0);
        np3.setMaxValue(10);
        np3.setWrapSelectorWheel(false);
        np3.setOnValueChangedListener( new NumberPicker.
            OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int
                oldVal, int newVal) {
            	n3=newVal;
                
            }
        });
        np4 = (NumberPicker) findViewById(R.id.numberPicker4);
		np4.setMinValue(0);
        np4.setMaxValue(10);
        np4.setWrapSelectorWheel(false);
        np4.setOnValueChangedListener( new NumberPicker.
            OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int
                oldVal, int newVal) {
            	n4=newVal;
                
            }
        });
        
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.irrigator__settings, menu);
		return true;
	}
	public void sendSms(View view) {
	    
	    String s1,s2,s3,s4;
	    String phoneNumber="9741890814";
	    s1=Integer.toString(n1);
	    s2=Integer.toString(n2);
	    s3=Integer.toString(n3);
	    s4=Integer.toString(n4);
	    String message ="!"+s1+"!"+s2+"!"+s3+"!"+s4;

	    SmsManager smsManager = SmsManager.getDefault();
	    smsManager.sendTextMessage(phoneNumber, null, message, null, null);
	    Toast.makeText(this.getBaseContext(),"Message sent success",Toast.LENGTH_SHORT).show();;
	}

}
