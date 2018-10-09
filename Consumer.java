package lab5;

public class Consumer extends Thread {
	Fifo fif;
	String string;
	int sleeptime;
	
	public Consumer(Fifo f,String s,int n){
		fif = f;
		string = s;
		sleeptime = n;
	}
	public void run(){
		while (true){
		
			

		
		try{
		System.out.println("consumed "+ string+" "+fif.get()+" "+ System.currentTimeMillis());
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		try {
			Thread.sleep(sleeptime*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}
	
}
