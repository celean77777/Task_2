package ru.gb.task_1;

import java.util.Scanner;

public class task2 {
    public static void main (String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (checkSum(a, b)) {
            System.out.println("Сумма в диапазоне");
        }
        else {
            System.out.println("Сумма вне диапазона");
        }
        System.out.println("Введите любое число");
        int с = scanner.nextInt();
        checkSign(с);
        System.out.println("Введите еще одно число");
        int d = scanner.nextInt();
        if (returnSign(d)) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
        System.out.println("Сколько раз напечатать?");
        int f = scanner.nextInt();
        System.out.println("Что напечатать?");
       String str = scanner.next();
        printStr(str, f);

        //int y = 1;
        System.out.println("Введите год:");
        int y = scanner.nextInt();
        if (checkYear(y)){
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }


    }

    public static boolean checkSum (int i, int j){
        return  ((i+j)>=10&(i+j)<=20);
    }

    public static void checkSign (int i){
        if (i<0){
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static boolean returnSign (int i){
        return (i<0);
    }

    public static void printStr (String str, int a){
        for (int i=0;i<a;i++){
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year){

        return ((year%4==0)&&(!(year%100==0)||(year%400==0)));

    }
}
