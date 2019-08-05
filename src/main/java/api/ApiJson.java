package api;

import api.schema.Post;
import io.restassured.path.json.JsonPath;

import java.util.List;

public class ApiJson {


    private static final String JSON_PATH = "RestResponse.result";

    private final JsonPath jsonPath;

    private ApiJson(String json) {
        this.jsonPath = JsonPath.from(json);
    }

    public static ApiJson from(String json) {
        return new ApiJson(json);
    }


    public Post getPost() {

        return jsonPath.getObject(JSON_PATH, Post.class);
    }

    public List<Post> getAllPosts() {
        return jsonPath.getList(JSON_PATH, Post.class);
    }

}
