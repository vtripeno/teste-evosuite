/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 04 00:40:28 GMT 2019
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import evosuite.EvoSuiteClasse;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class EvoSuiteClasse_ESTest extends EvoSuiteClasse_ESTest_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      String string0 = evoSuiteClasse0.retornarStringConcatenada("", "dx6YhbD@2_t");
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      evoSuiteClasse0.retornarVazio();
      assertEquals("String Teste", evoSuiteClasse0.retornarString());
  }

  @Test
  public void test2()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      // Undeclared exception!
      try { 
        evoSuiteClasse0.retornarStringConcatenada((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.StringBuilder", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      String string0 = evoSuiteClasse0.retornarString();
      assertEquals("String Teste", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      Double double0 = evoSuiteClasse0.retornarSoma();
      assertEquals(8.0, (double)double0, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      Integer integer0 = evoSuiteClasse0.retornarInteiro();
      assertEquals(Integer.MAX_VALUE, (int)integer0);
  }

  @Test
  public void test6()  throws Throwable  {
      EvoSuiteClasse evoSuiteClasse0 = new EvoSuiteClasse();
      BigDecimal bigDecimal0 = evoSuiteClasse0.retornarBigDecimal();
      assertEquals(10, bigDecimal0.shortValue());
  }
}
