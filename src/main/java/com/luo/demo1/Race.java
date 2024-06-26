package com.luo.demo1;

public class Race implements Runnable{

    private static String winner;

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++){

            if(i%10 == 0 && "兔子".equals(Thread.currentThread().getName())){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(gameOver(i)){
                break;
            }

            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    private boolean gameOver(int i){
        if(winner != null){
            return true;
        }

        if(i >= 100){
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
