import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by nurudeenlawal on 6/9/16.
 */

@RunWith(Parameterized.class)
public class NumberInWordOutParameterizedTest {

    private int inputNumber;
    private String outputWord;

    public NumberInWordOutParameterizedTest(String name, int inputNumber, String outputWord) {
        this.inputNumber = inputNumber;
        this.outputWord = outputWord;
    }

    @Test
    public void timeToWordTest() {
        app app = new app();
        Assert.assertEquals(app.numberInWordOut(inputNumber), outputWord);
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> params() {
        Collection<Object[]> params = new ArrayList<>();
        params.add(new Object[]{"oneTest", 1, "OneDollars"});
        params.add(new Object[]{"twoTest", 2, "TwoDollars"});
        params.add(new Object[]{"tensTest", 15, "FifteenDollars"});
        params.add(new Object[]{"hundredsTest", 525, "FiveHundredTwentyFiveDollars"});
        params.add(new Object[]{"thousandsTest", 5125, "FiveThousandOneHundredTwentyFiveDollars"});
        params.add(new Object[]{"tensofthousandsTest", 50125, "FiftyThousandOneHundredTwentyFiveDollars"});
        params.add(new Object[]{"hundredsofthousandsTest", 400125, "FourHundredThousandOneHundredTwentyFiveDollars"});
        params.add(new Object[]{"millionsTest", 3000125, "ThreeMillionOneHundredTwentyFiveDollars"});
        params.add(new Object[]{"tensOfmillionsTest", 30000125, "ThirtyMillionOneHundredTwentyFiveDollars"});
        params.add(new Object[]{"hundredsOfmillionsTest", 300000125, "ThreeHundredMillionOneHundredTwentyFiveDollars"});



        return params;
    }

}