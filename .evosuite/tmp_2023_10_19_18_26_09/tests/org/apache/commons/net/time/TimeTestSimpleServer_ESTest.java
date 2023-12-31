/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:22:45 GMT 2023
 */

package org.apache.commons.net.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.net.time.TimeTestSimpleServer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeTestSimpleServer_ESTest extends TimeTestSimpleServer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.stop();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      TimeTestSimpleServer.main(stringArray0);
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.stop();
      try { 
        timeTestSimpleServer0.start();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer((-1829));
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.stop();
      // Undeclared exception!
      try { 
        timeTestSimpleServer0.connect();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -1829
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.isRunning();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer(1736);
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.isRunning();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.isRunning();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer((-1662));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Rm}Q4p_U";
      String string0 = "X;MDxUlsV&pC0,L2l";
      String[] stringArray1 = new String[3];
      stringArray1[0] = "X;MDxUlsV&pC0,L2l";
      stringArray1[1] = "X;MDxUlsV&pC0,L2l";
      stringArray1[2] = "X;MDxUlsV&pC0,L2l";
      TimeTestSimpleServer.main(stringArray1);
      // Undeclared exception!
      try { 
        timeTestSimpleServer0.start();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -1662
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "VE&ssy1puAq^.|T";
      stringArray0[1] = "";
      stringArray0[2] = "=!;UL";
      TimeTestSimpleServer.main(stringArray0);
      try { 
        timeTestSimpleServer0.connect();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer(0);
      timeTestSimpleServer0.connect();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.start();
      // Undeclared exception!
      timeTestSimpleServer0.run();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer(0);
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.getPort();
      String[] stringArray0 = null;
      timeTestSimpleServer0.getPort();
      TimeTestSimpleServer.main((String[]) null);
      TimeTestSimpleServer.main((String[]) null);
      timeTestSimpleServer0.getPort();
      TimeTestSimpleServer.main((String[]) null);
      timeTestSimpleServer0.stop();
      timeTestSimpleServer0.connect();
      timeTestSimpleServer0.start();
      TimeTestSimpleServer.main((String[]) null);
      timeTestSimpleServer0.connect();
      timeTestSimpleServer0.connect();
      timeTestSimpleServer0.stop();
      timeTestSimpleServer0.stop();
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.stop();
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.isRunning();
      timeTestSimpleServer0.connect();
      timeTestSimpleServer0.isRunning();
      timeTestSimpleServer0.getPort();
      TimeTestSimpleServer.main((String[]) null);
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.getPort();
      // Undeclared exception!
      timeTestSimpleServer0.run();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer();
      timeTestSimpleServer0.getPort();
      TimeTestSimpleServer.main((String[]) null);
      timeTestSimpleServer0.stop();
      TimeTestSimpleServer.main((String[]) null);
      try { 
        timeTestSimpleServer0.start();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer();
      timeTestSimpleServer0.connect();
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.stop();
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.isRunning();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "[p1$cY%nH;Fw";
      timeTestSimpleServer0.getPort();
      stringArray0[1] = "$?fq";
      TimeTestSimpleServer.main(stringArray0);
      try { 
        timeTestSimpleServer0.connect();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeTestSimpleServer timeTestSimpleServer0 = new TimeTestSimpleServer(0);
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.stop();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "@,q";
      timeTestSimpleServer0.run();
      timeTestSimpleServer0.getPort();
      stringArray0[1] = "";
      timeTestSimpleServer0.start();
      stringArray0[2] = "";
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.start();
      stringArray0[3] = "";
      timeTestSimpleServer0.connect();
      stringArray0[4] = "Ww,2^Tt0:+C:xLnq";
      stringArray0[5] = ")8e\"vM3\"";
      TimeTestSimpleServer.main(stringArray0);
      timeTestSimpleServer0.stop();
      timeTestSimpleServer0.isRunning();
      String[] stringArray1 = new String[0];
      TimeTestSimpleServer.main(stringArray1);
      TimeTestSimpleServer.main(stringArray1);
      timeTestSimpleServer0.connect();
      TimeTestSimpleServer.main(stringArray0);
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40002);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)121;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress0, byteArray0);
      timeTestSimpleServer0.getPort();
      timeTestSimpleServer0.start();
      timeTestSimpleServer0.start();
      // Undeclared exception!
      timeTestSimpleServer0.run();
  }
}
