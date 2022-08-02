package org.example;

import java.util.Scanner;

public class Purchase implements MagazineList {

    public void purchaseOfProduct(String[] product, int[] count, int valueProduct) {
        System.out.println("Что вы хотите купить ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x <= product.length) {

            System.out.println(" Вы купили " + product[x - 1]
                    + " В количестве " + valueProduct
                    + " На складе осталось " + (count[x - 1] - valueProduct));

        } else {
            System.out.println("Такого пункта нет");
        }

    }
}
