package prototype;

public class Clothing extends Product{
	
	private String color;
    private String size;

	public Clothing(String name, String category, Double price, String color, String size) {
		super(name, category, price);
		this.color = color;
		this.size = size;
	}

	@Override
	public Clothing clone() {
		return new Clothing(getName(), getCategory(), getPrice(), color, size);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Clothing)) return false;
        if (!super.equals(obj)) return false;
        
        Clothing clothing = (Clothing) obj;
        return color.equals(clothing.color) && size.equals(clothing.size);
    }

	
}
