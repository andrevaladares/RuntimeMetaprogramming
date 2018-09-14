Integer.metaClass.timesTwo = {
    delegate * 2
}

println 3.timesTwo()
println 8.timesTwo()
println 13.timesTwo()

/*
class AdaptedIntegerCategory {
    static Integer timesTwo(Integer another){
        another * 2
    }
}

use (AdaptedIntegerCategory) {
    println 2.timesTwo()
    println 5.timesTwo()
}
*/

