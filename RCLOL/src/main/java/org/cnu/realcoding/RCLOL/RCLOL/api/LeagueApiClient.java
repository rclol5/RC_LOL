package org.cnu.realcoding.RCLOL.RCLOL.api;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentLeague;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeagueApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private final String apiKey = "RGAPI-9a8faed0-e79b-4cea-90d6-91525c040d87";
    private final String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private final String requestSummonerUrl = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{{encryptedSummonerId}}?api_key={apiKey}";




    public CurrentLeague getLeagueInformation(String encryptedId){
        return restTemplate.exchange(requestSummonerUrl, HttpMethod.GET, null, CurrentLeague.class, encryptedId, apiKey).getBody();
    }

}
