package org.cnu.realcoding.RCLOL.RCLOL.api;

import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentSummoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenRiotGamesApiClient {
    @Autowired
    private RestTemplate restTemplate;
    //
    private final String apiKey = "RGAPI-9a8faed0-e79b-4cea-90d6-91525c040d87";
    private final String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private final String requstSummoner = "  https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{{encryptedSummonerId}}?api_key={apiKey}";

    public CurrentSummoner getCurrentSummoner(String summonerName) {
        CurrentSummoner currentsummoner = restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentSummoner.class, summonerName, apiKey)
                .getBody();
        return currentsummoner;
        //api
    }

    //incript ㅇㅏ이디
    //current summoner받을 그릇 만들고
    //encrypted Id 받을 그릇 만들고

    //encrypted Id 는 리스트 형태로 날라옴
    //http에 저번 Dog실습 했던것처럼 올려야 함
}

