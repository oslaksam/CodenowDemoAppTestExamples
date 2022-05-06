package demoapp;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationRunner {

    @Karate.Test
    Karate testReservation() {
        return Karate.run("classpath:demoapp/reservation.feature")
                .karateEnv("e2e");
    }


    @Test
    void testParallel() {
        Results results = Runner.path("classpath:demoapp")
                .outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
