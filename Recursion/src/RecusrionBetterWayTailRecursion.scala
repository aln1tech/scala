class RecusrionBetterWayTailRecursion {

  private def tFactorial(n: Int, f: Int): Int = {
    if(n<=0)
      throw new Exception("Boom !")
    else
    return tFactorial(n-1,n*f)
  }

  def rFactorial(n:Int):Int = {
    return tFactorial(n,1)
  }
}
