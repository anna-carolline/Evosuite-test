/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:09:26 GMT 2023
 */

package org.apache.commons.net.ftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLContext;
import org.apache.commons.net.ftp.FTPSSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FTPSSocketFactory_ESTest extends FTPSSocketFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createServerSocket(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      InetAddress inetAddress0 = mock(InetAddress.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createSocket("", 0, inetAddress0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      InetAddress inetAddress0 = mock(InetAddress.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createSocket(inetAddress0, 0, inetAddress0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createServerSocket(846, (-350));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory((SSLContext) null);
      InetAddress inetAddress0 = mock(InetAddress.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createSocket(inetAddress0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.FTPSSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createSocket("^Sp&", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createSocket();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.init((ServerSocket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.FTPSSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InetAddress inetAddress0 = mock(InetAddress.class, new ViolatedAssumptionAnswer());
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      FTPSSocketFactory fTPSSocketFactory0 = new FTPSSocketFactory(sSLContext0);
      // Undeclared exception!
      try { 
        fTPSSocketFactory0.createServerSocket((-1), 0, inetAddress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.net.ssl.SSLContext", e);
      }
  }
}
