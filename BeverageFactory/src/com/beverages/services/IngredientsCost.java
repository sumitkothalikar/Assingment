package com.beverages.services;
/*
 * Class to map Ingredient and Cost 
 **/
public class IngredientsCost {

	private final String ingredientName;
	private final double ingredientCost;
	
	public IngredientsCost(String ingredientName, double ingredientCost) {
		super();
		this.ingredientName = ingredientName;
		this.ingredientCost = ingredientCost;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public double getIngredientCost() {
		return ingredientCost;
	}
}
