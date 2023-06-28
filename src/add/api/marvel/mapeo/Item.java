package add.api.marvel.mapeo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Item {

@SerializedName("resourceURI")
@Expose
private String resourceURI;
@SerializedName("name")
@Expose
private String name;

public String getResourceURI() {
return resourceURI;
}

public void setResourceURI(String resourceURI) {
this.resourceURI = resourceURI;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

}