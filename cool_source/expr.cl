main(someThing: Int) : SELF_TYPE {
	someThing <- let c: Int, d: Int in {
        d = if c = 3
        then 4
        else 8
        fi;

        c;
    }
 };

let s: String <- "abc" in s = "amr"

someVar: Int <- 2 + 3 * (4 + 5) + 6;
someOtherVar: Float <- 2.5;

while someVar < someOtherVar LOOP
someVar <- someVar + 10
POOL

someOtherVar <- case someVar of
    x: Int => 2;
    y: String => 3;
    z: Float => 4;
esac

someVar <- let c: Int <- 2, d: Int <- 3 in c = d

main(someVar, someOtherVar)