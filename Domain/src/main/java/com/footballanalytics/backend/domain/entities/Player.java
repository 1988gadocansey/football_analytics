package com.footballanalytics.backend.domain.entities;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player {
    private String playerId;
    private String playerName;
    private Date dateOfBirth;
    private String position;
    private int shirtNumber;
    private int goalsScored;
    private int assists;
    private int minutesPlayed;
    private Team currentTeam;


    public void scoreGoal() {
        goalsScored++;
        System.out.println(playerName + " scored a goal!");
    }

    public void assist() {
        assists++;
        System.out.println(playerName + " provided an assist!");
    }

    public void playMinutes(int minutes) {
        minutesPlayed += minutes;
    }

    public double calculateGoalToMinuteRatio() {
        if (minutesPlayed == 0) {
            return 0.0;
        }
        return (double) goalsScored / minutesPlayed;
    }


}