package test;

import main.InvoiceItem;

import java.util.Locale;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("1", "new product", 2, 1.99);
        System.out.printf(Locale.US,"Total is : %.2f\u20ac", invoiceItem1.getTotal());
    }
}
