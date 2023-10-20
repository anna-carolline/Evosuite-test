/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:54:40 GMT 2023
 */

package org.apache.commons.net.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.nntp.Article;
import org.apache.commons.net.nntp.ArticleInfo;
import org.apache.commons.net.nntp.NNTPClient;
import org.apache.commons.net.nntp.NewGroupsOrNewsQuery;
import org.apache.commons.net.nntp.NewsgroupInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NNTPClient_ESTest extends NNTPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveHeader(")Qt@+j", 93, 101);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveHeader("", 3323);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleInfo(3030, 119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateArticleInfo(91, 2494L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.authenticate("", "[AE{NYwbxiL6");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.selectPreviousArticle(articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.selectNextArticle(articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectNewsgroup("LIST command failed: ", (NewsgroupInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectArticle((-1373L), (ArticleInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.postArticle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        NNTPClient.parseNewsgroupListEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTPClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        NNTPClient.parseArticleEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTPClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.listOverviewFmt();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.listNewsgroups("org.apache.commons.net.SocketClient");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.listNewsgroups();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      NewGroupsOrNewsQuery newGroupsOrNewsQuery0 = mock(NewGroupsOrNewsQuery.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDate();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDistributions();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getTime();
      doReturn(false).when(newGroupsOrNewsQuery0).isGMT();
      // Undeclared exception!
      try { 
        nNTPClient0.listNewNewsgroups(newGroupsOrNewsQuery0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      NewGroupsOrNewsQuery newGroupsOrNewsQuery0 = mock(NewGroupsOrNewsQuery.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDate();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDistributions();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getNewsgroups();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getTime();
      doReturn(false).when(newGroupsOrNewsQuery0).isGMT();
      // Undeclared exception!
      try { 
        nNTPClient0.listNewNews(newGroupsOrNewsQuery0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.listHelp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewsgroupListing("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewsgroupListing();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      NewGroupsOrNewsQuery newGroupsOrNewsQuery0 = mock(NewGroupsOrNewsQuery.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDate();
      doReturn("\r\n").when(newGroupsOrNewsQuery0).getDistributions();
      doReturn("").when(newGroupsOrNewsQuery0).getTime();
      doReturn(false).when(newGroupsOrNewsQuery0).isGMT();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewNewsgroupListing(newGroupsOrNewsQuery0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      NewGroupsOrNewsQuery newGroupsOrNewsQuery0 = mock(NewGroupsOrNewsQuery.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDate();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDistributions();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getNewsgroups();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getTime();
      doReturn(false).when(newGroupsOrNewsQuery0).isGMT();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewNews(newGroupsOrNewsQuery0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.forwardArticle("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.selectArticle("s)f6>:Tv,:g", articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveHeader("", 0L, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleBody(1001L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleBody("<BV&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleHeader((-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticle((String) null, articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticle((-289L), articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticle("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleHeader("Could not parse response code.\nServer Reply: ", articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleBody(1L, articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveHeader("", 220L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleHeader(0L, articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectArticle(729L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleBody("bN", articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleInfo(1334L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NewsgroupInfo newsgroupInfo0 = NNTPClient.parseNewsgroupListEntry("}+LlLNm@t2lb[8S");
      assertNull(newsgroupInfo0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NewsgroupInfo newsgroupInfo0 = NNTPClient.parseNewsgroupListEntry("Could not parse newsgroup info.\nServer reply: ");
      assertNull(newsgroupInfo0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Article article0 = NNTPClient.parseArticleEntry("Pk/");
      assertEquals("Pk/", article0.getSubject());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleInfo(1395, 1395);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewsgroups();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewsgroups((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectNewsgroup("@<~0QE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleInfo(1693);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleHeader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleInfo(0L, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectArticle("D`ZW(H`h0=Y'zWNC17");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticle(2650);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.logout();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      ArticleInfo articleInfo0 = mock(ArticleInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nNTPClient0.selectArticle(articleInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleHeader("enC'C^bw[#Q\u0003P0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.completePendingCommand();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticle(620L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectArticle(2014);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleBody();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleBody((-2931));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectPreviousArticle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.retrieveArticleHeader(1554);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      // Undeclared exception!
      try { 
        nNTPClient0.selectNextArticle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NNTPClient nNTPClient0 = new NNTPClient();
      NewGroupsOrNewsQuery newGroupsOrNewsQuery0 = mock(NewGroupsOrNewsQuery.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDate();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getDistributions();
      doReturn((String) null).when(newGroupsOrNewsQuery0).getTime();
      doReturn(false).when(newGroupsOrNewsQuery0).isGMT();
      // Undeclared exception!
      try { 
        nNTPClient0.iterateNewNewsgroups(newGroupsOrNewsQuery0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.NNTP", e);
      }
  }
}