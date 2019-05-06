factorial(x: Int): Int {
    if x = 1 then x else x * factorial( x - 1 ) fi
};

a: Int <- factorial(17);
b: Int <- 1 + 2 * factorial(10) + 3 - 4 * 5 / 6;