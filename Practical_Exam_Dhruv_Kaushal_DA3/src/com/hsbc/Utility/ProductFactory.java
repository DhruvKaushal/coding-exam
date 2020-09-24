//Author: Dhruv Kaushal
//Purpose: This factory file controls which object is to be created
package com.hsbc.Utility;
import com.hsbc.model.Utility.Type;
import com.hsbc.model.dao.HashSetFoodDao;
import com.hsbc.model.service.FoodItemsServiceImpl;
public class ProductFactory {
	public static Object getInstance(Type type) {
		//type is defined in Type file
		Object obj=null;
		switch (type) {
		case FoodDao:
			obj = new HashSetFoodDao();
			break;
		case ApparelDao:
			obj = new HashSetApparelDao();
			break;
		case ElectronicsDao:
			obj = new HashSetElectronicsDao();
			break;
		case FoodService:
			obj = new FoodItemsServiceImpl();
			break;
		case ApparelService:
			obj = new ApparelServiceImpl();
			break;
		
		case ElectronicsService:
			obj = new ElecronicsServiceImpl();
			break;
		}
		return obj;
	}
}
