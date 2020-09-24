//Author: Dhruv Kaushal
//Purpose: Throws exception if catagory does not exist

package com.hsbc.exception;

public class CatagoryDoesNotExist extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CatagoryDoesNotExist() {
		super("This catagory doesn not exist");
	}
	public CatagoryDoesNotExist(String msg) {
		super(msg);
	}
}
