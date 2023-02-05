package com.IMS.IMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.IMS.IMS.Service.ItemService;
import com.IMS.IMS.Model.Item;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemServiceObject;


    @GetMapping("/items")
    public List<Item> getAllItem(){
        return itemServiceObject.getAllItem();
    }

    @GetMapping("/items/{id}")
    public List<Item> getItemsInContainer(@PathVariable String id){
        return itemServiceObject.findItemsInContainer(id);
    }
    @PostMapping("/items")
    public  void addItem(@RequestBody Item i){
        itemServiceObject.addItem(i);
    }

    @DeleteMapping("/items/{id}")
    public  void removeItem(@PathVariable int id){
        itemServiceObject.deleteItem(id);
    }
}
