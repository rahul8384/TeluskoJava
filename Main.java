package com.projects;

class A extends Thread{ 
    public void run(){ // Most important thing that in each thread based class method should be named run()
        for(int i=0; i<100; i++){
            System.out.println("hello");
        }
        try {
            Thread.sleep(1); // this is the method to put the thread in a state of wait for a certain time
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("Hi");
        }
        try {
            Thread.sleep(1);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
public class Main {

    public static void main(String[] args) {
        A obj1 = new A(); //creating the object of the class
        B obj2 = new B();

        obj1.start(); // start method is used to execute the method in each class
        obj2.start();
    }
}
