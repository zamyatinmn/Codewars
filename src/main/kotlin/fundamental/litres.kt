package fundamental

/**Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, he drinks 0.5 fundamental.litres of water per hour of cycling.

You get given the time in hours and you need to return the number of fundamental.litres Nathan will drink, rounded to the smallest value.

For example:

time = 3 ----> fundamental.litres = 1

time = 6.7---> fundamental.litres = 3

time = 11.8--> fundamental.litres = 5*/

fun litres(time: Double) = time.toInt() / 2