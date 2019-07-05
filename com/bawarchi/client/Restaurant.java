package com.bawarchi.client;
import com.bawarchi.model.*;
import com.bawarchi.comparators.*;
import week1_assessment.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

class Restaurant {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		List<Dish> dishes = new ArrayList();
		dishes.add(new Dish(5, "Neer-Dosa", 50.00, 100));
		dishes.add(new Dish(2, "Idli-Vada", 40.00, 200));
		dishes.add(new Dish(4, "Roti-Curry", 100.00, 250));
		dishes.add(new Dish(1, "Dosa", 50.00, 300));
		dishes.add(new Dish(3, "Pulav", 80.00, 330));

		System.out.println("  =================Welcome=====================  \n");
		System.out.println("   Please choose from the below options \n ");
		System.out.println("1 => To sort the dishes in the increasing order of calories \n");
		System.out.println("2 => To sort the dishes in the decreasing order of calories \n");
		System.out.println("3 => To sort the dishes in the increasing order of price \n");
		System.out.println("4 => To sort the dishes in the decreasing order of price\n");
		System.out.println("  ===============================================  ");

		int choice = in.nextInt();
		
		Collections.sort(dishes, Comp.getComparator(choice));
		System.out.println("=================Please select the Dish Id and hit enter===============================");
		for (Dish l : dishes) {
			System.out.println(l);
			System.out.println();
		}

		System.out.println("============================================================");
		int choice1 = in.nextInt();
		for (Dish d : dishes) {
			if (d.getId() == choice1) {
				System.out.printf("==========You have selected %s ===================== ", d.getName());
				in.nextLine();
				System.out.println("\n Please enter your name: ");
				in.nextLine();
				System.out.printf(" Please pay the bill of Rs %.2f ", d.getPrice());
				int choice3 = in.nextInt();
				if (choice3 > d.getPrice()) {

					System.out.println(
							" ========Thanks for your order. Please collect the change "+ (choice3-d.getPrice())+" ================\r\n");
				}
				if (choice3 == d.getPrice()) {
					System.out.println(" ========Thanks for your order. ================");

				}
				if (choice3 < d.getPrice()) {

					System.out.println("========Amount paid is less than Bill Amount ================");
				}

			}

		}

	}
}