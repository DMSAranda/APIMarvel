package add.api.marvel.mapeo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

@SerializedName("offset")
@Expose
private String offset;
@SerializedName("limit")
@Expose
private String limit;
@SerializedName("total")
@Expose
private String total;
@SerializedName("count")
@Expose
private String count;
@SerializedName("results")
@Expose
private List<Result> results = null;

public String getOffset() {
return offset;
}

public void setOffset(String offset) {
this.offset = offset;
}

public String getLimit() {
return limit;
}

public void setLimit(String limit) {
this.limit = limit;
}

public String getTotal() {
return total;
}

public void setTotal(String total) {
this.total = total;
}

public String getCount() {
return count;
}

public void setCount(String count) {
this.count = count;
}

public List<Result> getResults() {
return results;
}

public void setResults(List<Result> results) {
this.results = results;
}

}