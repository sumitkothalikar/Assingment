Run BeverageMain class to start the program

Possible input values and expected outputs

[Example 1]
	input:
  		String orders = "Chai,-sugaR,-milk";
	output :
  		2.5 $

[Example 2]  
	input :
       	String [] orders = {"Chai,-sugaR,-milk","STRAWBERRIES"};
	output :
 		9.5 $


[Example 3]  
	input :
		String [] orders = {"Chai,-sugaRR,-milk","STRAWBERRIES"};
    ouput: 
		SUGARR Is Wrong Ingredient Please Enter Valid Entry
		Final bill is 10.0$
     Note : Spelling of  SugaRR its incorrect so that value was not substracted from Chai bill

[Example 4]
     input:
       String [] orders = {"ChaiPani,-sugaRR,-milk","STRAWBERRIES"};
     output:
       ChaiPaniIs Wrong Menu Item Please Enter Valid Entry
	   SUGARR Is Wrong Ingredient Please Enter Valid Entry
	   Final bill  is 6.0$
     		  
[Example 5] - Invalid input
     input :
       String [] orders = {"Chai,-sugaR,-tea,-water,-milk","STRAWBERRIES,-d,-d,-d,-d"};
     Output:    
       Final Bill is 0.0$
        
           		  
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