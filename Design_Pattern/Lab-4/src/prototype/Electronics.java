package prototype;

public class Electronics extends Product{
	
	private int storageCapacity;
    private int batteryLife;

	public Electronics(String name, String category, Double price,int storageCapacity, int batteryLife) {
		super(name, category, price);
		this.batteryLife = batteryLife;
		this.storageCapacity = storageCapacity;
		
	}

	@Override
	public Product clone() {
	
		return new Electronics(getName(), getCategory(), getPrice(), storageCapacity, batteryLife);
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Electronics)) return false;
        if (!super.equals(obj)) return false;

        Electronics electronics = (Electronics) obj;
        return storageCapacity == electronics.storageCapacity && batteryLife == electronics.batteryLife;
    }

}
