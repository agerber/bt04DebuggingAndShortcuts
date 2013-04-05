package edu.uchicago.cs.gerber.debug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity implements OnClickListener   {
    /** Called when the activity is first created. */
	
	// %%%%%%%%%%%%%% PHASE 1
	TextView txtShow;
	Button btnGo;

	
	// %%%%%%%%%%%%%% PHASE 0
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // %%%%%%%%%%%%%% PHASE 1
       	//set some breakpoints here in this method
           txtShow = (TextView) findViewById(R.id.txtShow);
           btnGo = (Button) findViewById(R.id.btnGo);
           
           //let this class implement the OnClickListener
           btnGo.setOnClickListener(this);

    }


    // %%%%%%%%%%%%%% PHASE 1
   	@Override
   	public void onClick(View v) {

   		//String strBuild = getStringArray();
   		//txtShow.setText(strBuild);
   		
   		
   	}



}