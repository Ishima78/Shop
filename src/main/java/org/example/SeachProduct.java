package org.example;


public class SeachProduct implements MagazineList {

    //Метод позволяющий отказаться от повтора ввода продукта DRY
    public void searchProduct(String products, String[] list) {
        for (String s : list) {
            if (s.equals(products)) {
                System.out.println(s + " в наличии");
            }
        }
    }


}
