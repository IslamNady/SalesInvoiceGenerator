/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.model;

/**
 *
 * @author Islam
 */
public class InvoiceItem {
    private InvoiceHeader header;
    private String name;
    private int count;
    private double price;

    public InvoiceItem(InvoiceHeader header, String name, int count, double price) {
        this.header = header;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    public double getTotal(){
        return count * price;
    }
}
