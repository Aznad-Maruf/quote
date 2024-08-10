package maruf.khandaker.quote.repository;

import maruf.khandaker.quote.model.Quote;
import maruf.khandaker.quote.util.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@Repository
public class StaticQuoteRepositoryImpl implements QuoteRepository{

    @Value("${quotes.file.path}")
    private String quotesFilePath;

    @Override
    public Quote getRandom() {
        try {
            List<Quote> quotes = new JsonUtil().readJson(quotesFilePath);
            return getRandom(quotes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private <T> T getRandom(List<T> list) {
        Random random = new Random();
        int randomIndex = random.nextInt(0, list.size());

        return list.get(randomIndex);
    }
}
