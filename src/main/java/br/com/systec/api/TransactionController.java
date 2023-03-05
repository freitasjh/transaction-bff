package br.com.systec.api;


import br.com.systec.dto.RequestTransactionDTO;
import br.com.systec.dto.TransactionDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDTO> enviarTransacao(@RequestBody RequestTransactionDTO requestTransactionDTO){

        return Mono.empty();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDTO> buscarTransacao(@PathVariable("id") final String id){

        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDTO> deletarTransacao(@PathVariable("id") final String id){

        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirmar")
    public Mono<TransactionDTO> confirmarTransacao(@PathVariable("id") final String id){

        return Mono.empty();
    }
}
