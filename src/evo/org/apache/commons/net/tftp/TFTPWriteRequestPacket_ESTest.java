/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:35:26 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTPWriteRequestPacket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPWriteRequestPacket_ESTest extends TFTPWriteRequestPacket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket((InetAddress) null, 4625, "", 310);
      // Undeclared exception!
      try { 
        tFTPWriteRequestPacket0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 310
         //
         verifyException("org.apache.commons.net.tftp.TFTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0, inetAddress0, (byte)0);
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
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0);
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = null;
      try {
        tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(datagramPacket0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = null;
      try {
        tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket((DatagramPacket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPWriteRequestPacket tFTPWriteRequestPacket0 = new TFTPWriteRequestPacket(inetAddress0, 2053, "netascii", 0);
      String string0 = tFTPWriteRequestPacket0.toString();
      assertEquals("/192.168.1.42 2053 2 WRQ netascii netascii", string0);
  }
}