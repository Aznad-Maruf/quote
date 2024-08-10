package maruf.khandaker.quote.model;

import com.google.gson.annotations.SerializedName;

public record Quote(@SerializedName("serial_no") int serialNo, String author, String quote) {}
