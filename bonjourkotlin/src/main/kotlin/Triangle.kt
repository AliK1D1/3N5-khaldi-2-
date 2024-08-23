fun main(args: Array<String>)
{
    val repetition = args[0].toInt()
    var points = ""
   for (i in 1..repetition)
   {
       points += "*"
       println(points)
   }
}
