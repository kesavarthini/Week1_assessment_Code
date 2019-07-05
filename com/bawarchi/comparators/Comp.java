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
			return new Compare.CaloriesAsc();
		case 2:
			return new Compare.CaloriesDesc();
		case 3:
			return new Compare.PriceAsc();
		case 4:
			return new Compare.PriceDesc();
	    default:
	    	return new Compare.PriceAsc();

		}
	}
}
