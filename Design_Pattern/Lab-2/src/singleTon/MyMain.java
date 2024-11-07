package singleTon;

public class MyMain {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadFoo());
		
		Thread t2 = new Thread(new ThreadBar());
		
		t1.start();
		t2.start();

	}
	
	static class ThreadFoo implements Runnable{

		@Override
		public void run() {
			SingleTon singleTon = SingleTon.getInstance("Foo");
			System.out.println(singleTon.value);
			
		}
		
	}
	
	static class ThreadBar implements Runnable{

		@Override
		public void run() {
			SingleTon singleTon = SingleTon.getInstance("Bar");
			System.out.println(singleTon.value);
			
		}
		
	}

}
