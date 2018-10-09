package lab5;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Fifo f1 = new Fifo();
		Fifo f2 = new Fifo();
		Consumer squiward = new Consumer(f1, "*sgiht*", 50);
		Consumer kay = new Consumer(f2, "*kay*", 50);

		Producer mrKrabs = new Producer("mrKrabs", f1);
		Producer spongebob = new Producer("spongebob", f2);

		Thread t = new Thread(mrKrabs);
		Thread t2 = new Thread(spongebob);
		Thread t3 = new Thread(squiward);
		Thread t4 = new Thread(kay);
		try {
			t.start();
			Thread.sleep(500);
	//		t2.start();
			t3.start();
			//t4.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
