package org.cnu.realcoding.RCLOL.RCLOL.controller;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.Champion;
import org.cnu.realcoding.RCLOL.RCLOL.Service.RCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/Champions/{name}")
    public Champion getChampionByName(@PathVariable String name){
        return rcService.getChampionsByName(name);
    }

    @PutMapping("/Champions")
    public void updateChampion(@RequestBody Champion champ){
        rcService.updateChampion(champ);
    }

    @DeleteMapping("/Champions")
    public void removeChampion(@RequestParam String name){
        rcService.removeChampion(name);
    }
}
