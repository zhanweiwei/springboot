package com.learn.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OtherController {

    private Map<Object,Object> map = new HashMap<>();

    @PostMapping(value = "/v2/login")
    public Object login(String id,String pwd){
        map.clear();
        map.put("id",id);
        map.put("pwd", pwd);
        return map;
    }

    @PutMapping(value = "v2/put")
    public Object put(String id){
        map.clear();
        map.put("id",id);
        return map;
    }

    @DeleteMapping(value = "v2/delete")
    public Object delete(String id){
        map.clear();
        map.put("id",id);
        return map;
    }

}
