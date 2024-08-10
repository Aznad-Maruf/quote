package maruf.khandaker.quote.controller;

import maruf.khandaker.quote.model.Quote;
import maruf.khandaker.quote.repository.QuoteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    private final QuoteRepository quoteRepository;

    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping
    public ResponseEntity<Quote> getRandom() {
        return ResponseEntity.ok(quoteRepository.getRandom());
    }
}
