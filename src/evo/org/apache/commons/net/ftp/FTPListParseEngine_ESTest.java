/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:02:08 GMT 2023
 */

package org.apache.commons.net.ftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.List;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParser;
import org.apache.commons.net.ftp.FTPFileFilter;
import org.apache.commons.net.ftp.FTPListParseEngine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FTPListParseEngine_ESTest extends FTPListParseEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FTPFile fTPFile0 = mock(FTPFile.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(fTPFile0).toString();
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn(fTPFile0, fTPFile0, fTPFile0, fTPFile0, fTPFile0).when(fTPFileEntryParser0).parseFTPEntry(anyString());
      doReturn((List<String>) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn("dir", "?>f:xR2ADB{Z", (String) null, "", "").when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter1);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter2);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream0);
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter3 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(fTPFileFilter3).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter3);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getFiles();
      fTPListParseEngine0.hasNext();
      FTPFileFilter fTPFileFilter4 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(fTPFileFilter4).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter4);
      fTPListParseEngine0.getNext(3193);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      fTPListParseEngine0.readServerList(inputStream1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FTPFile fTPFile0 = mock(FTPFile.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPFile0).toString();
      FTPFile fTPFile1 = mock(FTPFile.class, new ViolatedAssumptionAnswer());
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn(fTPFile0, fTPFile0, fTPFile0, fTPFile0, fTPFile1).when(fTPFileEntryParser0).parseFTPEntry(anyString());
      doReturn((List<String>) null, (List<String>) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn("dir", "?>f:xR2ADB{Z", (String) null, "?>f:xR2ADB{Z", (String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter1);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter2);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getNext(1);
      fTPListParseEngine0.readServerList(inputStream0);
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter3 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(fTPFileFilter3).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter3);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getNext(3193);
      fTPListParseEngine0.hasNext();
      FTPFileFilter fTPFileFilter4 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(fTPFileFilter4).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter4);
      fTPListParseEngine0.getNext(3193);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((FTPFile) null, (FTPFile) null, (FTPFile) null, (FTPFile) null, (FTPFile) null).when(fTPFileEntryParser0).parseFTPEntry(anyString());
      doReturn((List) null, (List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn("dir", "?>f:xR2ADB{Z", (String) null, (String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter1);
      int int0 = 3193;
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter2);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream0);
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter3 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(fTPFileFilter3).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter3);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getNext(int0);
      fTPListParseEngine0.hasNext();
      FTPFileFilter fTPFileFilter4 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(fTPFileFilter4).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter4);
      fTPListParseEngine0.getNext(int0);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null, (String) null, (String) null, (String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      fTPListParseEngine0.readServerList(inputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine((FTPFileEntryParser) null);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      fTPListParseEngine0.getPrevious(6);
      fTPListParseEngine0.getFiles();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      InputStream inputStream0 = null;
      fTPListParseEngine0.getPrevious((-3970));
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList((InputStream) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, (FTPClientConfig) null);
      fTPListParseEngine0.resetIterator();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn((String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream0);
      InputStream inputStream1 = null;
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getFiles();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream0, "WINDOWS");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // WINDOWS
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      fTPListParseEngine0.getPrevious(0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      FTPFileFilter fTPFileFilter1 = null;
      fTPListParseEngine0.resetIterator();
      // Undeclared exception!
      try { 
        fTPListParseEngine0.getFileList((FTPFileFilter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.FTPListParseEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine((FTPFileEntryParser) null);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles(fTPFileFilter0);
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn((String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream0, (String) null);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      fTPListParseEngine0.getFiles();
      fTPListParseEngine0.resetIterator();
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.resetIterator();
      int int0 = 1107;
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream2, ",Qi:*qn 0_ G%");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ,Qi:*qn 0_ G%
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      fTPListParseEngine0.getPrevious((-96));
      // Undeclared exception!
      try { 
        fTPListParseEngine0.getFiles((FTPFileFilter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.FTPListParseEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((FTPFile) null, (FTPFile) null, (FTPFile) null, (FTPFile) null, (FTPFile) null).when(fTPFileEntryParser0).parseFTPEntry(anyString());
      doReturn((List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn("dir", "?>f:xR2ADB{Z", (String) null, "", "").when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter1);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.getPrevious(3193);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter2);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream0);
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter3 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(fTPFileFilter3).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter3);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getNext(3193);
      fTPListParseEngine0.hasNext();
      FTPFileFilter fTPFileFilter4 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(fTPFileFilter4).accept(any(org.apache.commons.net.ftp.FTPFile.class));
      fTPListParseEngine0.getFileList(fTPFileFilter4);
      fTPListParseEngine0.getNext(3193);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      fTPListParseEngine0.readServerList(inputStream1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles();
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter1);
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles();
      fTPListParseEngine0.getFileList(fTPFileFilter2);
      fTPListParseEngine0.getFiles(fTPFileFilter0);
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.getPrevious(1314);
      fTPListParseEngine0.getFiles();
      fTPListParseEngine0.getNext(40);
      fTPListParseEngine0.hasPrevious();
      int int0 = 0;
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream0, "_A*d-,");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // _A*d-,
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine((FTPFileEntryParser) null);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn((String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      FTPFileFilter fTPFileFilter0 = null;
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles();
      fTPListParseEngine0.readServerList(inputStream0);
      // Undeclared exception!
      try { 
        fTPListParseEngine0.getFiles((FTPFileFilter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.FTPListParseEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      boolean boolean0 = fTPListParseEngine0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((List) null, (List) null, (List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn((String) null, (String) null, (String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fTPClientConfig0).getUnparseableEntries();
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0, fTPClientConfig0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      fTPListParseEngine0.readServerList(inputStream0);
      int int0 = (-3346);
      fTPListParseEngine0.getNext((-3346));
      fTPListParseEngine0.getPrevious((-3346));
      fTPListParseEngine0.getNext(97);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles(fTPFileFilter1);
      fTPListParseEngine0.readServerList(inputStream1);
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter2);
      InputStream inputStream3 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream3);
      fTPListParseEngine0.resetIterator();
      // Undeclared exception!
      try { 
        fTPListParseEngine0.readServerList(inputStream2, "WINDOWS");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // WINDOWS
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      doReturn((List) null, (List) null, (List) null).when(fTPFileEntryParser0).preParse(anyList());
      doReturn((String) null, (String) null, (String) null).when(fTPFileEntryParser0).readNextEntry(any(java.io.BufferedReader.class));
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFileList(fTPFileFilter0);
      fTPListParseEngine0.resetIterator();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream0);
      fTPListParseEngine0.getNext(0);
      fTPListParseEngine0.hasNext();
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles(fTPFileFilter1);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.readServerList(inputStream1);
      FTPFileFilter fTPFileFilter2 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles(fTPFileFilter2);
      fTPListParseEngine0.resetIterator();
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.resetIterator();
      fTPListParseEngine0.readServerList(inputStream2);
      fTPListParseEngine0.getNext((-2063));
      FTPFile[] fTPFileArray0 = fTPListParseEngine0.getNext((-1875));
      fTPListParseEngine0.resetIterator();
      FTPFile[] fTPFileArray1 = fTPListParseEngine0.getFiles();
      assertSame(fTPFileArray1, fTPFileArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FTPFileEntryParser fTPFileEntryParser0 = mock(FTPFileEntryParser.class, new ViolatedAssumptionAnswer());
      FTPListParseEngine fTPListParseEngine0 = new FTPListParseEngine(fTPFileEntryParser0);
      fTPListParseEngine0.getFiles();
      fTPListParseEngine0.hasNext();
      fTPListParseEngine0.getNext(0);
      FTPFileFilter fTPFileFilter0 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      FTPFileFilter fTPFileFilter1 = mock(FTPFileFilter.class, new ViolatedAssumptionAnswer());
      fTPListParseEngine0.getFiles(fTPFileFilter1);
      fTPListParseEngine0.getFiles(fTPFileFilter0);
      fTPListParseEngine0.getPrevious((-4361));
      fTPListParseEngine0.hasNext();
      fTPListParseEngine0.resetIterator();
      assertFalse(fTPListParseEngine0.hasNext());
  }
}
