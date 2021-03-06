package main;

import java.util.Arrays;
import java.util.List;

public class TennisGame2 implements TennisGame
{

    public String P1res = "";
    public String P2res = "";
    private Player player1;
    private Player player2;

    private List<String> scoreNames = Arrays.asList("Love", "Fifteen", "Thirty", "Forty", "Deuce");

    public TennisGame2(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    public String getScore(){
        String score = "";
        if (player1.getScore() == player2.getScore() && player1.getScore() < 4)
        {
            score = scoreNames.get(player1.getScore());
            score += "-All";
        }
        if (player1.getScore()==player2.getScore() && player1.getScore()>3)
            score = "Deuce";

        if (player1.getScore() > 0 && player2.getScore()==0)
        {
            if (player1.getScore()==1)
                P1res = "Fifteen";
            if (player1.getScore()==2)
                P1res = "Thirty";
            if (player1.getScore()==3)
                P1res = "Forty";

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2.getScore() > 0 && player1.getScore()==0)
        {
            if (player2.getScore()==1)
                P2res = "Fifteen";
            if (player2.getScore()==2)
                P2res = "Thirty";
            if (player2.getScore()==3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (player1.getScore()>player2.getScore() && player1.getScore() < 4)
        {
            if (player1.getScore()==2)
                P1res="Thirty";
            if (player1.getScore()==3)
                P1res="Forty";
            if (player2.getScore()==1)
                P2res="Fifteen";
            if (player2.getScore()==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (player2.getScore()>player1.getScore() && player2.getScore() < 4)
        {
            if (player2.getScore()==2)
                P2res="Thirty";
            if (player2.getScore()==3)
                P2res="Forty";
            if (player1.getScore()==1)
                P1res="Fifteen";
            if (player1.getScore()==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }

        if (player1.getScore() > player2.getScore() && player2.getScore() >= 3)
        {
            score = "Advantage player1";
        }

        if (player2.getScore() > player1.getScore() && player1.getScore() >= 3)
        {
            score = "Advantage player2";
        }

        if (player1.getScore()>=4 && player2.getScore()>=0 && (player1.getScore()-player2.getScore())>=2)
        {
            score = "Win for player1";
        }
        if (player2.getScore()>=4 && player1.getScore()>=0 && (player2.getScore()-player1.getScore())>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void P1Score(){
        player1.setScore(1);
    }

    public void P2Score(){
        player2.setScore(1);
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}
