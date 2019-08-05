package com.automationpractice.tests;

import api.ApiJson;
import api.schema.Post;
import base.BaseApiClass;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static api.GetRequest.postGetRequest;
import static org.testng.Assert.assertTrue;

@Feature("API automation scripts")
public class ApiTest extends BaseApiClass {


    private static final String GET_ALL = "/posts";

    @Test
    @Story("Get all posts from https://jsonplaceholder.typicode.com")
    public void getAllPosts() {
        final String resultApiJson = postGetRequest(GET_ALL);
        final ApiJson apiJson = ApiJson.from(resultApiJson);
        final List<Post> result = apiJson.getAllPosts();
        final Set<String> alphaCodes = result.stream().map(Post::getTitle).collect(Collectors.toSet());
        assertTrue(alphaCodes.contains("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }
}


