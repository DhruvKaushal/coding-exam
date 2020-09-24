package com.hsbc.model.service;

import com.hsbc.exception.CatagoryDoesNotExist;
import com.hsbc.exception.ItemCodeAlreadyExists;
import com.hsbc.model.beans.Apparel;

public interface ApparelService {
	public Apparel addItem(Apparel apparel) throws ItemCodeAlreadyExists;
	public Apparel[] getTopApparelItems();
}