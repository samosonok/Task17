import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapsTest {

    private Maps maps;


    @BeforeEach
    public void setUp(){
        maps = new Maps();
    }

    @Test
    public void shouldSwapKeysAndValues(){
        Map <String, Integer> testMap = new HashMap<>();
        Map <Integer, String> newTestMap = new HashMap<>();
        final String firstKey = "vbn";
        final String secondKey = "bnm";
        final String thirdKey = "uyi";

        final int firstValue = 94;
        final int secondValue = 45;
        final int thirdValue = 57;

        testMap.put(firstKey, firstValue);
        testMap.put(secondKey, secondValue);
        testMap.put(thirdKey, thirdValue);

        newTestMap.put(firstValue, firstKey);
        newTestMap.put(secondValue, secondKey);
        newTestMap.put(thirdValue, thirdKey);

        assertEquals(newTestMap, maps.swapKeysAndValues(testMap));
    }
}
