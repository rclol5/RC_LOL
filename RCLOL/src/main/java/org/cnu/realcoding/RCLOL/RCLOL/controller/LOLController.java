package org.cnu.realcoding.RCLOL.RCLOL.controller;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.Champion;
import org.cnu.realcoding.RCLOL.RCLOL.Service.RCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LOLController {
    @Autowired
    private RCService rcService;


    @PostMapping("/Champions")
    public void insertChampion(@RequestParam Champion champ){

        rcService.insertChampion(champ);

    }

    @GetMapping("/Champions")
    public List<Champion> getAllChampions(){
    return rcService.getAllChampions();
    }
}
