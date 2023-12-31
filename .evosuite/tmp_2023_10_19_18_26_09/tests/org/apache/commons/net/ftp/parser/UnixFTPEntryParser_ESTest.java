/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:35:43 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.parser.UnixFTPEntryParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnixFTPEntryParser_ESTest extends UnixFTPEntryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser(fTPClientConfig0, true);
      FTPClientConfig fTPClientConfig1 = unixFTPEntryParser0.getDefaultConfiguration();
      assertEquals("UNIX", fTPClientConfig1.getServerSystemKey());
      assertEquals("MMM d yyyy", fTPClientConfig1.getDefaultDateFormatStr());
      assertEquals("MMM d HH:mm", fTPClientConfig1.getRecentDateFormatStr());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser(fTPClientConfig0);
      assertEquals(0, unixFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser(fTPClientConfig0, true);
      // Undeclared exception!
      try { 
        unixFTPEntryParser0.parseFTPEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser();
      unixFTPEntryParser0.setRegex("");
      // Undeclared exception!
      try { 
        unixFTPEntryParser0.parseFTPEntry("");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 1
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser();
      FTPFile fTPFile0 = unixFTPEntryParser0.parseFTPEntry("TYPE: L8");
      assertNull(fTPFile0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser();
      // Undeclared exception!
      try { 
        unixFTPEntryParser0.preParse((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.parser.UnixFTPEntryParser", e);
      }
  }
}
