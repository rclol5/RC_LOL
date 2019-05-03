package org.cnu.realcoding.RCLOL.RCLOL.repository;


import org.cnu.realcoding.RCLOL.RCLOL.Domain.CurrentSummoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoLData {

    @Autowired
    private MongoTemplate mongoTemplate;


    public void InsertData(CurrentSummoner encryptedSummonerID){

        this.mongoTemplate.insert(encryptedSummonerID);
    }


}
