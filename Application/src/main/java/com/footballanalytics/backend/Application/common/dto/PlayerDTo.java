package com.footballanalytics.backend.Application.common.dto;

import com.footballanalytics.backend.Domain.entities.Team;
import com.footballanalytics.backend.Domain.valueobjects.PlayerName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

 @Setter
 @Getter
public class PlayerDTo  {
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
}
