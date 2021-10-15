package Ariba;

public class Cricket extends Sports {
	String matchType;
    int over;
    Player player;
    Cricket(String matchType,int over,Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }
    void display()
    {
        System.out.println("Match Type : " +matchType);
        System.out.println("Over of the match : " +over);
        System.out.println("Name of the player : " +player.playerName);
        System.out.println("Jersey Number : " +player.jerseyNumber);   
    }  
}

/* 
Name : Ariba Khan 
ID: 2012020325
Sec: G 
Email: cse_2012020325@lus.ac.bd
date: 15/09/2021 
*/