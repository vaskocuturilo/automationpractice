package com.automationpractice.tests;

import api.controllers.PostControllers;
import api.schema.Post;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ApiWithControllerTest {

    @org.testng.annotations.Test
    @Story("Get all posts from https://jsonplaceholder.typicode.com")
    public void testGet() {
        Post post = new Post();
        PostControllers postControllers = new PostControllers(post);
        postControllers.getElement();
    }

    @Test
    @Story("Add new post")
    public void testAddNewElement() {
        Post post = new Post(1, "Test", "Test", 1);
        PostControllers postControllers = new PostControllers(post);
        postControllers.addNewElement(post);
    }

}
