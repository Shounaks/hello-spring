package org.shounak.hellospring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void assertTrueAlways() {
        Assertions.assertTrue(true);
    }

}
