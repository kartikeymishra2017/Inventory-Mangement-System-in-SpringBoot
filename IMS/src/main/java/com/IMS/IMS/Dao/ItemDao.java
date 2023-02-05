package com.IMS.IMS.Dao;

import com.IMS.IMS.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemDao extends JpaRepository<Item,Integer> {

    List<Item> findByName(String Name);
}