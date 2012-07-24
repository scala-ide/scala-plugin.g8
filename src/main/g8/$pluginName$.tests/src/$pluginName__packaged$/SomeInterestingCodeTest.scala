package $pluginName$

import org.junit.Test
import org.junit.Assert._

class SomeInterestingCodeTest {
  
  @Test
  def div() {
    assertEquals("Bad result for '12/3'", Some(4), SomeInterestingCode.div(12, 3))
  }
  
  @Test
  def divByZero {
    assertEquals("Bad result for '10/0'", None, SomeInterestingCode.div(10, 0))
  }

}
