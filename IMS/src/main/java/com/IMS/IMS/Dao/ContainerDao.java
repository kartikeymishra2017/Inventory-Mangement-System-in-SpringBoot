package com.IMS.IMS.Dao;

import com.IMS.IMS.Model.Container;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerDao extends JpaRepository<Container,Integer>{

}