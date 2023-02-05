package com.IMS.IMS.Service;

import com.IMS.IMS.Dao.ContainerDao;
import com.IMS.IMS.Model.Container;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerService {
    @Autowired
    private ContainerDao containerDao;

    public List<Container> getAllContainers(){
        return containerDao.findAll();
    }

    public void addContainer(Container container){
        containerDao.save(container);
    }

    public void removeContainer(Integer containerId){
        containerDao.deleteById(containerId);
    }
}
