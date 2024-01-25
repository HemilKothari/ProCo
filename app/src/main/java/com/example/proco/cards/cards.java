package com.example.proco.cards;

public class cards {


    private String userId;
    private String name;
    private String profileimageurl;private String need;private String give;
    private String budget;

    public cards(String budget, String userId, String name, String profileimageurl, String need,String give) {
        this.budget = budget;
        this.userId=userId;
        this.name=name;
        this.profileimageurl=profileimageurl;
        this.need=need;
        this.give=give;
    }
}




