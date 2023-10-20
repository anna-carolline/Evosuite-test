/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:00:33 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTPReadRequestPacket;
import org.apache.commons.net.tftp.TFTPWriteRequestPacket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPRequestPacket_ESTest extends TFTPRequestPacket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0, 0, inetAddress0, (byte)73);
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(inetAddress0, (byte)57, "(FeL*D:9X%o_d", 0);
      // Undeclared exception!
      try { 
        tFTPWriteRequestPacket0.newDatagram(datagramPacket0, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket((InetAddress) null, 0, "", 0);
      DatagramPacket datagramPacket0 = tFTPWriteRequestPacket0.newDatagram();
      assertEquals(0, tFTPWriteRequestPacket0.getMode());
      assertEquals(0, datagramPacket0.getPort());
      assertEquals(13, datagramPacket0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(inetAddress0, 0, "LoyiQaY0iA@gtn$<=D=", 0);
      int int0 = tFTPWriteRequestPacket0.getMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket((InetAddress) null, 0, "", 7);
      int int0 = tFTPWriteRequestPacket0.getMode();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(inetAddress0, 0, "LoyiQaY0iA@gtn$<=D=", 0);
      tFTPWriteRequestPacket0.getFilename();
      assertEquals(0, tFTPWriteRequestPacket0.getMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(inetAddress0, 1788, "", 1788);
      tFTPWriteRequestPacket0.getFilename();
      assertEquals(1788, tFTPWriteRequestPacket0.getMode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket((InetAddress) null, (-332), "E5lcGV>OWU'\u0005njw", 0);
      // Undeclared exception!
      try { 
        tFTPWriteRequestPacket0.newDatagram();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-332
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TFTPReadRequestPacket tFTPReadRequestPacket0 = new TFTPReadRequestPacket((InetAddress) null, 866, (String) null, 389);
      tFTPReadRequestPacket0.getFilename();
      assertEquals(389, tFTPReadRequestPacket0.getMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, (byte)3, 0);
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = null;
      try {
        tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(datagramPacket0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // TFTP operator code does not match type.
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(inetAddress0, (-508), (String) null, (-508));
      byte[] byteArray0 = new byte[6];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 2, inetAddress0, 4);
      // Undeclared exception!
      try { 
        tFTPWriteRequestPacket0.newDatagram(datagramPacket0, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      TFTPReadRequestPacket tFTPReadRequestPacket0 = new TFTPReadRequestPacket(inetAddress0, (-1427), "/ PxU?w", (-1427));
      // Undeclared exception!
      try { 
        tFTPReadRequestPacket0.newDatagram();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1427
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      TFTPReadRequestPacket tFTPReadRequestPacket0 = new TFTPReadRequestPacket(inetAddress0, (-1427), "/ PxU?w", (-1427));
      int int0 = tFTPReadRequestPacket0.getMode();
      assertEquals((-1427), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      TFTPReadRequestPacket tFTPReadRequestPacket0 = new TFTPReadRequestPacket(inetAddress0, 0, (String) null, 0);
      // Undeclared exception!
      try { 
        tFTPReadRequestPacket0.newDatagram();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }
}