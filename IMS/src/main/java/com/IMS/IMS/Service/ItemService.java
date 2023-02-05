package com.IMS.IMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.IMS.IMS.Dao.ItemDao;
import com.IMS.IMS.Model.Item;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemDao itemDao;

    public List<Item> getAllItem(){
        return itemDao.findAll();
    }

    public void deleteItem(int id){
        itemDao.deleteById(id);
    }

    public void addItem(Item newItem){
        itemDao.save(newItem);
    }

    public void removeItem(int id){
        itemDao.deleteById(id);
    }

    public List<Item> findItemsInContainer(String containerId){
        return itemDao.findByName(containerId);
    }
}
