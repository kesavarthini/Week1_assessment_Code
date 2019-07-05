package com.bawarchi.comparators;

import java.util.Comparator;
import com.bawarchi.model.*;
import com.bawarchi.comparators.*;
public class Comp {
/*
	public enum CompChoice {
		PRICE_ASCENDING, PRICE_DESCENDING,CALORIE_ASCENDING,CALORIE_DESCENDING

	}
	*/
	public static Comparator<Dish> getComparator(int choice) {
		// System.out.println("1.Ascending 2.Descending");
		// Scanner scanner=new Scanner(System.in);
		// int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			return new CaloriesLTComparator();
		case 2:
			return new CaloriesGTComparator();
		case 3:
			return new PriceLTComparator();
		case 4:
			return new PriceGTComparator();
	    default:
	    	return new PriceGTComparator();

		}
	}
}
