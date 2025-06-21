package dev.razafindratelo.hmr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HmrApplicationTest {

    @Test
    void test_init() {
        assertNotNull(HmrApplication.init());
        assertEquals("check-my-code-project initialized!", HmrApplication.init());
    }

}