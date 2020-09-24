package com.hsbc.model.service;

import com.hsbc.exception.CatagoryDoesNotExist;
import com.hsbc.exception.ItemCodeAlreadyExists;
import com.hsbc.model.beans.Electronics;

public interface ElectronicsService {
	public Electronics addItem(Electronics electronic) throws ItemCodeAlreadyExists;
	public Electronics[] getTopElecronicsItems();
}
