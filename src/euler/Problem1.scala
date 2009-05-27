object Problem1 {
	def solution(fs: List[Int], max: Int ) = ( 1 until max ).filter( n => fs.exists( f => n % f == 0)).foldLeft(0)(_+_)
	def main (args: Array[String]) {
	  print("Answer: ",solution(List(3,5),1000))
	}
}
