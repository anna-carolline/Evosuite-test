/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:05:31 GMT 2023
 */

package org.apache.commons.net.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.net.nntp.NNTPConnectionClosedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NNTPConnectionClosedException_ESTest extends NNTPConnectionClosedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NNTPConnectionClosedException nNTPConnectionClosedException0 = new NNTPConnectionClosedException("0vhr,q");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NNTPConnectionClosedException nNTPConnectionClosedException0 = new NNTPConnectionClosedException();
  }
}