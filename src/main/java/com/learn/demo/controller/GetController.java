package com.learn.demo.controller;

import com.learn.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GetController {
    private Map<Object,Object> params = new HashMap<>();

    @RequestMapping("/")
    public String index(){
        return "hello word";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
        Map<String, String> map = new HashMap<>();
        map.put("beijing","xdclass");
        return map;
    }


    @GetMapping(value = "/v1/page_user")
    public Object pageUser(int from, int size){
        params.clear();
        params.put("from",from);
        params.put("size", size);
        return params;
    }

    /**
     * 功能描述：默认值，是否必须参数
     * @param from
     * @param size
     * @return
     */
    @GetMapping(value = "/v2/page_user")
    public Object pageUser2(@RequestParam(defaultValue = "0", name = "page") int from, int size){
        params.clear();
        params.put("from",from);
        params.put("size", size);
        return params;
    }

    @PostMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user){
        params.clear();
        params.put("user",user);
        return params;
    }

    @GetMapping("/v1/user")
    public Object testjson(){
        return new User("zhangsan",23,"18213907682","123456",new Date());
    }
}
