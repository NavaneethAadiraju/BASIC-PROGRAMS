package com.th.exa;
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(5+"*"+i+"="+(5*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th= new MyThread();
		Thread t=new Thread(th);
		t.start();
	}

}
