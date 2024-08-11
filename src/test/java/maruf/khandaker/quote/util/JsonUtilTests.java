package maruf.khandaker.quote.util;

import com.google.gson.Gson;
import maruf.khandaker.quote.model.Quote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonUtilTests {

    private JsonUtil jsonUtil;

    @BeforeEach
    public void setUp() {
        // Ensure the static file path matches where you place the file for testing
        jsonUtil = new JsonUtil();
    }

//    @Test
//    public void testReadJson() throws IOException {
//         List<Quote> actualQuotes = jsonUtil.readJson("static/quotes.json");
//
//        URL resource = getClass().getClassLoader().getResource("static/quotes.json");
//        if (resource == null) {
//            throw new IOException("Resource not found");
//        }
//    }
}
