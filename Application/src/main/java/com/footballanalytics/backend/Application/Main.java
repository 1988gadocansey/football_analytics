package com.footballanalytics.backend.Application;

import com.footballanalytics.backend.Application.dto.PlayerDao;
import com.footballanalytics.backend.Domain.entities.Player;
import com.footballanalytics.backend.Domain.entities.Team;
import com.footballanalytics.backend.Domain.valueobjects.PlayerName;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class Main implements PlayerDao {

    @Override
    public Flux<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        var player1 = new Player();
        player1.setPlayerId("1");
        player1.setPlayerName(new PlayerName("Andre","Onana",""));
        player1.setCitizenship("Cameroon");
        player1.setDateOfBirth(LocalDate.of(1990, 5, 15));
        player1.setJoined(LocalDate.of(2022, 1, 1));
        player1.setPosition("Forward");
        player1.setShirtNumber(10);
        player1.setGoalsScored(20);
        player1.setAssists(15);
        player1.setMinutesPlayed(1800);
        player1.setCurrentTeam(new Team("1","Man United","Ten Hag",2023));
        player1.setAvatar("john_doe_avatar.jpg");

        var player2 = new Player();
        player2.setPlayerId("2");
        player2.setPlayerName(new PlayerName("Harry","Maguire",""));
        player2.setCitizenship("UK");
        player2.setDateOfBirth(LocalDate.of(1995, 8, 20));
        player2.setJoined(LocalDate.of(2022, 2, 1));
        player2.setPosition("Midfielder");
        player2.setShirtNumber(8);
        player2.setGoalsScored(15);
        player2.setAssists(25);
        player2.setMinutesPlayed(2000);
        player2.setCurrentTeam(new Team("1","Man United","Ten Hag",2020));
        player2.setAvatar("alice_smith_avatar.jpg");

        players.add(player1);
        players.add(player2);
        return Flux.fromIterable(players);


    }
}
