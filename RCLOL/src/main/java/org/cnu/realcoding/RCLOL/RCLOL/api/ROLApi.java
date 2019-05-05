package org.cnu.realcoding.RCLOL.RCLOL.api;

import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentLeague;
import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentSummoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Service
public class ROLApi {


    @Autowired
    private RestTemplate restTemplate;

    private String apiKey = "RGAPI-6dcfdf1a-d43b-49df-94f1-ad6058ffae0a";

    private String requestSummonerNameUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private String requestEncryptedSummonerIdUrl="https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedSummonerId}?api_key={apiKey}";

    public CurrentSummoner getEncryptedId(String userName) {
        return restTemplate.exchange(requestSummonerNameUrl, HttpMethod.GET, null, CurrentSummoner.class, userName, apiKey).getBody();
    }

    private Set<CurrentLeague> leagueSet = new HashSet<CurrentLeague>();
    public Set<CurrentLeague> getLeague(String encryptedSummonerId) {
        return restTemplate.exchange(requestEncryptedSummonerIdUrl, HttpMethod.GET, null, Set.class, encryptedSummonerId, apiKey)
                .getBody();
    }
}
