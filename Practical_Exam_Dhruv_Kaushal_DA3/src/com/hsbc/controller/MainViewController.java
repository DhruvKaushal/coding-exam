//Author: Dhruv Kaushal
//Purpose: This is the controller file for IO purposes
package com.hsbc.controller;
import java.util.Scanner;

import com.hsbc.Utility.ProductFactory;
import com.hsbc.model.Utility.Type;
import com.hsbc.model.service.ApparelService;
import com.hsbc.model.service.ElectronicsService;
import com.hsbc.model.service.FoodService;


public class MainViewController {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		FoodService food = (FoodService) ProductFactory.getInstance(Type.FoodService);
		ApparelService apparel = (ApparelService) ProductFactory.getInstance(Type.ApparelService);
		ElectronicsService electronics = (ElectronicsService) ProductFactory.getInstance(Type.ElectronicsService);
		System.out.println("Welcome to EveryDay Portal!");
		System.out.println("What do you want to do: 1. Add Items 2. Show items");
		int choice = scanner.nextInt();
		while(choice == 1) {
			System.out.println("Enter which product catagory you want to update:  1. Food Items  2. Apparels  3. Electronics");
			int choiceProd = scanner.nextInt();
			//Based on choice, select which product you want to update to
			if(choiceProd == 1) {
				
			}
			else if(choiceProd == 2) {
				
			}
			else if(choiceProd == 3) {
				
			}
			else {
				System.out.println("Sorry wrong choice, try again!");
			}
			choice = scanner.nextInt();
		}
	}
}
