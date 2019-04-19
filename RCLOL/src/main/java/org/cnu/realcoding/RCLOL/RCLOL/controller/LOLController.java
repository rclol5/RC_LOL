package org.cnu.realcoding.RCLOL.RCLOL.controller;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.Champion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LOLController {
    @PostMapping("/Champions")
    public void insertChampion(@RequestParam Champion champ){
        
    }
}
