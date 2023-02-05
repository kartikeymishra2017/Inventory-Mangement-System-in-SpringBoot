package com.IMS.IMS.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity
@NoArgsConstructor
public class Item {

    @Id
    private int sku;

    @Column
    private String name;
    @Column
    private int quantity;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "containerID", nullable = false)
//    private Container parentContainer;

//    @Column(name = "containerID")
//    @ElementCollection(targetClass = Integer.class)
//    @CollectionTable(name = "ItemContainers",joinColumns = @JoinColumn(name = "sku"))

    //getter Function
    public int getSku(){
        return this.sku;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    //setter function
    public void setSku(int sku){
        this.sku = sku;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }

}
