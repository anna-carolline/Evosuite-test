/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:53:51 GMT 2023
 */

package org.apache.commons.net.pop3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.pop3.POP3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class POP3_ESTest extends POP3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.sendCommand(0, "\r\n");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Socket is not connected
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      pOP3_0.setState(32);
      int int0 = pOP3_0.getState();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      pOP3_0.getCommandSupport();
      assertEquals(110, pOP3_0.getDefaultPort());
      assertEquals((-1), pOP3_0.getState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.sendCommand(2453);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2453
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.getAdditionalReply();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      pOP3_0.replyLines = null;
      // Undeclared exception!
      try { 
        pOP3_0.disconnect();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.sendCommand("Zl<lv?/f;FK,", "Zl<lv?/f;FK,");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Socket is not connected
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      assertEquals((-1), pOP3_0.getState());
      
      pOP3_0.setState(0);
      int int0 = pOP3_0.getState();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      pOP3_0.getReplyString();
      assertEquals(110, pOP3_0.getDefaultPort());
      assertEquals((-1), pOP3_0.getState());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.sendCommand(".");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Socket is not connected
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.sendCommand(60000, "X");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 60000
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0.sendCommand(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Socket is not connected
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      pOP3_0.disconnect();
      assertEquals(110, pOP3_0.getDefaultPort());
      assertEquals((-1), pOP3_0.getState());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      ProtocolCommandListener protocolCommandListener0 = mock(ProtocolCommandListener.class, new ViolatedAssumptionAnswer());
      pOP3_0.removeProtocolCommandistener(protocolCommandListener0);
      assertEquals(110, pOP3_0.getDefaultPort());
      assertEquals((-1), pOP3_0.getState());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      pOP3_0.getReplyStrings();
      assertEquals((-1), pOP3_0.getState());
      assertEquals(110, pOP3_0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      // Undeclared exception!
      try { 
        pOP3_0._connectAction_();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.SocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      POP3 pOP3_0 = new POP3();
      int int0 = pOP3_0.getState();
      assertEquals((-1), int0);
      assertEquals(110, pOP3_0.getDefaultPort());
  }
}