package com.Hellu;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Hello extends Activity {
	
	private EditText txtname;
	private Button btnClickme;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txtname= (EditText)findViewById(R.id.txt_name);
        btnClickme= (Button) findViewById(R.id.btn_clickme);
        
        btnClickme.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str="Hello"+ txtname.getText().toString() +"!";
				Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();
				
			}
		});
    }
}