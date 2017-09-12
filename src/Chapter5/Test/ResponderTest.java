package Test;

import main.Responder;
import org.junit.Test;

import java.util.Random;

/**
 * Author: Joris Rietveld <jorisrietveld@gmail.com>
 * Created: 04-09-2017 21:36
 * Licence: GPLv3 - General Public Licence version 3
 */
public class ResponderTest
{
    @Test
    public void someTest()
    {
        //Responder responder = new Responder();
        //assertEquals("You fucked up! dont fuck it up...", 0, 1);
    }

    @Test
    public void generateUnOrderedListMarkDown()
    {
        int chapter = 8;
        int toNummer = 19;

        for (int fromNumber = 0; fromNumber < toNummer; fromNumber++) {
            System.out.printf(" - %d.%d\n", chapter, fromNumber);
        }
    }
}
