package com.mcp.designpatterns.behavioral.chainofresponsibility;

import java.util.Stack;

public final class ATMContainer {

	private int _2000leaves;
	
	private int _1000leaves;
	
	private int _500leaves;
	
	private int _100leaves;

	private Stack<String> tray;
	
	public int get_2000leaves() {
		return _2000leaves;
	}

	public int get_1000leaves() {
		return _1000leaves;
	}

	public int get_500leaves() {
		return _500leaves;
	}

	public int get_100leaves() {
		return _100leaves;
	}
	
	public ATMContainer(int _2000leaves, int _1000leaves, int _500leaves, int _100leaves) {
		this._2000leaves = _2000leaves;
		this._1000leaves = _1000leaves;
		this._500leaves = _500leaves;
		this._100leaves = _100leaves;
		tray = new Stack<>();
	}

	public void pop_2000leaves(int count) {
		this._2000leaves -= count;
	}

	public void pop_1000leaves(int count) {
		this._1000leaves -= count;
	}

	public void pop_500leaves(int count) {
		this._500leaves -= count;
	}

	public int pop_100leaves(int count) {
		this._100leaves -= count;
		return _100leaves;
	}
	
	public void clear(){
		tray.clear();
	}
	
	public void addToTray(String msg){
		tray.push(msg);
	}
	public void dispense(){
		
		if(tray.isEmpty()){
			System.out.println("Out of order..!!");
		}
		while(!tray.isEmpty()){
			System.out.println(tray.pop());
		}
	}
}
