package com.IMS.IMS.Controller;

import com.IMS.IMS.Model.Container;
import com.IMS.IMS.Service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContainerController {
    @Autowired
    private ContainerService containerService;

    @GetMapping("/containers")
    public List<Container> getAllContainers(){
        return containerService.getAllContainers();
    }

    @PostMapping("/containers")
    public String addContainer(Container container){
        containerService.addContainer(container);
        return "Container Added Successfully";
    }

    @DeleteMapping("/containers/{id}")
    public String removeContainer(@PathVariable int id){
        containerService.removeContainer(id);
        return "Container Removed Successfully";
    }
}
