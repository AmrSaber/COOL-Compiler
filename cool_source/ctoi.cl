-- dummy methods used in the rest of the code

abort(): VOID {
    -- stop the program
    0
};

out_string(s: String): VOID {
    -- nothing
    0
};

out_int(i: Int): VOID {
    -- nothing
    "HALT_PROGRAM"
};

-- the main program ...

(*
   c2i   Converts a 1-character string to an integer.  Aborts
         if the string is not "0" through "9"
*)
c2i(char : String) : Int {
    if char = "0" then 0 else
    if char = "1" then 1 else
    if char = "2" then 2 else
    if char = "3" then 3 else
    if char = "4" then 4 else
    if char = "5" then 5 else
    if char = "6" then 6 else
    if char = "7" then 7 else
    if char = "8" then 8 else
    if char = "9" then 9 else
    { abort(); 0; }  -- the 0 is needed to satisfy the typchecker
    fi fi fi fi fi fi fi fi fi fi
};

(*
i2c is the inverse of c2i.
*)
i2c(i : Int) : String {
    if i = 0 then "0" else
    if i = 1 then "1" else
    if i = 2 then "2" else
    if i = 3 then "3" else
    if i = 4 then "4" else
    if i = 5 then "5" else
    if i = 6 then "6" else
    if i = 7 then "7" else
    if i = 8 then "8" else
    if i = 9 then "9" else
    { abort(); ""; }  -- the "" is needed to satisfy the typchecker
    fi fi fi fi fi fi fi fi fi fi
};

let a : Int <- c2i("1"), b : String <- i2c(3) in {
    out_int(a) ;
    out_string(" == ") ;
    out_string(b) ;
    out_string("\n"); 
}