package com.hsbc.model.dao;

import com.hsbc.model.beans.FoodItems;

public interface FoodDao {
	public FoodItems store(FoodItems foodItems);
	public FoodItems[] fetchTopItems();
}