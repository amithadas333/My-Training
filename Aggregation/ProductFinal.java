package Aggregation;

public class ProductFinal 
{
	String quantity;
	Product product;
	

	public ProductFinal(String quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}




	public void display()
	{
		System.out.println("Quantity is " +quantity);
		System.out.println(product.id+","+product.name+","+product.description);
	}
	public static void main(String[] args) 
	{
		
		Product obj=new Product(345,"Lux","Choclate");
		Product obj1=new Product(453,"Ice cream","Tasty");
		ProductFinal obj3=new ProductFinal("700gm",obj);
		ProductFinal obj4=new ProductFinal("900gm",obj1);
		obj3.display();
		obj4.display();


	}

}
