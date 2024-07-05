package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slno")
    private int slno;

    @Column(name = "pname")
    private String pname;

    @Column(name = "qty")
    private int qty;

    @Column(name = "price")
    private int price;

    // Default constructor
    public Product() {
        super();
    }

    // Parameterized constructor
    public Product(int slno, String pname, int qty, int price) {
        super();
        this.slno = slno;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }

    // Getter and Setter for slno
    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    // Getter and Setter for pname
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    // Getter and Setter for qty
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter and Setter for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
