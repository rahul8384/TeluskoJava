package com.projects;

class A extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("hello");
        }
        try {
            Thread.sleep(1);
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
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
