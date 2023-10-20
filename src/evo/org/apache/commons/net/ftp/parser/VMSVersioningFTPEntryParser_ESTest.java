/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 20 00:00:26 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.parser.VMSVersioningFTPEntryParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VMSVersioningFTPEntryParser_ESTest extends VMSVersioningFTPEntryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VMSVersioningFTPEntryParser vMSVersioningFTPEntryParser0 = new VMSVersioningFTPEntryParser((FTPClientConfig) null);
      assertEquals(0, vMSVersioningFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VMSVersioningFTPEntryParser vMSVersioningFTPEntryParser0 = new VMSVersioningFTPEntryParser();
      // Undeclared exception!
      try { 
        vMSVersioningFTPEntryParser0.preParse((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.parser.VMSVersioningFTPEntryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      VMSVersioningFTPEntryParser vMSVersioningFTPEntryParser0 = null;
      try {
        vMSVersioningFTPEntryParser0 = new VMSVersioningFTPEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VMSVersioningFTPEntryParser vMSVersioningFTPEntryParser0 = new VMSVersioningFTPEntryParser();
      boolean boolean0 = vMSVersioningFTPEntryParser0.isVersioning();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "es").when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, "").when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      VMSVersioningFTPEntryParser vMSVersioningFTPEntryParser0 = null;
      try {
        vMSVersioningFTPEntryParser0 = new VMSVersioningFTPEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'e'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }
}