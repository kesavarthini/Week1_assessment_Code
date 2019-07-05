package  com.bawarchi.comparators;
import java.util.Comparator;
import com.bawarchi.model.*;
public class Compare{
		
	

	public static class CaloriesAsc implements Comparator <Dish>{
		@Override
		public int compare(Dish d1,Dish d2) {
			return Double.valueOf(d1.getCalories()).compareTo(d2.getCalories());
		}
	}


	public static class CaloriesDesc implements Comparator <Dish>{
		@Override
		public int compare(Dish d1,Dish d2) {
			return Double.valueOf(d2.getCalories()).compareTo(d1.getCalories());
		}
	}

	public static class PriceAsc implements Comparator <Dish>{
		@Override
		public int compare(Dish d1,Dish d2) {
			return Double.valueOf(d1.getPrice()).compareTo(d2.getPrice());
		}
	}


	public static class PriceDesc implements Comparator <Dish>{
		@Override
		public  int compare(Dish d1,Dish d2) {
			return Double.valueOf(d2.getPrice()).compareTo(d1.getPrice());
		}
	}

	}

