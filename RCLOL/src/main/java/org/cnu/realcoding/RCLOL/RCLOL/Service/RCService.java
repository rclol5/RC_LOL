package org.cnu.realcoding.RCLOL.RCLOL.Service;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.Champion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RCService {

    private List<Champion> ChampionList = new ArrayList<>();


    public void insertChampion(Champion champ){
        ChampionList.add(champ);
    }

    public List<Champion> getAllChampions(){
        return ChampionList;
    }

    public Champion getChampionsByName(String name){
        for (int i = 0; i < ChampionList.size(); i++){
            Champion target = ChampionList.get(i);
            if(target.getName().equals(name)){
                return target;
            }
        }

        return null;
    }

    public void updateChampion(Champion champ){
        for(int i = 0; i < ChampionList.size(); i++){
            Champion target = ChampionList.get(i);
            if(target.getName().equals(champ.getName())){
                target.setID(champ.getID());
                break;
            }
        }
    }

    public void removeChampion(String name){
        for(int i = 0; i < ChampionList.size(); i++){
            Champion target = ChampionList.get(i);
            if(target.getName().equals(name)){
                ChampionList.remove(target);
                break;
            }
        }
    }
}
