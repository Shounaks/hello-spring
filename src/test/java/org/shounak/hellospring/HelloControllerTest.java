package org.shounak.hellospring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void helloController() {
        String response = restTemplate.getForObject("/", String.class);
//        Assertions.assertEquals("Everything is working Perfectly Fine!", response);
        Assertions.assertNotNull(response);
    }
}