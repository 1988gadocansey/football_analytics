package com.footballanalytics.backend.Web.v1.players;

import com.footballanalytics.backend.Application.common.interfaces.PlayerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController

@RequestMapping("/api/v1/integers")
@ComponentScan(basePackageClasses = com.footballanalytics.backend.Application.common.interfaces.PlayerService.class)
public class PlayerEndpoint {

    private final PlayerService playerService;

    @Autowired
    public PlayerEndpoint(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping(value = "/index", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<String> players() {
        log.debug("index endpoint called");
        return Flux.just("Data1", "Data2", "Data3")
                .delayElements(java.time.Duration.ofSeconds(1));
    }
}
