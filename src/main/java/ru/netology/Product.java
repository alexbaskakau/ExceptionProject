package ru.netology;
public class Product {
    protected int id;
    protected String title;
    protected int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }


    // Вспомогательные методы для корректной работы equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && title.equals(product.title);
    }

   // @Override
   // public int hashCode() {
    //    return Objects.hash(id, title, price);
   // }


    public int getId() {
        return id;
}
public String getTitle() {
        return title;
}
public int getPrice() {
        return price;
}
public void setTitle(String newTitle) {
        title = newTitle;
}
public void setPrice(int newPrice) {
        price = newPrice;
}
    // геттеры + сеттеры
    // на id только геттер — пусть будет неизменяемым для товара
}
