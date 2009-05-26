
object Problem1 {
    
	def isFactor(xs: List[Int], x: Int ) = xs.exists( fac => x % fac == 0)
	
	def solution(xs: List[Int], max: Int ) = ( 1 until max ).filter( n => isFactor(xs,n)).foldLeft(0)(_+_)
	
	def main (args: Array[String]) {
		print("Answer: ",solution(List(3,5),1000))
	}
}
