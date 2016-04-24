package com.suresh.basicmaths;

import java.util.Random;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Logic extends ActionBarActivity implements AnimationListener {
	int decider, a, b, c, temp;
	TextView text_eqa;
	Button button_yes, button_no;
	Random r = new Random();
	//Animation
	Animation animZoomIn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// load the animation
		animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
		// set animation listener
		animZoomIn.setAnimationListener(this);
		
		text_eqa = (TextView) findViewById(R.id.textView1);
		text_eqa.startAnimation(animZoomIn);
		button_yes = (Button) findViewById(R.id.button_yes);
		button_yes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				validationYES();
			}
		});
		
		button_no = (Button) findViewById(R.id.button_no);
		button_no.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				validationNO();
			}
		});
		logic();
	}
	
	public void logic(){
		decider = r.nextInt(5-1) + 1;//5(1+,2-,3*,4/)
		Log.e("test", "dec: "+decider);
		a = r.nextInt(10-1) + 1;
		b = r.nextInt(10-1) + 1;
		switch (decider) {
		case 1:
			additionLogic(a, b);
			break;
		case 2:
			subtractionLogic();
			break;
		case 3:
			multiplicationLogic();
			break;
		case 4:
			divisionLogic();
			break;
		default:
			break;
		}
	}
	
	public void additionLogic(int a, int b){
		temp = r.nextInt(10-1) + 1;
		if (temp > 5) {
			c = r.nextInt(19-1) + 1;
			text_eqa.setText(a+"+"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}else {
			c = a+b;
			text_eqa.setText(a+"+"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}
	}
	
	public void subtractionLogic(){
		temp = r.nextInt(10-1) + 1;
		if (temp > 5) {
			c = r.nextInt(10-1) + 1;
			text_eqa.setText(a+"-"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}else {
			c = a-b;
			text_eqa.setText(a+"-"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}
	}
	
	public void multiplicationLogic(){
		temp = r.nextInt(10-1) + 1;
		if (temp > 5) {
			c = r.nextInt(82-1) + 1;
			text_eqa.setText(a+"*"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}else {
			c = a*b;
			text_eqa.setText(a+"*"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}
	}
	
	public void divisionLogic(){
		temp = r.nextInt(10-1) + 1;
		if (temp > 5) {
			c = r.nextInt(10-1) + 1;
			text_eqa.setText(a+"/"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}else {
			c = a/b;
			text_eqa.setText(a+"/"+b+"="+c);
			text_eqa.startAnimation(animZoomIn);
		}
	}
	
	public void validationYES(){
		switch (decider) {
		case 1:
			if (additionValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		case 2:
			if (subtractionValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		case 3:
			if (multiplicationValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		case 4:
			if (divisionValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		default:
			break;
		}
	}
	
	public void validationNO(){
		switch (decider) {
		case 1:
			if (!additionValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		case 2:
			if (!subtractionValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		case 3:
			if (!multiplicationValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		case 4:
			if (!divisionValidation()) {
				showToast("Correct");
				logic();
			}else {
				showToast("Game Over");
			}
			break;
		default:
			break;
		}
	}
	
	public boolean additionValidation(){
		if (a+b == c) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean subtractionValidation(){
		if (a-b == c) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean multiplicationValidation(){
		if (a*b == c) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean divisionValidation(){
		if (a/b == c) {
			return true;
		}else {
			return false;
		}
	}
	
	public void showToast(String text){
		Toast.makeText(Logic.this, text, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}
}
