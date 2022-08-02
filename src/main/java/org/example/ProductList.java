package org.example;


public class ProductList implements MagazineList {
    public ProductList() {
    }
     //Принцип единой ответственности (Solid) выводит только меню магазина
    public void productList(String[] list, int[] listCount) {
        for (int i = 0; i < list.length; i++) { // Отказ от магических чисел
            String product = list[i];
            int c = listCount[i];
            System.out.println(i + 1 + " " + product + ": В наличии  " + c);
        }
    }


}
