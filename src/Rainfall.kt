fun numberArray(town: String, strng: String): MutableList<Double> {
    var arrayCityPos = 0
    val cityArray = strng.split("\n")
    var returnArrayList:MutableList<Double> = arrayListOf<Double>()

    for (i in cityArray){
        if(i.contains(town)){
            break
        }
        arrayCityPos++
    }
    cityArray[arrayCityPos].split(":")[1].split(",").forEach {
        returnArrayList.add(it.split(" ")[1].toDouble())
    }
    return returnArrayList
}

fun mean(town:String, strng:String):Double {
    var rainTotal:Double = 0.00

    for (i in numberArray(town, strng)){
      rainTotal += i
      }
    return rainTotal/numberArray(town, strng).size
}

fun variance(town:String, strng:String):Double {
  var mean = mean(town,strng)
  var returnable = 0.00
  for (i in numberArray(town, strng)){
      returnable += (i-mean)*(i-mean)
    }
   return returnable/numberArray(town, strng).size
}

//Task:
//function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).
//function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
//Examples:
//mean("London", data), 51.19(9999999999996)
//variance("London", data), 57.42(833333333374)
//Notes:
//if functions mean or variance have as parameter town a city which has no records return -1 or -1.0 (depending on the language)
//Don't truncate or round: the tests will pass if abs(your_result - test_result) <= 1e-2 or abs((your_result - test_result) / test_result) <= 1e-6 depending on the language.
//Shell tests only variance
//A ref: http://www.mathsisfun.com/data/standard-deviation.html
//data and data1 (can be named d0 and d1 depending on the language; see "Sample Tests:") are adapted from: http://www.worldclimate.com