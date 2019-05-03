package org.cnu.realcoding.RCLOL.RCLOL.Service;

import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentSummoner;
import org.cnu.realcoding.RCLOL.RCLOL.api.OpenRiotGamesApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentSummonerService {
    @Autowired
    private OpenRiotGamesApiClient summonerapiclient;

    public CurrentSummoner getSummonerInfo(String summonername){
        return  summonerapiclient.getCurrentSummoner(summonername);
    }


}