package com.shop.Starbucks.controller;

import com.shop.Starbucks.entity.Entities;
import com.shop.Starbucks.reposirory.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class Controller {

    @Autowired
    private Repo repo;
    @GetMapping("/prudhvi")
    public String save(@RequestBody Entities entities)
    {
        repo.save(entities);
        return "welcome Prudhvi";
    }

    @GetMapping("/getall")
    public List<Entities> getall(){
      return  repo.findAll();
    }
}
