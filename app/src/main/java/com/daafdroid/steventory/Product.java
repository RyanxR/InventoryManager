/**
 * Created by davinator on 12/13/2015.
 */

package com.daafdroid.steventory;

public class Product {

    private int id;
    private String productname;
    private int barcode;
    private int quantity;
    private String manufacturer;

    //Constructor method
    public Product(int id, String productname, int barcode, int quantity, String manufacturer) {
        this.id = id;
        this.productname = productname;
        this.barcode = barcode;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getID() {
        return this.id;
    }

    public void setProductName(String productname) {
        this.productname = productname;
    }

    public String getProductName() {
        return this.productname;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getBarcode() { return this.barcode; }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
