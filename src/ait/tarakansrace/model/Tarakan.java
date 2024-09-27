package ait.tarakansrace.model;

import java.util.Random;

public class Tarakan implements Runnable {
    public static int winner;
    private Random random = new Random();

    private int number;
    private int distance;

    public Tarakan(int number, int distance) {
        this.number = number;
        this.distance = distance;
    }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            System.out.println(number);
            try {
                Thread.sleep(random.nextInt(2, 6));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (winner == 0) {
            winner = number;
        }
    }
}
