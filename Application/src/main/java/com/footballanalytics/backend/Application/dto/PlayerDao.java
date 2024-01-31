package com.footballanalytics.backend.Application.dto;

import com.footballanalytics.backend.Domain.entities.Player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Repository
public interface PlayerDao {
    public Flux<Player> getPlayers();
}
