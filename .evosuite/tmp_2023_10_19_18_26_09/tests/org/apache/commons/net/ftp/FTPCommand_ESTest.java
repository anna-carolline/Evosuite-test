/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:12:42 GMT 2023
 */

package org.apache.commons.net.ftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.ftp.FTPCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FTPCommand_ESTest extends FTPCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = FTPCommand.getCommand(0);
      assertEquals("USER", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FTPCommand.checkArray();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        FTPCommand.getCommand((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.net.ftp.FTPCommand", e);
      }
  }
}
