package com.nttdata.patronesdis.builder;

public abstract class Builder {
	
	private Producto producto;
	
	abstract void construirParteA();
	abstract void construirParteB();
	abstract void construirParteC();

}
