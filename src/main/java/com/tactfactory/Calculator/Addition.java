package com.tactfactory.Calculator;

public class Addition {
	int value = 0;
	
	public Addition(int a) {
		this.value = a;
	}
	
	public void make(int b) {
		this.value += b;
	}
	
	public int getValue() {
		return this.value;
	}
}
