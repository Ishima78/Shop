package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню магазина :" + "\n"
                    + "Список товаров и количество в магазине" + "\n"
                    + "Поиск по названию " + "\n"
                    + "Доставка " + "\n"
                    + "Покупка ");
            int x = scanner.nextInt();
            if (x == 1) {
                ProductList list = new ProductList();
                list.productList(MagazineList.product, MagazineList.count);

            } else if (x == 2) {
                SeachProduct search = new SeachProduct();
                search.searchProduct("Ром", MagazineList.product);

            } else if (x == 3) {
                Delivery deliverys = new Delivery("улица Ленина", "3");
                deliverys.deliveryToHome(deliverys);

            } else if (x == 4) {
                Purchase purchase = new Purchase();
                purchase.purchaseOfProduct(MagazineList.product, MagazineList.count, 2);

            }
        }
    }
}