package lab5;

import java.util.ArrayList;


public class Fifo extends Thread {
	ArrayList<String> tar =new ArrayList<String>();
	public Fifo() {
		// TODO Auto-generated constructor stub
	}
	public void put(String s ) {
		if (tar.size()>9){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tar.add(s);
	}
	
	public String get(){
		String s = tar.get(0);
		tar.remove(0);
		notify();
		return s;
	}
	

}
