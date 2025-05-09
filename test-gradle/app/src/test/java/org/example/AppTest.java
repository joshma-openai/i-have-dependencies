package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void appRunsWithoutException() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            fail("App.main should not throw an exception, but threw: " + e);
        }
    }
}
