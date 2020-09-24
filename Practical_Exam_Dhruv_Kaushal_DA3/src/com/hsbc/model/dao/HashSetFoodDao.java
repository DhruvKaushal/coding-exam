//Author: Dhruv Kaushal
//Purpose: This is the Dao file to store list of food items

package com.hsbc.model.dao;
import java.util.*;
import com.hsbc.model.beans.FoodItems;


public class HashSetFoodDao implements FoodDao{
	List<FoodItems> foods = new ArrayList<FoodItems>(); 
	@Override
	public FoodItems store(FoodItems foodItems) {
		foods.add(foodItems);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodItems[] fetchTopItems() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
