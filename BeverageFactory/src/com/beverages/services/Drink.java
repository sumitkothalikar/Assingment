package com.beverages.services;
import java.util.*;
final public class Drink {

	final Double cost;
	final String drinkName;
	final List<String> drinkIngredients;
	
	public Drink(String drinkName, List<String> drinkIngredients,double cost) {
		super();
		this.cost = cost;
		this.drinkName = drinkName;
		this.drinkIngredients = drinkIngredients;
	}
	
	public double getCost() {
		return cost;
	}
	
	public String getDrinkName() {
		return drinkName;
	}
	
	public List<String> getDrinkIngredients() {
		return drinkIngredients;
	}
	
	
}
