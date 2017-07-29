package com.mule.xform;

public class xformName {

	public String changeName(String name){
		if(name.toLowerCase() != null){
			return name.toUpperCase();
		}
		else return name.toLowerCase();
	}
}
