/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:27:24 GMT 2023
 */

package org.apache.commons.net.examples.telnet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.examples.telnet.TelnetClientExample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TelnetClientExample_ESTest extends TelnetClientExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      telnetClientExample0.receivedNegotiation(890, 512);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("spy.log");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String[] stringArray0 = new String[1];
      try { 
        TelnetClientExample.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      // Undeclared exception!
      try { 
        telnetClientExample0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.telnet.TelnetClientExample", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      try { 
        TelnetClientExample.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.telnet.TelnetClientExample", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      telnetClientExample0.receivedNegotiation(4, 4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      telnetClientExample0.receivedNegotiation(3, 3);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      telnetClientExample0.receivedNegotiation(2, 220);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      try { 
        TelnetClientExample.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        TelnetClientExample.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      try { 
        TelnetClientExample.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      telnetClientExample0.receivedNegotiation(1, (-525));
  }
}
