package add.api.marvel.mapeo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Item__1 {

@SerializedName("resourceURI")
@Expose
private String resourceURI;
@SerializedName("name")
@Expose
private String name;
@SerializedName("type")
@Expose
private String type;

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

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

}