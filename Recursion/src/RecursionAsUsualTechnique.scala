class RecursionAsUsualTechnique{
  def iFactorial(n:Int): Int ={
    if(n<=0){
      throw new Exception("Boom !")
    }
    return n * iFactorial(n-1)
  }
}

/**
  * this type of recersion will occur stack over flow error because this will multiply at the end of termination comes
  *
  * replace line no 3 with statement. throw new Exception("Boom !")
  *
  * you can see 6 stacks
  * java.lang.Exception: Boom !
  at RecursionAsUsualTechnique.iFactorial(RecursionAsUsualTechnique.scala:4)
  at RecursionAsUsualTechnique.iFactorial(RecursionAsUsualTechnique.scala:6)
  at RecursionAsUsualTechnique.iFactorial(RecursionAsUsualTechnique.scala:6)
  at RecursionAsUsualTechnique.iFactorial(RecursionAsUsualTechnique.scala:6)
  at RecursionAsUsualTechnique.iFactorial(RecursionAsUsualTechnique.scala:6)
  at RecursionAsUsualTechnique.iFactorial(RecursionAsUsualTechnique.scala:6)

  * */