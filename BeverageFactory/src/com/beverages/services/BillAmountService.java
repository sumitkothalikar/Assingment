package com.beverages.services;
import java.util.*;
public class BillAmountService {

	
	public double calTotalCostOfOrder(String ... order) {
	
		double calculateCost=0.0;
		calculateCost = calTotalCostOfOrder(calculateCost, order);
		return calculateCost;

	 }	


	private double calTotalCostOfOrder(double calculateCost, String... order) {
		Map<String,Drink> mapDrink = getPredefinedMenu();
		Map <String,Double> ingCostMap = getIngredientCost();
		double excludedInPrice = 0;
     
		if (order.length > 0) {
			for (String od : order) {
				// System.out.println("Print Order " + od);
				int sizeOfIngredients=0;
				  aa: 
				if (od.contains("-")) {
					String[] orderToSubstrat = od.split(",-");
					if (mapDrink.containsKey(orderToSubstrat[0].toUpperCase()) ) {
						sizeOfIngredients=mapDrink.get(orderToSubstrat[0].toUpperCase()).getDrinkIngredients().size();
						if((orderToSubstrat.length-1 <sizeOfIngredients)) {
						 calculateCost = calculateCost + mapDrink.get(orderToSubstrat[0].toUpperCase()).getCost();
						 	for (int j = 1; j < orderToSubstrat.length; j++) {
								if (ingCostMap.containsKey(orderToSubstrat[j].toUpperCase())) {
									System.out.println("sizeOfIngredients"+sizeOfIngredients +" orderToSubstrat.length"+ orderToSubstrat.length);
									excludedInPrice = excludedInPrice + ingCostMap.get(orderToSubstrat[j].toUpperCase());
								} else {
									System.out.println(
											orderToSubstrat[j].toUpperCase() + " Is Wrong Ingredient Please Enter Valid Entry");
		                            break aa;
								}
								// System.out.println("ingredients to be substracted " + orderToSubstrat[j]);
							}
						}else {
							break aa;
						}
						
					} else {
						System.out.println(orderToSubstrat[0] + "Is Wrong Menu Item Please Enter Valid Entry");
				          break aa;
					}
					System.out.println("sizeOfIngredients"+sizeOfIngredients +" orderToSubstrat.length"+ orderToSubstrat.length);

					calculateCost = calculateCost - excludedInPrice;
					// System.out.println("excludedInPrice " + excludedInPrice);
				} else {
					if (mapDrink.containsKey(od.toUpperCase())) {
						calculateCost = calculateCost + mapDrink.get(od.toUpperCase()).getCost();
					} else {
						System.out.println(od.toUpperCase() + "Is Wrong Menu Item Please Enter Valid Entry");
					}
				}
				//System.out.print(" " + od);
			}
		} else {
			calculateCost = calculateSingleOrder(calculateCost, mapDrink, ingCostMap, excludedInPrice, order);

		}
		
		/*
		 * for(String st:order) System.out.print("|" +st +"|");
		 */
      System.out.println(" Final Bill is "+calculateCost+"$");
	  return calculateCost;
	}


