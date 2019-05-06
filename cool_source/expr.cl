someVar: Int <- 2;
someOtherVar: Float <- 2.5;

main(someThing: Int) : SELF_TYPE {
	someThing <- let c: Int <- 1, d: Int <- 2 in {
        c <- d = if c = 3
        then 4
        else 8
        fi;

        c <- c + d + someThing + someVar;
        c;
    }
 };

let s: String <- "abc" in s = "amr";

while someVar < someOtherVar LOOP
someVar <- someVar + 10
POOL;

someOtherVar <- case someVar of
    x: Int => 2;
    y: String => 3;
    z: Float => 4;
esac;

someVar <- 2 + 3 * (4 + 5) + 6;

-- someNotDeclaredVar <- 12

someVar <- while someOtherVar < 10 loop {
    someOtherVar <- someOtherVar + 1;
    someOtherVar;
} pool;

Res: Int <- main(someVar, someOtherVar);

looooong: Int <- 1 + 2 + 3 + 4 + 5 + 6 + 7 * 8 + 9;