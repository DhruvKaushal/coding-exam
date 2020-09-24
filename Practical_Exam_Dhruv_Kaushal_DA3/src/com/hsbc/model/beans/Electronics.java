package com.hsbc.model.beans;

public class Electronics extends Item{
	private double unit_price;
	private int warranty;
	private int qty;
	
	public Electronics(int item_code, String item_name, double unit_price, int warranty, int qty) {
		super(item_code, item_name);
		this.unit_price = unit_price;
		this.warranty = warranty;
		this.qty = qty;
	}

	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Electronics [item_code=" + this.item_code + ", item_name=" + item_name + ", unit_price=" + unit_price
				+ ", warranty=" + warranty + ", qty=" + qty + "]";
	}
	
}
