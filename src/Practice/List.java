package Practice;

import java.util.*;

class Product {
	String name;
	String desc;
	double price;

	public Product(String name, String desc, double price) {

		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String toString() {
		return name + " , Desc : " + desc + ", Price : " + price;
	}
}

class InventoryManagement{
	ArrayList<Product> list = new  ArrayList<>();
	{
		list.add(new Product("marker", "camlin", 50));
		list.add(new Product("pen", "trimax", 50));
		list.add(new Product("duster", "wooden white board", 50));
		list.add(new Product("bag", "laptop dell bag", 1500));
	}
	public void startUp()
	{
		ListIterator<Product> li = list.listIterator();
		viewInventry(li);
		start(li);
		
		addProduct(li);
		start(li);
		removeProduct(li);
		start(li);
		// updateProduct(li);
		
	}
//	public void updateProduct(ListIterator<Product> li) {
//		
//		while(li.hasNext())
//		{
//			ListIterator<Product> pri = li.next();
//			if(pri.next().price = 20)
//			{
//				
////		}
//		}
//		
//	}
	private void removeProduct(ListIterator<Product> li) {
		while(li.hasNext())
		{
			if(li.next().name.contains("duster"))
			{
				li.remove();
			}
		}
		
		
	}
	public void addProduct(ListIterator<Product> li)
	{
		
			li.add(new Product("pencil", "Natraj", 20));
			li.add(new Product("pad", "Natraj", 20));
	
		
	}
	public void start(ListIterator<Product> li)
	{
		while(li.hasPrevious())
		{
			li.previous();
		}
	}
	public void viewInventry(ListIterator<Product> li) {
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
	}
	
}
public class List {
	
	public static void main(String[] args) {
		InventoryManagement mg = new InventoryManagement();
		mg.startUp();
		
	}
	
	

}
