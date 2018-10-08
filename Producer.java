package lab5;

public class Producer extends Thread {
	int i=0;
	boolean yes = true;
	String s = "null";
	Fifo myfif;
	public Producer() {
		// TODO Auto-generated constructor stub
	}
	public Producer( String s1, Fifo f) {
				myfif = f;
				s	=s1;
}	
	public void start(){
		
	}
	
	public void run(){
		String str=null;
		while (yes){
			str = (s+" "+i+" "+System.currentTimeMillis()).toString();
		System.out.println(str);
		myfif.put(str);
		i++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
/*	
	public void go() throws InterruptedException{
		while (yes){
		System.out.println(s+" "+i+" "+System.currentTimeMillis());
		i++;
		Thread.sleep(1000);
	}
	}
	*/
	
}
