package com.projekt.stopper;

import java.util.Date;

/**
 * Created by Markus on 18.10.2015.
 */
public class Stopwatch {
        public static void main(String[] argv) {
            //+
            long aeg1 = new Date().getTime();
            while (true) {
                long aeg2 = new Date().getTime();
                int sekundid = (int) (aeg2 - aeg1) / 1000;
                System.out.print("Aega kulunud: " + sekundid + " sekundit" + "\r");
                try {
                    Thread.sleep(999);
                } catch (InterruptedException e) {
                }
            }
        }
}