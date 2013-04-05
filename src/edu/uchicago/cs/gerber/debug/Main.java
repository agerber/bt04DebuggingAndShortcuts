package edu.uchicago.cs.gerber.debug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity implements OnClickListener  {
    /** Called when the activity is first created. */
	
	TextView txtShow;
	Button btnGo;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	//set some breakpoints here in this method
        txtShow = (TextView) findViewById(R.id.txtShow);
        btnGo = (Button) findViewById(R.id.btnGo);
        
        //let this class implement the OnClickListener
        btnGo.setOnClickListener(this);

    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		//R.array.hello_array
		String strBuild = getStringArray();
		txtShow.setText(strBuild);
		
		
	}


	private String getStringArray() {
		//set some breakpoints here in this method
		String[] strWords = getResources().getStringArray(R.array.hello_array);
		
		String strBuild = "";
		for (String str : strWords) {
			
			strBuild += str + " ";
		}
		//set a breakpoint at line below 
		strBuild += "\n" + convertToAscii(strBuild);
		return strBuild;
	}
	
	private String convertToAscii(String strSentence){
		
	   //declare some vars
	   String strR = "";
	   char cChar;
	   int nCode;
	   
	   //iterate over the string
		for (int nC = 0; nC < strSentence.length()-1; nC++) {
			cChar = strSentence.charAt(nC);
			nCode = (int) cChar;
		    strR += nCode + ":";
		}
		
		//convert the last character
		cChar = strSentence.charAt(strSentence.length()-1);
		nCode = (int) cChar;
		strR += nCode;

		//return the built string
		return strR;
		
	
	}

}