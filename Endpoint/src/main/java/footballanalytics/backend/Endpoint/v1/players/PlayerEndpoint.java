package footballanalytics.backend.Endpoint.v1.players;


import com.footballanalytics.backend.Application.common.interfaces.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@ComponentScan("com.footballanalytics.backend.Application")
@RequestMapping("/api/v1/integers")
public class PlayerEndpoint {

    private final PlayerService playerService;
    @GetMapping( value = "/index",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)

    public Flux<String>  players() {
        return Flux.just("Data1", "Data2", "Data3")
                .delayElements(java.time.Duration.ofSeconds(1));
    }
}