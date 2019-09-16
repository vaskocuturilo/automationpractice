package api.controllers;

import api.AbstractController;
import api.schema.Post;
import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.RestAssured.given;


/**
 * The type Post controllers.
 */
public class PostControllers extends AbstractController {

    /**
     * Private value post.
     */
    private Post newPost;

    /**
     * Private value specBuilder.
     */
    private RequestSpecBuilder specBuilder = new RequestSpecBuilder()
            .addHeader("Content-type", "application/json; charset=UTF-8")
            .setBasePath("posts");

    /**
     * Instantiates a new Post controllers.
     *
     * @param post the post
     */
    public PostControllers(final Post post) {
        super();
        this.newPost = post;
    }

    /**
     * Gets element.
     *
     * @return the element
     */
    public Post getElement() {

        return given(specBuilder.build()).get(String.valueOf(newPost.getId())).as(Post.class);
    }

    /**
     * Add new element post.
     *
     * @param post the post
     * @return the post
     */
    public Post addNewElement(final Post post) {

        return given(specBuilder.build()).body(post).when().post().as(Post.class);
    }

    @Override
    public void AbstractController() { }
}
