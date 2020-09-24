package com.hsbc.model.beans;

public class Apparel extends Item{
	private double unit_price;
	private double size;
	private String Material;
	private int qty;
	public Apparel(int item_code, String item_name, double unit_price, double size, String material, int qty) {
		super(item_code, item_name);
		this.unit_price = unit_price;
		this.size = size;
		Material = material;
		this.qty = qty;
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
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Apparel [item_code=" + item_code + ", item_name=" + item_name + ", unit_price=" + unit_price + ", size="
				+ size + ", Material=" + Material + ", qty=" + qty + "]";
	}
	
}
