/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:19:47 GMT 2023
 */

package org.apache.commons.net.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.apache.commons.net.util.SSLSocketUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SSLSocketUtils_ESTest extends SSLSocketUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        SSLSocketUtils.enableEndpointNameVerification((SSLSocket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.SSLSocketUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SSLParameters sSLParameters0 = mock(SSLParameters.class, new ViolatedAssumptionAnswer());
      SSLSocket sSLSocket0 = mock(SSLSocket.class, new ViolatedAssumptionAnswer());
      doReturn(sSLParameters0).when(sSLSocket0).getSSLParameters();
      boolean boolean0 = SSLSocketUtils.enableEndpointNameVerification(sSLSocket0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SSLSocket sSLSocket0 = mock(SSLSocket.class, new ViolatedAssumptionAnswer());
      doReturn((SSLParameters) null).when(sSLSocket0).getSSLParameters();
      boolean boolean0 = SSLSocketUtils.enableEndpointNameVerification(sSLSocket0);
      assertFalse(boolean0);
  }
}
