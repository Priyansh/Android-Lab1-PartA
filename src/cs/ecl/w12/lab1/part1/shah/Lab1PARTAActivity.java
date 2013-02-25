package cs.ecl.w12.lab1.part1.shah;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.Toast;


public class Lab1PARTAActivity extends Activity {
    /** Called when the activity is first created. */
	
	View mainView;
	RadioButton rbtn1;
	RadioButton rbtn2;
	Button btn4;
	Button btn1;
	Button btn5;
	Button btn6;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        mainView = (View)findViewById(R.id.mainLayout);
        
        Button btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() { 
        	
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mainView.setBackgroundColor(Color.BLUE);
				Toast.makeText(getBaseContext(), "Original color", Toast.LENGTH_SHORT).show();
				
			}
		});
        
        btn4 = (Button)findViewById(R.id.button4);
        btn1 = (Button)findViewById(R.id.button1);
        
        btn4.setOnClickListener(new View.OnClickListener() {      	
        	        		
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "value now become its original mode", Toast.LENGTH_SHORT).show();
				 btn1.setText("Activity2: clickMeToChangeText");
				
			}
		});
        
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        
        btn5.setOnClickListener(new View.OnClickListener() {      	
        	        		
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				 btn5.setBackgroundColor(Color.LTGRAY);
				 Toast.makeText(getBaseContext(), "ButtonColorChanged:LiteGray", Toast.LENGTH_SHORT).show(); 				
			}
		});
        
        btn6.setOnClickListener(new View.OnClickListener() {      	
        	        		
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				 btn5.setBackgroundColor(Color.GREEN);
				 Toast.makeText(getBaseContext(), "ButtonColorChanged:Green", Toast.LENGTH_SHORT).show(); 				
			}
		});
    }
    
    @Override
    
    protected void onStart()
    {
    	
    	super.onStart();
    	Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    	    	
    	
    }
   public void chgbackground_click(View view)
   {
	   try
	   {
		   mainView.setBackgroundColor(Color.GRAY);
	   	   
		   switch(view.getId())
		   {
	   			   
		   	case R.id.button2:
		   	Toast.makeText(this, "backgroundChange", Toast.LENGTH_SHORT).show();
		   
		   	break;
		   }
	   }
	   
	   catch(Exception ex)
	   {
		   
		   ex.toString();
	   }
	   
   }
   
   public void myClickHandler(View view)
   {
	   try
	   {
		
			 //btn1 = (Button) findViewById(R.id.button1);
			 btn1.setText("Activity2 Finished:My value changed buddy!!");
			 Toast.makeText(this, "value changed", Toast.LENGTH_LONG).show();
			 
	   }
	   
	   catch(Exception ex)
	   {
		   ex.toString();
	   }
	   
   }
   
    
 
}