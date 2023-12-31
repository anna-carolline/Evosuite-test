/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:40:03 GMT 2023
 */

package org.apache.commons.net.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;
import org.apache.commons.net.time.TimeUDPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeUDPClient_ESTest extends TimeUDPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 398);
      byte[] byteArray0 = new byte[7];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      long long0 = timeUDPClient0.getTime(inetAddress0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 398);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 12345);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      long long0 = timeUDPClient0.getTime(inetAddress0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 398);
      byte[] byteArray0 = new byte[7];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      Date date0 = timeUDPClient0.getDate(inetAddress0, 398);
      assertEquals("Mon Jan 01 00:00:00 GMT 1900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 398);
      byte[] byteArray0 = new byte[7];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      Date date0 = timeUDPClient0.getDate(inetAddress0);
      assertEquals("Mon Jan 01 00:00:00 GMT 1900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      // Undeclared exception!
      try { 
        timeUDPClient0.getTime((InetAddress) null, 2709);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      timeUDPClient0.open();
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      // Undeclared exception!
      try { 
        timeUDPClient0.getTime(inetAddress0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-1
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      // Undeclared exception!
      try { 
        timeUDPClient0.getTime((InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      // Undeclared exception!
      try { 
        timeUDPClient0.getDate((InetAddress) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      // Undeclared exception!
      try { 
        timeUDPClient0.getDate((InetAddress) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-1
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      // Undeclared exception!
      try { 
        timeUDPClient0.getDate((InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      try { 
        timeUDPClient0.getTime(inetAddress0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      try { 
        timeUDPClient0.getTime(inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      try { 
        timeUDPClient0.getDate(inetAddress0, 398);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      timeUDPClient0.open(398);
      InetAddress inetAddress0 = timeUDPClient0.getLocalAddress();
      try { 
        timeUDPClient0.getDate(inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }
}
