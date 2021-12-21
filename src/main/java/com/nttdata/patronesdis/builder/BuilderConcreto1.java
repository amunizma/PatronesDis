package com.nttdata.patronesdis.builder;

public class BuilderConcreto1 extends Builder{

	@Override
	void construirParteA() {
		System.out.println("construir parte A");
		
	}

	@Override
	public void construirParteB() {
		System.out.println("construir parte B");
	}

	@Override
	public void construirParteC() {
		System.out.println("construir parte C");
	}
	

}
