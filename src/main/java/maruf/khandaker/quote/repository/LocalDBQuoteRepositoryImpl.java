package maruf.khandaker.quote.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import maruf.khandaker.quote.model.Quote;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public class LocalDBQuoteRepositoryImpl implements QuoteRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Quote getRandom() {
        String sql = "SELECT * FROM quote ORDER BY RANDOM() LIMIT 1";
        Query query = em.createNativeQuery(sql, Quote.class);

        return (Quote) query.getSingleResult();
    }
}
