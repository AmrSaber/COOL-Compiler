
{
    true;
}

let c : Int <- 123 in {
    let d : Int <- 123 in {
        while c < d loop {
            c <- c + 1;
            c;
        } POOL;
    };
};
