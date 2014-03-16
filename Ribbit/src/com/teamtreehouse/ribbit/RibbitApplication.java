package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
		Parse.initialize(this, "rjgTQR4N7uMU0RvB5aixLLnTv6XyBErXwPkiuj0K", "xfuNv0t0AzcATbmE3pBJUdrnFEcsVUc7FBRgACMb");
	}
}
