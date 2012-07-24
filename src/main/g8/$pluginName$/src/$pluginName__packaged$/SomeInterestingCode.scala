package $pluginName$

object SomeInterestingCode {
  
  def div(a: Int, b: Int): Option[Int] = {
    if (b == 0) {
      None
    } else {
      Some(a / b)
    }
  }
}
