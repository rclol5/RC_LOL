package org.cnu.realcoding.RCLOL.RCLOL.controller;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentLeague;
import org.cnu.realcoding.RCLOL.RCLOL.Service.RCService;
import org.cnu.realcoding.RCLOL.RCLOL.api.LeagueApiClient;
import org.cnu.realcoding.RCLOL.RCLOL.api.OpenRiotGamesApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LOLController {
    @Autowired
    private RCService rcService;

    LeagueApiClient lll = new LeagueApiClient();
    OpenRiotGamesApiClient asd = new OpenRiotGamesApiClient();

    @PostMapping("/SummonerId/{name}")
    public CurrentLeague get(@RequestParam String name){
        String id =  asd.getCurrentSummoner(name).getId();
       return lll.getLeagueInformation(id);


    }



//
//    @PostMapping("/Champions")
//    public void insertChampion(@RequestParam Champion champ){
//
//        rcService.insertChampion(champ);
//
//    }
//
//    @GetMapping("/Champions")
//    public List<Champion> getAllChampions(){
//    return rcService.getAllChampions();
//    }
//
//    @GetMapping("/Champions/{name}")
//    public Champion getChampionByName(@PathVariable String name){
//        return rcService.getChampionsByName(name);
//    }
//
//    @PutMapping("/Champions")
//    public void updateChampion(@RequestBody Champion champ){
//        rcService.updateChampion(champ);
//    }
//
//    @DeleteMapping("/Champions")
//    public void removeChampion(@RequestParam String name){
//        rcService.removeChampion(name);
//    }
}
