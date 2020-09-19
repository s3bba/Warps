package com.sebbaindustries.warps;

import com.sebbaindustries.warps.generation.IDGeneration;
import com.sebbaindustries.warps.utils.NameParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestCore {

    public static Logger logger = Logger.getLogger("TestCore");

    @Test
    public void testGenerationSystem() {
        IDGeneration idGeneration = new IDGeneration();
        idGeneration.generateIDs(30);
        Assert.assertEquals(31, idGeneration.genID());
        idGeneration.generateIDs(20);
        Assert.assertEquals(52, idGeneration.genID());
    }

    @Test
    public void testParser() {
        NameParser np1 = new NameParser("someString6");
        NameParser np2 = new NameParser("someString6------");
        NameParser np3 = new NameParser("someS//////\\\\\tring6");
        NameParser np4 = new NameParser("#¸¸¸¸¸¸?");
        Assert.assertTrue(np1.isSafe());
        Assert.assertFalse(np2.isSafe());
        Assert.assertFalse(np3.isSafe());
        Assert.assertFalse(np4.isSafe());
        TestCore.logger.info(np1.returnColoredIllegals());
        TestCore.logger.info(np2.returnColoredIllegals());
        TestCore.logger.info(np3.returnColoredIllegals());
        TestCore.logger.info(np4.returnColoredIllegals());
    }

}
