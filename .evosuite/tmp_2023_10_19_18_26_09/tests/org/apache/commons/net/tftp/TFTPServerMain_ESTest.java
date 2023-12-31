/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:10:25 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.tftp.TFTPServerMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPServerMain_ESTest extends TFTPServerMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-v";
      TFTPServerMain.main(stringArray0);
      TFTPServerMain.main(stringArray0);
      TFTPServerMain tFTPServerMain0 = new TFTPServerMain();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      TFTPServerMain.main(stringArray0);
      TFTPServerMain tFTPServerMain0 = new TFTPServerMain();
      TFTPServerMain.main(stringArray0);
      TFTPServerMain.main(stringArray0);
      TFTPServerMain.main(stringArray0);
      TFTPServerMain.main(stringArray0);
      TFTPServerMain.main(stringArray0);
      String[] stringArray1 = null;
      try { 
        TFTPServerMain.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPServerMain", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "nW%mw'<0&7!/YGe";
      stringArray0[1] = "={##Z& E(?zSN55A@E9";
      stringArray0[2] = "G4!5*Aose~dYM;";
      stringArray0[3] = "BoCC2d`";
      stringArray0[4] = "[-?9/R'4+Uh2io6UO";
      try { 
        TFTPServerMain.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"nW%mw'<0&7!/YGe\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-p";
      stringArray0[1] = "w.nTGrr=:uv";
      String string0 = "";
      stringArray0[2] = "";
      stringArray0[3] = "Server exit";
      stringArray0[4] = "^ca2@M?+";
      String string1 = "";
      stringArray0[5] = "";
      stringArray0[6] = "XPQ}~~,xwkTs'Zc%FI4";
      stringArray0[7] = "";
      try { 
        TFTPServerMain.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      TFTPServerMain.main(stringArray0);
      TFTPServerMain tFTPServerMain0 = new TFTPServerMain();
      String[] stringArray1 = new String[9];
      stringArray1[0] = "1N(FmbM/-?";
      stringArray1[1] = "";
      stringArray1[2] = "LSxz8";
      stringArray1[3] = "";
      stringArray1[4] = "Server directory: ";
      stringArray1[5] = "org.apache.commons.net.tftp.TFTPServer";
      stringArray1[6] = "";
      stringArray1[7] = "";
      stringArray1[8] = "Unexpected Error in during TFTP file transfer.  Transfer aborted. ";
      try { 
        TFTPServerMain.main(stringArray1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"1N(FmbM/-?\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      try { 
        TFTPServerMain.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        TFTPServerMain.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TFTPServerMain tFTPServerMain0 = new TFTPServerMain();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "!fpN7";
      stringArray0[1] = " bytes";
      stringArray0[2] = "Z";
      stringArray0[3] = "Destination directory '";
      try { 
        TFTPServerMain.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"!fpN7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "-7Z\"uTa";
      stringArray0[0] = "-7Z\"uTa";
      // Undeclared exception!
      try { 
        TFTPServerMain.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-v";
      TFTPServerMain.main(stringArray0);
      TFTPServerMain tFTPServerMain0 = new TFTPServerMain();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TFTPServerMain tFTPServerMain0 = new TFTPServerMain();
      String[] stringArray0 = null;
      try { 
        TFTPServerMain.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPServerMain", e);
      }
  }
}
