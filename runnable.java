package com.projects;

class A implements Runnable{ // implemented the runnable interface
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("hello");
        }
        try {
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class B implements Runnable {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Hi");
        }
        try {
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }

}
public class Main {

    public static void main(String[] args) {
        A obj1 = new A(); //runnable class objects
        B obj2 = new B();
//since in runnable threads don't directly use the object and don't use the start method, 
//To actually execute the methods of a runnable class you need to create object of runnable class and thread class, thread class has a inbuilt constructor that takes the method
//as value and those objects of thread class can use the start() method to execute the things
      
        Thread t1 = new Thread(obj1); //threads object(passing the object of runnable class)
        Thread t2 = new Thread(obj2);

        t1.start();//executing the runnable class
        t2.start();
    }
}
