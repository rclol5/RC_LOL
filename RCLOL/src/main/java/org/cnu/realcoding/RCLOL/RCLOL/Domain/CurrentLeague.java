package org.cnu.realcoding.RCLOL.RCLOL.Domain;

public class CurrentLeague {

    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private MiniseriesDTO miniseriesDTO;
    private int wins;
    private int losses;
    private boolean veteran;
    private String rank;
    private String leagueld;
    private boolean inactive;
    private boolean freshBlood;
    private String tier;
    private String summonerald;
    private int leaguePoints;



    public class MiniseriesDTO{
        private String progress;
        private int losses;
        private int target;
        private int wins;
    }


}

