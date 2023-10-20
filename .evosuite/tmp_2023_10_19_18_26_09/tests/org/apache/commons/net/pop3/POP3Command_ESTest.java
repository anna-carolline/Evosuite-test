/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:44:31 GMT 2023
 */

package org.apache.commons.net.pop3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.pop3.POP3Command;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class POP3Command_ESTest extends POP3Command_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        POP3Command.getCommand((-1065));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1065
         //
         verifyException("org.apache.commons.net.pop3.POP3Command", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = POP3Command.getCommand(4);
      assertEquals("LIST", string0);
  }
}