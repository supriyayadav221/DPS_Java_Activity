package act3;

public class Lambda {
	public static void main(String[] args) {
		
		Runnable runnable1= new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable with anonymous class");
				
			}
		};
		
		Runnable runnable2=()->{
			System.out.println("Hi!");
			System.out.println("Hello!");
			System.out.println("This is Runnable with lambda!");
		};
		
		
		
		
		
		new Thread(runnable1).start();
		
		new Thread(runnable2).start();
		
	}
}
