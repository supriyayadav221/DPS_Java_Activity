package activities5;

class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
//Multi t1=new Multi();  
//t1.start();  

Multi m1=new Multi();  
Thread t1 =new Thread(m1);  
t1.start();  

 }  
}  