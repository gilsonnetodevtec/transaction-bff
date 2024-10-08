package br.com.coffeeandit.transaction_bff.api;

import br.com.coffeeandit.transaction_bff.dto.RequestTransactionDto;
import br.com.coffeeandit.transaction_bff.dto.TransactionDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> enviarTransacao(@RequestBody final RequestTransactionDto requestTransactionDto) {
        return Mono.empty();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> buscarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> removerTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirmar")
    public Mono<TransactionDto> confirmarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

}
