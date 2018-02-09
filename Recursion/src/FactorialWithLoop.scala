class FactorialWithLoop {
  def iFactorial(n:Int):Int = {
    var f = 1
    var i = n
    while(i>0){
      f = f * i
      i = i -1
    }
    return f
  }
}
