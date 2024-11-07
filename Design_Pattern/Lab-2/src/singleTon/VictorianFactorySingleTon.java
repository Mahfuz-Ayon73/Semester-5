package singleTon;

import factory.Chair;
import factory.FurnitureFactory;
import factory.Sofa;
import factory.Table;
import factory.VictorianChair;
import factory.VictorianSofa;
import factory.VictorianTable;

public class VictorianFactorySingleTon implements FurnitureFactory {
	
	private static VictorianFactorySingleTon instance;
	
	private VictorianFactorySingleTon() {}
	
	public static VictorianFactorySingleTon getInstance() {
		if(instance == null) {
			instance = new VictorianFactorySingleTon();
		}
		return instance;
	}

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new VictorianTable();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

}
