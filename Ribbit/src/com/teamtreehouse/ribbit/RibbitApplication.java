package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
		
		Parse.initialize(this, "rjgTQR4N7uMU0RvB5aixLLnTv6XyBErXwPkiuj0K", "xfuNv0t0AzcATbmE3pBJUdrnFEcsVUc7FBRgACMb");
	    
	    ParseObject testObject = new ParseObject("TestObject");
	    testObject.put("foo", "bar");
	    testObject.saveInBackground();
	}
}
