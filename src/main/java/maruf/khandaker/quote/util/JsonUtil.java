package maruf.khandaker.quote.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import maruf.khandaker.quote.model.Quote;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonUtil {

    public List<Quote> readJson(String filePath) throws IOException {
        Gson gson = new Gson();

        FileReader reader = new FileReader("/home/khandaker.maruf/MyFiles/Projects/quote/src/main/resources/static/quotes.json");

        List<Quote> quotes = gson.fromJson(reader, new TypeToken<List<Quote>>() {}.getType());

        reader.close();

        return quotes;
    }
}
