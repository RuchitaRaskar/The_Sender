package com.micro2.micro2.Service;

import com.micro2.micro2.Entity.Demo_two;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements Service_two{

    List<Demo_two> list = List.of(new Demo_two(1,"This is the message from microservice",1));
    @Override
    public List<Demo_two> getMessageOfSecondMicroservice(int id) {
        return list.stream().filter(demo -> demo.getId()==id).collect(Collectors.toList());
    }


}
