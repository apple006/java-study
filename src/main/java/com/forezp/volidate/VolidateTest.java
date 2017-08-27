package com.forezp.volidate;

/**
 * 运行结构有可能不输出42，概率较小
 * Created by forezp on 2017/8/22.
 */
public class VolidateTest {

    private static boolean ready;
    private static int number;


    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(100);
        number=42;
        ready=true;

    }

    private static  class ReaderThread extends Thread{
        public void run(){
            while (!ready)
                Thread.yield();

            System.out.println(number);
        }
    }
}
