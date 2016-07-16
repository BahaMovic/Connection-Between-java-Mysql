import java.util.Random;

public class Game implements Runnable{
	private String name;
	private int r;
	private Random random = new Random();
	 public Game(String s){
		name=s;
		r = (random.nextInt(999)+300);
	}
	@Override
	public void run() {
		
		try {
			System.out.printf("%s Take %d\n",name,r);
			Thread.sleep(r);
			System.out.printf("%s is Done\n",name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
