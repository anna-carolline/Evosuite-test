/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:34:02 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.net.ftp.parser.ParserInitializationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParserInitializationException_ESTest extends ParserInitializationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("e&6cK]LwgrZ7\"5p");
      ParserInitializationException parserInitializationException0 = new ParserInitializationException("e&6cK]LwgrZ7\"5p", mockIOException0);
      Throwable throwable0 = parserInitializationException0.getRootCause();
      assertSame(mockIOException0, throwable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParserInitializationException parserInitializationException0 = new ParserInitializationException((String) null);
      Throwable throwable0 = parserInitializationException0.getRootCause();
      assertNull(throwable0);
  }
}
