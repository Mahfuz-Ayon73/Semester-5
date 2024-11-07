package singleTon;

import factory.Chair;
import factory.FurnitureFactory;
import factory.MordernChair;
import factory.MordernSofa;
import factory.MordernTable;
import factory.Sofa;
import factory.Table;

public class MordernFactorySingleTon implements FurnitureFactory{
	
	private static MordernFactorySingleTon instance;
	
	private MordernFactorySingleTon() {}
	
	public static synchronized MordernFactorySingleTon getInstance() {
		
		if(instance == null) {
			instance = new MordernFactorySingleTon();
		}
		return instance;
	}

	@Override
	public Chair createChair() {
		return new MordernChair();
	}

	@Override
	public Table createTable() {
		return new MordernTable();
	}

	@Override
	public Sofa createSofa() {
		return new MordernSofa();
	}

}
