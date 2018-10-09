package lab5;

import java.util.ArrayList;

public class Fifo extends Thread {
	ArrayList<String> tar = new ArrayList<String>();
	public Object getlock = new Object();
	public Object putlock = new Object();

	public Fifo() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void put(String s) throws InterruptedException {
		while (tar.size() > 9) {
			this.wait();
		}
		tar.add(s);
		this.notify();

	}

	public synchronized String get() throws InterruptedException {

		while (tar.size() <= 0) {
			this.wait();

		}
		String s = tar.get(0);
		tar.remove(0);
		this.notify();

		return s;

	}

}
