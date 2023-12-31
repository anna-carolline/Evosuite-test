/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:34:36 GMT 2023
 */

package org.apache.commons.net.imap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.imap.IMAPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IMAPClient_ESTest extends IMAPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.search("ALL", "CREATE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.rename("", "DRAFT");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.lsub("@-%T/]4Y1U.[q/", "\"@>Tk}C1$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.list("x&#|", "kb|;u@+$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.copy("HF\"r`UY/-<e_d/{", "\\$1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("UNANSWERED", "ENVELOPE", "\"roo2:Pm]}O", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append(")[", "\r\n", "\r\n", ")[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("1", "1", "", "_T,_u*w<~U!hJ<;");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.search((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append((String) null, (String) null, "org.apache.commons.net.imap.IMAP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        iMAPClient0.status("4.b_>Tf", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // STATUS command requires at least one data item name
         //
         verifyException("org.apache.commons.net.imap.IMAPClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        iMAPClient0.status((String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      boolean boolean0 = iMAPClient0.login("Ad>+:{", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("$VALUES", "$6Kv#.byTSj8VO8a", "0[WJ <A&a?OF*`TR", "\"\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("$Zl", (String) null, "$Zl", "$Zl");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("\"roo27Pm]}O", "\"roo27Pm]}O", "\"roo27Pm]}O", "\"o2:Pm]}O");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("", (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("7i", "", "org.apache.commons.net.imap.IMAPClient");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("", "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.delete("TEXT");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.fetch("B", "y,\">#+9fS&{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.noop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.select("TN3@FXyzN~y&0nn^W(");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.logout();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.uid(".", "RFC822");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.capability();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.create(" ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.unsubscribe(".4|k5P+#K%BHm>z");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.examine("9LVk-");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.subscribe("CR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.search("XY");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.check();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.store((String) null, "NX0/qXp8|HGM", "org.apache.commons.net.PrintCommandListener");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.append("-TVp`9");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IMAPClient iMAPClient0 = new IMAPClient();
      // Undeclared exception!
      try { 
        iMAPClient0.expunge();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.IMAP", e);
      }
  }
}
