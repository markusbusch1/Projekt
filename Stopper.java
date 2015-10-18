package com.projekt.stopper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/**
 * Created by Markus on 18.10.2015.
 */
public class Stopper {
    public static void main(String[] args) {
        Scanner klaver = new Scanner(System.in);
        System.out.println("Sisesta 1 et alustada");
        int sisestus = klaver.nextInt();
        double algus = new Date().getTime();
        if (sisestus == 1) {
            System.out.println(algus);
            System.out.println("Sisesta 2 et lopetada");
            int sisestus2 = klaver.nextInt();
        } else if (sisestus == 2);
            double lopp = new Date().getTime();
            System.out.println(lopp);
        //DateFormat df = new SimpleDateFormat("HH 'hours', mm 'mins,' ss 'seconds'");
        //System.out.println(df.format(vahe));
            System.out.println((lopp - algus) / 1000 + " sekundit");

    }
}