package com.th.exa;

public class Demo3 {
	public static void main(String[] args) {
		Thread r=new Thread(new Runnable(){
			public void run() {
				System.out.println("welcome"+Thread.currentThread().getName());
			}
		});
		r.setName("mythread");
		r.start();
	}

}
