package maruf.khandaker.quote.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import maruf.khandaker.quote.model.Quote;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
    public static List<Quote> readJson(String resourcePath) throws IOException {
        InputStream inputStream = JsonUtil.class.getClassLoader().getResourceAsStream(resourcePath);
        if (inputStream == null) {
            throw new IOException("Resource not found: " + resourcePath);
        }

        Type listType = new TypeToken<List<Quote>>() {}.getType();
        Gson gson = new Gson();

        return gson.fromJson(new InputStreamReader(inputStream), listType);
    }
}
