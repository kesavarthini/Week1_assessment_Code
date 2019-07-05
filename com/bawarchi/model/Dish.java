package   com.bawarchi.model;
import java.util.Objects;


public class Dish implements Comparable<Dish> {

	/* id (int)
     name, 
     calories (double)
     price (double)*/
	
	private int id;
	private String name;
	private double calories;
	private double price;
	
	
	public Dish (Integer id ,String name,double price, double calories)
	{
		this.id=id;
		this.name=name;
		this.calories=calories;
		this.price=price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 @Override
	 public int compareTo(Dish o) {
	 // TODO Auto-generated method stub
	 return Integer.valueOf(this.id).compareTo(o.id);
	 }
	@Override
	 public boolean equals(Object obj) {
	 if(obj==null)
	 return false;
	 if(obj.getClass() != Dish.class)
	 return false;
	Dish a1=(Dish)obj;

	 // TODO Auto-generated method stub
	 return Objects.equals(this.id,a1.id);
	 }

	 @Override
	 public int hashCode() {
	 // TODO Auto-generated method stub
	 return Objects.hash(this.id);
	 }

	
	 @Override
     public String toString() {
    	 return "Dish Id: "+ String.valueOf(getId()) +" Dish Name: " + String.valueOf(getName())+" Calories: "+String.valueOf(getCalories())+" Price: "+String.valueOf(getPrice());
    	
     }
	
	
}
