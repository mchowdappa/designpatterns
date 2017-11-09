package com.mcp.designpatterns.creational.singleton.classic;

import org.apache.log4j.Logger;
import org.junit.Assert;

import junit.framework.TestCase;

public class ClassicSingletonTest extends TestCase {
   private ClassicSingleton sone = null, stwo = null;
   private static Logger logger = Logger.getLogger(ClassicSingletonTest.class);
   public ClassicSingletonTest(String name) {
      super(name);
   }
   public void setUp() {
      logger.info("getting singleton...");
      sone = ClassicSingleton.getInstance();
      logger.info("...got singleton: " + sone);
      logger.info("getting singleton...");
      stwo = ClassicSingleton.getInstance();
      logger.info("...got singleton: " + stwo);
     
   }
   public void testUnique() {
      logger.info("checking singletons for equality");
      Assert.assertEquals(true, sone == stwo);
   }
}