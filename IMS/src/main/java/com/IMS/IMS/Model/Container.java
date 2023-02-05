package com.IMS.IMS.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
public class Container {
    @Id
    private int containerId;

    private int quantity;
    private int capacity;

    //getter functions
    public Integer getContainerID(){
        return this.containerId;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public int getCapacity(){
        return this.capacity;
    }

    //Setter functions
    public void setContainerId(Integer containerId){
        this.containerId = containerId;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void getCapacity(int capacity){
        this.capacity = capacity;
    }

}
