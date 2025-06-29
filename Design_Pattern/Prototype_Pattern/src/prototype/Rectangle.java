package prototype;

public class Rectangle extends Shape{

	public int height;
	
	public int width;
	
	public Rectangle(){}
	
	public Rectangle(Rectangle target) {
		super(target);
		if(target != null) {
			this.height = target.height;
			this.width = target.width;
		}
	}
	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
	
	public boolean equals(Object object2) {
		if(!(object2 instanceof Rectangle) || !super.equals(object2)) {
			return false;
		}
	    Rectangle shape2 = (Rectangle) object2;
		
		return shape2.height == height && shape2.width == width;
	}
}
