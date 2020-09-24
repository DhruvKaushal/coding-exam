package com.hsbc.model.beans;

public class Item {
	public int item_code;
	public String item_name;
	public Item(int item_code, String item_name) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
	}
	public int getItem_code() {
		return item_code;
	}
	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
}
