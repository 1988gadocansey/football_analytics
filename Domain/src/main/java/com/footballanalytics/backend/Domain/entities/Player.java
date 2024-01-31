package com.footballanalytics.backend.Domain.entities;

import com.footballanalytics.backend.Domain.valueobjects.PlayerName;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player {
    private String playerId;
    private PlayerName playerName;
    private String citizenship;
    private LocalDate dateOfBirth;
    private LocalDate Joined;
    private String position;
    private int shirtNumber;
    private int goalsScored;
    private int assists;
    private int minutesPlayed;
    private Team currentTeam;
    private String Avatar;


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