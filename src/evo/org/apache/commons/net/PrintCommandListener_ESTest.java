/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:23:34 GMT 2023
 */

package org.apache.commons.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ProtocolCommandEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintCommandListener_ESTest extends PrintCommandListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true, 'g', true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn("N.GSsGD{NeK|NYY2v]").when(protocolCommandEvent0).getCommand();
      doReturn("\r\n").when(protocolCommandEvent0).getMessage();
      printCommandListener0.protocolCommandSent(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printWriter0, true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn("LOGIN").when(protocolCommandEvent0).getCommand();
      doReturn("").when(protocolCommandEvent0).getMessage();
      // Undeclared exception!
      try { 
        printCommandListener0.protocolCommandSent(protocolCommandEvent0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printWriter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printWriter0, false, '|', false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printWriter0, false);
      // Undeclared exception!
      try { 
        printCommandListener0.protocolReplyReceived((ProtocolCommandEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.PrintCommandListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printWriter0, false, '>');
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true, 'g', true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn("PASS").when(protocolCommandEvent0).getMessage();
      printCommandListener0.protocolReplyReceived(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn("LOGIN").when(protocolCommandEvent0).getCommand();
      doReturn("6 x9n*u!&").when(protocolCommandEvent0).getMessage();
      printCommandListener0.protocolCommandSent(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn("USER").when(protocolCommandEvent0).getCommand();
      printCommandListener0.protocolCommandSent(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true, 'g', true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn("PASS").when(protocolCommandEvent0).getCommand();
      printCommandListener0.protocolCommandSent(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, true, '\"', true);
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(protocolCommandEvent0).getCommand();
      doReturn("M6fw").when(protocolCommandEvent0).getMessage();
      printCommandListener0.protocolCommandSent(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(protocolCommandEvent0).getMessage();
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0);
      printCommandListener0.protocolCommandSent(protocolCommandEvent0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      PrintCommandListener printCommandListener0 = new PrintCommandListener(printStream0, false, '}');
      ProtocolCommandEvent protocolCommandEvent0 = mock(ProtocolCommandEvent.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(protocolCommandEvent0).getMessage();
      // Undeclared exception!
      try { 
        printCommandListener0.protocolCommandSent(protocolCommandEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.PrintCommandListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintCommandListener printCommandListener0 = null;
      try {
        printCommandListener0 = new PrintCommandListener((PrintStream) null, false, 'o');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintCommandListener printCommandListener0 = null;
      try {
        printCommandListener0 = new PrintCommandListener((PrintStream) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintCommandListener printCommandListener0 = null;
      try {
        printCommandListener0 = new PrintCommandListener((PrintStream) null, false, '`', false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintCommandListener printCommandListener0 = null;
      try {
        printCommandListener0 = new PrintCommandListener((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
}
