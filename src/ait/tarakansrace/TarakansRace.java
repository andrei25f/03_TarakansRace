package ait.tarakansrace;

import ait.tarakansrace.model.Tarakan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TarakansRace {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of tarakans");
        String str = br.readLine();
        int quantity = Integer.parseInt(str);

        System.out.println("Enter the distance");
        str = br.readLine();
        int distance = Integer.parseInt(str);

        Thread[] threads = new Thread[quantity];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Tarakan(i + 1, distance));
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println("Congratulations to tarakan #" + Tarakan.winner);
    }
}
