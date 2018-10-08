package lab5;

public class App {
	
	public App() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args){
	Fifo f1 = new Fifo();
	Fifo f2 = new Fifo();
	Producer mrKrabs  = new Producer("mrKrabs",f1);
	Producer spongebob  = new Producer("spongebob",f2);
	
	Thread t = new Thread(mrKrabs)	;
	Thread t2 = new Thread(spongebob)	;

	try {
		t.start();
		Thread.sleep(500);
		t2.start();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
}

