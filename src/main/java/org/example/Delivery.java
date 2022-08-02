package org.example;


public class Delivery {
    protected String street;
    protected String numberHome;
    //Принцип открытости и закрытости .Можно расширить класс и добавить новый метод (sOlid)
    public Delivery(String street, String numberHome) {
        this.street = street;
        this.numberHome = numberHome;
    }

    public void deliveryToHome(Delivery delivery) {
        if (delivery.numberHome != null && delivery.street != null) {
            System.out.println("Ждите ,доставка уже в пути ");
        } else {
            System.out.println("Заполните все поля");
        }
    }
}
