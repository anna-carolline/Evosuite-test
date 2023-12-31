/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:24:25 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTP;
import org.apache.commons.net.tftp.TFTPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPClient_ESTest extends TFTPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(0);
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      assertEquals(0, byteArray0.length);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      InetAddress inetAddress0 = tFTPClient0.getLocalAddress();
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertFalse(inetAddress0.isMCGlobal());
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inetAddress0.toString());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertNotNull(inetAddress0);
      
      try { 
        tFTPClient0.sendFile("INCORRECT SOURCE PORT", 0, inputStream0, inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad packet: Bad packet. Datagram data length is too short.
         //
         verifyException("org.apache.commons.net.tftp.TFTPClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(0);
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      InetAddress inetAddress0 = tFTPClient0.getLocalAddress();
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertFalse(inetAddress0.isMCGlobal());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertEquals("/192.168.1.42", inetAddress0.toString());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertNotNull(inetAddress0);
      
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("INCORRECT SOURCE PORT", 1412, inputStream0, inetAddress0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1412
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open();
      assertTrue(tFTPClient0.isOpen());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("", 111, (InputStream) null, "", 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 111
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(1);
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      
      try { 
        tFTPClient0.sendFile("", 1, (InputStream) null, "", 13);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(13);
      assertTrue(tFTPClient0.isOpen());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(0, TFTP.NETASCII_MODE);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("L[PU~^", (int) (byte)8, inputStream0, "org.apache.commons.net.DatagramSocketClient");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(562, (InetAddress) null);
      assertTrue(tFTPClient0.isOpen());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("", 69, outputStream0, (InetAddress) null, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 69
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertNotNull(tFTPClient0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("", (-1629), outputStream0, (InetAddress) null);
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
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(13);
      assertTrue(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      InetAddress inetAddress0 = tFTPClient0.getLocalAddress();
      assertTrue(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertEquals("/192.168.1.42", inetAddress0.toString());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertFalse(inetAddress0.isMCGlobal());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertNotNull(inetAddress0);
      
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("L[PU~^", (int) (byte) (-58), outputStream0, inetAddress0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -58
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertFalse(tFTPClient0.isOpen());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open();
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("-mZuR/|G&]pox1bt<%y", 1470, (OutputStream) null, "-mZuR/|G&]pox1bt<%y", 163);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1470
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.ASCII_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open();
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.ASCII_MODE);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("File write failed.", 1258, outputStream0, "q=_B7^%$k");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1258
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open();
      assertTrue(tFTPClient0.isOpen());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.NETASCII_MODE);
      
      try { 
        tFTPClient0.receiveFile("3Y/7#}Z*EFsE?ejsq", 0, (OutputStream) null, (String) null);
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
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertNotNull(tFTPClient0);
      
      tFTPClient0.open(13);
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.NETASCII_MODE);
      
      InetAddress inetAddress0 = tFTPClient0.getLocalAddress();
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertTrue(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCGlobal());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertEquals("/192.168.1.42", inetAddress0.toString());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertNotNull(inetAddress0);
      
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("0wm$z.t8Y`=u", 13, (InputStream) null, inetAddress0, 130);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertNotNull(tFTPClient0);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("", 0, inputStream0, (InetAddress) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      assertEquals("windows-1252", tFTPClient0.getCharsetName());
      assertEquals(0L, tFTPClient0.getTotalBytesSent());
      assertEquals(5000, tFTPClient0.getDefaultTimeout());
      assertEquals(5, tFTPClient0.getMaxTimeouts());
      assertFalse(tFTPClient0.isOpen());
      assertEquals(0L, tFTPClient0.getTotalBytesReceived());
      assertEquals(5, TFTPClient.DEFAULT_MAX_TIMEOUTS);
      assertEquals(5000, TFTP.DEFAULT_TIMEOUT);
      assertEquals(69, TFTP.DEFAULT_PORT);
      assertEquals(1, TFTP.IMAGE_MODE);
      assertEquals(1, TFTP.OCTET_MODE);
      assertEquals(1, TFTP.BINARY_MODE);
      assertEquals(0, TFTP.ASCII_MODE);
      assertEquals(0, TFTP.NETASCII_MODE);
      assertNotNull(tFTPClient0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("Error code ", 0, outputStream0, (InetAddress) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("[W\"QdJJK^wy)", 0, inputStream0, "`e", 2113);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("3Y/7#}Z*EFsE?ejsq", 0, (OutputStream) null, "3Y/7#}Z*EFsE?ejsq");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      tFTPClient0.setMaxTimeouts(122);
      int int0 = tFTPClient0.getMaxTimeouts();
      assertEquals(122, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("L[PU~^", (int) (byte)8, inputStream0, "org.apache.commons.net.DatagramSocketClient");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.sendFile("", (-786), inputStream0, (InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tFTPClient0.receiveFile("r6|(QN2Z", 1, outputStream0, "GsAC@HIzBe+8ws", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      tFTPClient0.getTotalBytesSent();
      assertEquals(5, tFTPClient0.getMaxTimeouts());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      tFTPClient0.open(13);
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      InetAddress inetAddress0 = tFTPClient0.getLocalAddress();
      try { 
        tFTPClient0.receiveFile("L[PU~^", (int) (byte)0, outputStream0, inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      tFTPClient0.getTotalBytesReceived();
      assertEquals(5, tFTPClient0.getMaxTimeouts());
  }
}
