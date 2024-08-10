package maruf.khandaker.quote.controller;

import maruf.khandaker.quote.model.Quote;
import maruf.khandaker.quote.repository.QuoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private QuoteRepository quoteRepository;

    public WebController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping
    public String show(Model model) {
        Quote quote = quoteRepository.getRandom();

        model.addAttribute("quote", quote);

        return "index";
    }
}