	/**
	 * @param calculateCost
	 * @param mapDrink
	 * @param ingCostMap
	 * @param excludedInPrice
	 * @param order
	 * @return
	 */
	private double calculateSingleOrder(double calculateCost, Map<String, Drink> mapDrink,
			Map<String, Double> ingCostMap, double excludedInPrice, String... order) {
		if (order[0].contains("-")) {
			String[] orderToSubstrat = order[0].split(",-");
			if (mapDrink.containsKey(orderToSubstrat[0].toUpperCase())) {
				calculateCost = calculateCost + mapDrink.get(orderToSubstrat[0].toUpperCase()).getCost();
			} else {
				System.out.println(orderToSubstrat[0] + "Is Wrong Menu Item Please Enter Valid Entry");
			}
			for (int j = 1; j < orderToSubstrat.length; j++) {
				if (ingCostMap.containsKey(orderToSubstrat[j].toUpperCase())) {
					excludedInPrice = excludedInPrice + ingCostMap.get(orderToSubstrat[j].toUpperCase());
				} else {
					System.out.println(
							orderToSubstrat[j].toUpperCase() + " Is Wrong Ingredient Please Enter Valid Entry");
					}
				}
			calculateCost = calculateCost - excludedInPrice;
			} 
		  else {
			if (mapDrink.containsKey(order[0].toUpperCase())) {
				calculateCost = calculateCost + mapDrink.get(order[0].toUpperCase()).getCost();} 
			else {
				System.out.println(order[0].toUpperCase() + "Is Wrong Menu Item Please Enter Valid Entry");}
		  }
		return calculateCost;
	}
	


/*
   * 
   * Coffee: "Coffee, milk, sugar, water" Price: 5$
   * Chai: "Tea, milk, sugar, water" Price: 4$
   * Banana Smoothie: "banana, milk, sugar, water" Price: 6$
   * Strawberry Shake: "Strawberries, sugar, milk, water" Price: 7 $
   * Mojito: "Lemon, sugar, water, soda, mint" Price 7.5 $
   * 
   * 
   * */
  private Map<String,Drink> getPredefinedMenu(){
	  
	  Map<String,Drink> map = new HashMap<String,Drink>();
	  
	  List<String> coffeeIngrList =new ArrayList<String>();
	  coffeeIngrList.add("COFFEE");
	  coffeeIngrList.add("MILK");
	  coffeeIngrList.add("SUGAR");
	  coffeeIngrList.add("WATER");
	  Drink Coffee = new Drink("COFFEE",coffeeIngrList ,5.0);
	  map.put(Coffee.getDrinkName(), Coffee);

	  List<String> chaiIngrList =new ArrayList<String>();
	  chaiIngrList.add("TEA");
	  chaiIngrList.add("MILK");
	  chaiIngrList.add("SUGAR");
	  chaiIngrList.add("WATER");
	  Drink Chai = new Drink("CHAI",chaiIngrList ,4.0);
	  map.put(Chai.getDrinkName(), Chai);
  
	  List<String> bananaSIngList =new ArrayList<String>();
	  bananaSIngList.add("BANANA");
	  bananaSIngList.add("MILK");
	  bananaSIngList.add("SUGAR");
	  bananaSIngList.add("WATER");
	  Drink bananaSoomthie = new Drink("BANANA SMOTHIE",bananaSIngList ,6.0);
	  map.put(bananaSoomthie.getDrinkName(), bananaSoomthie);
	   
	  List<String> strawbShakeList =new ArrayList<String>();
	  strawbShakeList.add("STRAWBERRIES");
	  strawbShakeList.add("MILK");
	  strawbShakeList.add("SUGAR");
	  strawbShakeList.add("WATER");
	  Drink strawbShake = new Drink("STRAWBERRIES",strawbShakeList ,7.0);
	  map.put(strawbShake.getDrinkName(), strawbShake);
	  List<String> mojitoList =new ArrayList<String>();
	  mojitoList.add("LEMON");
	  mojitoList.add("MINT");
	  mojitoList.add("SODA");
      mojitoList.add("SUGAR");
	  mojitoList.add("WATER");
	  Drink Mojito = new Drink("MOJITO",mojitoList ,7.5);
      map.put(Mojito.getDrinkName(), Mojito);	  
	  return map;
	  
  }	
  //Get Ingredients to cost mapping
  private Map<String,Double> getIngredientCost(){
	  Map <String ,Double>  ingredientCostMap = new HashMap<String , Double>();
	  ingredientCostMap.put("MILK", 1.0);
	  ingredientCostMap.put("MINT", 0.5);
	  ingredientCostMap.put("SUGAR", 0.5);
	  ingredientCostMap.put("SODA", 0.5);
      ingredientCostMap.put("WATER", 0.5);
      return ingredientCostMap;
  } 
}
