//Author: Dhruv Kaushal
//Purpose: Throws exception if Item code does not exist

package com.hsbc.exception;

public class ItemCodeAlreadyExists extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ItemCodeAlreadyExists() {
		super("Item code already exists");
	}
	public ItemCodeAlreadyExists(String msg) {
		super(msg);
	}
}
