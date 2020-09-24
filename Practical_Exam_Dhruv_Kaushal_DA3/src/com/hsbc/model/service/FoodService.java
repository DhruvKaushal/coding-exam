//Author: Dhruv Kaushal
//Purpose: Service layer for Food data
package com.hsbc.model.service;

import com.hsbc.exception.CatagoryDoesNotExist;
import com.hsbc.exception.ItemCodeAlreadyExists;
import com.hsbc.model.beans.FoodItems;

public interface FoodService {
	public FoodItems addItem(FoodItems foodItem) throws ItemCodeAlreadyExists;
	public FoodItems[] getTopFoodItems();
}