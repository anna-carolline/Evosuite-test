/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:33:35 GMT 2023
 */

package org.apache.commons.net.examples.mail;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.examples.mail.IMAPUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IMAPUtils_ESTest extends IMAPUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        IMAPUtils.imapLogin((URI) null, (-1068), (ProtocolCommandListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URI uRI0 = MockURI.URI((String) null, "", (String) null, "");
      // Undeclared exception!
      try { 
        IMAPUtils.imapLogin(uRI0, 0, (ProtocolCommandListener) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing userInfo details
         //
         verifyException("org.apache.commons.net.examples.mail.IMAPUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URI uRI0 = MockURI.URI((String) null, "_89c>rE^J^@pW", (String) null, "imaps", (String) null);
      // Undeclared exception!
      try { 
        IMAPUtils.imapLogin(uRI0, 897, (ProtocolCommandListener) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid userInfo details: '_89c>rE^J^'
         //
         verifyException("org.apache.commons.net.examples.mail.IMAPUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IMAPUtils iMAPUtils0 = new IMAPUtils();
  }
}