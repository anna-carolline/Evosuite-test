/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:33:40 GMT 2023
 */

package org.apache.commons.net.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import org.apache.commons.net.io.CopyStreamListener;
import org.apache.commons.net.io.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyStream(inputStream0, outputStream0, 5026, 0L, copyStreamListener0, false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      int int0 = 998;
      // Undeclared exception!
      Util.copyStream(inputStream0, outputStream0, 998);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      int int0 = 1159;
      // Undeclared exception!
      Util.copyStream(inputStream0, outputStream0, 1159);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Closeable closeable0 = mock(Closeable.class, new ViolatedAssumptionAnswer());
      Util.closeQuietly(closeable0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      int int0 = (-2458);
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyStream(inputStream0, outputStream0, (-2458), (long) (-2458), copyStreamListener0, true);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(reader0).read();
      doReturn(0, 0, 0, 0, 0).when(reader0).read(any(char[].class));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      Util.copyReader(reader0, writer0, (-657));
      Reader reader1 = mock(Reader.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(reader0).read();
      doReturn(0, 0, 0, 0, 0).when(reader0).read(any(char[].class));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      int int0 = (-3694);
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyReader(reader0, writer0, (-3694), (-841L), copyStreamListener0);
      Reader reader1 = mock(Reader.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(reader0).read();
      doReturn(0, 0, 0, 0, 0).when(reader0).read(any(char[].class));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      Util.copyReader(reader0, writer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyStream(inputStream0, outputStream0, 0, 3432L, copyStreamListener0, true);
      Reader reader0 = null;
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read();
      doReturn(0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = null;
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyStream(inputStream0, (OutputStream) null, 0, (long) 0, copyStreamListener0);
      Socket socket0 = mock(Socket.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(reader0).read();
      doReturn(0, 0, 0, 0, 0).when(reader0).read(any(char[].class));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyReader(reader0, writer0, 0, (long) 0, copyStreamListener0);
      InputStream inputStream0 = null;
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      int int0 = 837;
      // Undeclared exception!
      Util.copyStream(inputStream0, outputStream0, 837);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      Util.copyStream(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Socket socket0 = mock(Socket.class, new ViolatedAssumptionAnswer());
      Util.closeQuietly(socket0);
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(reader0).read();
      doReturn(0, 0, 0, 0, 0).when(reader0).read(any(char[].class));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      int int0 = (-1524);
      // Undeclared exception!
      Util.copyReader(reader0, writer0, (-1524));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      int int0 = (-1);
      CopyStreamListener copyStreamListener0 = null;
      Util.copyStream(inputStream0, outputStream0, (-1), (-3041L), (CopyStreamListener) null);
      Reader reader0 = null;
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(reader0).read();
      doReturn(0, 0, 0, 0, 0).when(reader0).read(any(char[].class));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      int int0 = 1;
      CopyStreamListener copyStreamListener0 = mock(CopyStreamListener.class, new ViolatedAssumptionAnswer());
      Util.copyReader(reader0, writer0, 1, 0L, copyStreamListener0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
  }
}
