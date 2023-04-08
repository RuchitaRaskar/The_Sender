package com.micro2.micro2.Controller;

import com.micro2.micro2.Entity.Demo_two;
import com.micro2.micro2.Service.Service_two;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/micro2")
public class Controller {
    @Autowired
    private Service_two serviceTwo;
    @RequestMapping("/micro1/{id}")
    public List<Demo_two> getContacts(@PathVariable("id")int id){
        return this.serviceTwo.getMessageOfSecondMicroservice(id);
    }

}
