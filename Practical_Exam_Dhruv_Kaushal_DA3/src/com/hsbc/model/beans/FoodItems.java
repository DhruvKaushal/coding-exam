package com.hsbc.model.beans;
import java.time.*;
public class FoodItems extends Item{
	private double item_price;
	private LocalDate date_manufacture;
	private LocalDate date_expiry;
	private boolean veg;
	
	public FoodItems(int item_code,String item_name, double item_price, LocalDate date_manufacture, LocalDate date_expiry, boolean veg) {
		super(item_code, item_name);
		this.date_manufacture = date_manufacture;
		this.date_expiry = date_expiry;
		this.veg = veg;
	}



	public LocalDate getDate_manufacture() {
		return date_manufacture;
	}

	public void setDate_manufacture(LocalDate date_manufacture) {
		this.date_manufacture = date_manufacture;
	}

	public LocalDate getDate_expiry() {
		return date_expiry;
	}

	public void setDate_expiry(LocalDate date_expiry) {
		this.date_expiry = date_expiry;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public String toString() {
		return "FoodItems [item_code=" + item_code + ", unit_price=" + item_price + ", date_manufacture="
				+ date_manufacture + ", date_expiry=" + date_expiry + ", veg=" + veg + "]";
	}
	
	
	
}
