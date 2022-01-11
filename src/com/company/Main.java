package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        String[] names = {"Иван", "Николай", "Софья", "Елесей"};

        for (int i = 0; i < numbers1.length; i++){
            System.out.print(numbers1[i]);
            if(i < (numbers1.length - 1)){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }
        for (int i = 0; i < numbers2.length; i++){
            System.out.print(numbers2[i]);
            if(i < (numbers2.length - 1)){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i]);
            if(i < (names.length - 1)){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }
        for (int i = numbers1.length - 1; i >= 0; i--){
            System.out.print(numbers1[i]);
            if(i > 0){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }
        for (int i = numbers2.length - 1; i >= 0; i--){
            System.out.print(numbers2[i]);
            if(i > 0){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }
        for (int i = names.length - 1; i >= 0; i--){
            System.out.print(names[i]);
            if(i > 0){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }

        for (int i = 0; i < numbers1.length; i++){
            if(numbers1[i]%2 != 0){
                numbers1[i]+=1;
            }
            System.out.print(numbers1[i]);
            if(i < (numbers2.length - 1)){
                System.out.print(", ");
            }else {
                System.out.println();
            }
        }





    }
}
