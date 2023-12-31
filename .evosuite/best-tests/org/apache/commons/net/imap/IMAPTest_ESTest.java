/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:23:27 GMT 2023
 */

package org.apache.commons.net.imap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.imap.IMAPTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opentest4j.MultipleFailuresError;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IMAPTest_ESTest extends IMAPTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IMAPTest iMAPTest0 = new IMAPTest();
      String string0 = null;
      // Undeclared exception!
      try { 
        iMAPTest0.quoteMailboxName((String) null);
        fail("Expecting exception: MultipleFailuresError");
      
      } catch(MultipleFailuresError e) {
         //
         // Multiple Failures (2 failures)\r
         // \tjava.lang.NullPointerException: <no message>\r
         // \tjava.lang.NullPointerException: <no message>
         //
         verifyException("org.junit.jupiter.api.AssertAll", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IMAPTest iMAPTest0 = new IMAPTest();
      iMAPTest0.quoteMailboxNameNullInput();
      // Undeclared exception!
      iMAPTest0.checkGenerator();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IMAPTest iMAPTest0 = new IMAPTest();
      iMAPTest0.quoteMailboxNoQuotingIfNoSpacePresent();
      iMAPTest0.quoteMailboxNoQuotingIfNoSpacePresent();
      // Undeclared exception!
      iMAPTest0.checkGenerator();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IMAPTest iMAPTest0 = new IMAPTest();
      String string0 = "";
      // Undeclared exception!
      iMAPTest0.checkGenerator();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IMAPTest iMAPTest0 = new IMAPTest();
      iMAPTest0.quoteMailboxNameNullInput();
      iMAPTest0.quoteMailboxNameNullInput();
      iMAPTest0.trueChunkListener();
      iMAPTest0.quoteMailboxName(")_s\"~%Inlldah");
      iMAPTest0.quoteMailboxName("");
      iMAPTest0.constructDefaultIMAP();
      // Undeclared exception!
      iMAPTest0.checkGenerator();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IMAPTest iMAPTest0 = new IMAPTest();
      iMAPTest0.trueChunkListener();
  }
}
