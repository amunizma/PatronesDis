package com.nttdata.patronesdis.prototype;

public class Prototype1 implements IPrototype {

	
	@Override
	public Object Clone() throws CloneNotSupportedException {
		Object obj = null;
		try {
			obj = super.clone();
			
		}catch (CloneNotSupportedException ex) {
			
		}
		return obj;
	}
	
	

}
