//Author: Dhruv Kaushal
//Purpose: Food service implementation to perform tasks

package com.hsbc.model.service;
import com.hsbc.exception.*;
import com.hsbc.model.Utility.Type;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.dao.FoodDao;
import com.hsbc.Utility.*;

public class FoodItemsServiceImpl implements FoodService{
	private FoodDao dao;
	
	public FoodItemsServiceImpl() {
		dao=(FoodDao) ProductFactory.getInstance(Type.FoodDao);
	}

	@Override
	public FoodItems addItem(FoodItems foodItem) throws ItemCodeAlreadyExists {
		FoodItems food = dao.store(foodItems);
		return food;
	}

	@Override
	public FoodItems[] getTopFoodItems() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
