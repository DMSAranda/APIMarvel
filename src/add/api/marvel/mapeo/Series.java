package add.api.marvel.mapeo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Series {

@SerializedName("available")
@Expose
private String available;
@SerializedName("returned")
@Expose
private String returned;
@SerializedName("collectionURI")
@Expose
private String collectionURI;
@SerializedName("items")
@Expose
private List<Item__3> items = null;

public String getAvailable() {
return available;
}

public void setAvailable(String available) {
this.available = available;
}

public String getReturned() {
return returned;
}

public void setReturned(String returned) {
this.returned = returned;
}

public String getCollectionURI() {
return collectionURI;
}

public void setCollectionURI(String collectionURI) {
this.collectionURI = collectionURI;
}

public List<Item__3> getItems() {
return items;
}

public void setItems(List<Item__3> items) {
this.items = items;
}

}