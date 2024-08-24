fun main()
{
    val repetitions = 5

    fun triangle(hauteur : Int) : String
    {   var points = ""
        var resultfin = ""
        for (i in 1..repetitions)
        {
            for (j in 1..hauteur)
            {
                points += "*"
                resultfin += "\n" +points

            }
            points = ""
            resultfin += "\n"

        }
        return resultfin


    }
    print(triangle(5))
}