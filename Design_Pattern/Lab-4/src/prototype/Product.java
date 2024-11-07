package prototype;

public abstract class Product implements Prototype{
 
	private String name;
	private String category;
	private Double price;
	
	public Product(String name, String category, Double price) {
		
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public abstract Product clone();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Product product = (Product) obj;
	        return name.equals(product.name) && category.equals(product.category) && price.equals(product.price);
	    }
	
	
	
}
