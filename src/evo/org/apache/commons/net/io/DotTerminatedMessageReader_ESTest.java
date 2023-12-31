/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 19:52:38 GMT 2023
 */

package org.apache.commons.net.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.apache.commons.net.io.DotTerminatedMessageReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DotTerminatedMessageReader_ESTest extends DotTerminatedMessageReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("P|V3;N");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[4];
      int int0 = dotTerminatedMessageReader0.read(charArray0, 1, 1);
      assertArrayEquals(new char[] {'\u0000', 'P', '\u0000', '\u0000'}, charArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[2];
      int int0 = dotTerminatedMessageReader0.read(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.close();
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      try { 
        dotTerminatedMessageReader0.readLine();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b{?DgOL=");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        dotTerminatedMessageReader0.read(charArray0, (-3287), 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3287
         //
         verifyException("org.apache.commons.net.io.DotTerminatedMessageReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b{?DgOL=");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[7];
      stringReader0.close();
      try { 
        dotTerminatedMessageReader0.read(charArray0, (-3287), 13);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.net.io.DotTerminatedMessageReader");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      // Undeclared exception!
      try { 
        dotTerminatedMessageReader0.read((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.DotTerminatedMessageReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[7];
      stringReader0.close();
      try { 
        dotTerminatedMessageReader0.read(charArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pT09geOCw$c]I_3&X");
      stringReader0.close();
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      try { 
        dotTerminatedMessageReader0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o]1-1tpc}By^901");
      stringReader0.close();
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      try { 
        dotTerminatedMessageReader0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DotTerminatedMessageReader dotTerminatedMessageReader0 = null;
      try {
        dotTerminatedMessageReader0 = new DotTerminatedMessageReader((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("P|V3;N");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "P|V3;N");
      // Undeclared exception!
      try { 
        dotTerminatedMessageReader0.read(charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kI{r$x");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1294);
      int int0 = dotTerminatedMessageReader0.read(charBuffer0);
      assertEquals(1288, charBuffer0.length());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">o;KiZ wqVP|gGcY");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      // Undeclared exception!
      try { 
        dotTerminatedMessageReader0.read((char[]) null, (-687), 2401);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.DotTerminatedMessageReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[0];
      int int0 = dotTerminatedMessageReader0.read(charArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<RD2rlq-,Y");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      int int0 = dotTerminatedMessageReader0.read();
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      int int0 = dotTerminatedMessageReader0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      String string0 = dotTerminatedMessageReader0.readLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#VjqV");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[10];
      int int0 = dotTerminatedMessageReader0.read(charArray0);
      assertEquals(5, int0);
      assertArrayEquals(new char[] {'#', 'V', 'j', 'q', 'V', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[0];
      int int0 = dotTerminatedMessageReader0.read(charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("./s)zv");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      int int0 = dotTerminatedMessageReader0.read();
      assertEquals(46, int0);
      
      int int1 = dotTerminatedMessageReader0.read();
      assertEquals(47, int1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      int int0 = dotTerminatedMessageReader0.read();
      assertEquals(46, int0);
      
      int int1 = dotTerminatedMessageReader0.read();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1q7s3F^ ~");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      char[] charArray0 = new char[3];
      dotTerminatedMessageReader0.close();
      int int0 = dotTerminatedMessageReader0.read(charArray0, (int) '7', (int) '7');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" ");
      DotTerminatedMessageReader dotTerminatedMessageReader0 = new DotTerminatedMessageReader(stringReader0);
      dotTerminatedMessageReader0.readLine();
      dotTerminatedMessageReader0.close();
  }
}
