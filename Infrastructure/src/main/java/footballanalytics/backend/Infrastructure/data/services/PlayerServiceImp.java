package footballanalytics.backend.Infrastructure.data.services;

import com.footballanalytics.backend.Application.common.dto.PlayerDTo;
//import com.footballanalytics.backend.Application.common.dto.PlayerDao;
import com.footballanalytics.backend.Application.common.interfaces.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class PlayerServiceImp  {
    private final PlayerService playerService;

    public Flux<PlayerDTo> findAll(){
        return playerService.findAll();
    }
    public Mono<PlayerDTo> save(PlayerDTo playerDTo) {
        return playerService.save(playerDTo);
    }
}
