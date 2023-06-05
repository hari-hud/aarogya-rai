
package in.aarogyarai.pojo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Response schema for create video
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "url",
    "likes",
    "dis_likes",
    "views"
})
@Generated("jsonschema2pojo")
public class CreateVideoResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private String url;
    @JsonProperty("likes")
    private String likes;
    @JsonProperty("dis_likes")
    private String disLikes;
    @JsonProperty("views")
    private String views;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CreateVideoResponse withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CreateVideoResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVideoResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public CreateVideoResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("likes")
    public String getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(String likes) {
        this.likes = likes;
    }

    public CreateVideoResponse withLikes(String likes) {
        this.likes = likes;
        return this;
    }

    @JsonProperty("dis_likes")
    public String getDisLikes() {
        return disLikes;
    }

    @JsonProperty("dis_likes")
    public void setDisLikes(String disLikes) {
        this.disLikes = disLikes;
    }

    public CreateVideoResponse withDisLikes(String disLikes) {
        this.disLikes = disLikes;
        return this;
    }

    @JsonProperty("views")
    public String getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(String views) {
        this.views = views;
    }

    public CreateVideoResponse withViews(String views) {
        this.views = views;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CreateVideoResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateVideoResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("likes");
        sb.append('=');
        sb.append(((this.likes == null)?"<null>":this.likes));
        sb.append(',');
        sb.append("disLikes");
        sb.append('=');
        sb.append(((this.disLikes == null)?"<null>":this.disLikes));
        sb.append(',');
        sb.append("views");
        sb.append('=');
        sb.append(((this.views == null)?"<null>":this.views));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.views == null)? 0 :this.views.hashCode()));
        result = ((result* 31)+((this.likes == null)? 0 :this.likes.hashCode()));
        result = ((result* 31)+((this.disLikes == null)? 0 :this.disLikes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateVideoResponse) == false) {
            return false;
        }
        CreateVideoResponse rhs = ((CreateVideoResponse) other);
        return (((((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.views == rhs.views)||((this.views!= null)&&this.views.equals(rhs.views))))&&((this.likes == rhs.likes)||((this.likes!= null)&&this.likes.equals(rhs.likes))))&&((this.disLikes == rhs.disLikes)||((this.disLikes!= null)&&this.disLikes.equals(rhs.disLikes))));
    }

}
