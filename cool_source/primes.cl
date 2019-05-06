out_string(s: String): VOID {
  -- nothing
};

out_int(i: Int): VOID {
  -- nothing
};

abort(): VOID {
  -- nothing
};

out : Int <- {
  out_string("2 is trivially prime.\n");
  2;
};

testee : Int <- out;	-- testee is a number to be tested for primeness.   

divisor : Int;	-- divisor is a number which may factor testee.

stop : Int <- 500;	-- stop is an arbitrary value limiting testee. 	

while true loop {

  testee <- testee + 1;
  divisor <- 2;

  if (testee < divisor * divisor)
        then false            -- can stop if divisor > sqrt(testee).
      else
        if (testee - divisor * ( testee / divisor ) = 0)
          then false          -- can stop if divisor divides testee.
          else true
        fi
      fi;

  while 
    true
  loop 
    divisor <- divisor + 1
  pool;      

  -- which reason did we stop for?
  -- testee has no factors less than sqrt(testee).
  if testee < divisor * divisor
  then {
    out <- testee;	-- we could think of out itself as the output.
    out_int(out); 
    out_string(" is prime.\n");
  } else 0
  fi;   	

  -- we could think of "halt" as SIGTERM.
  if stop <= testee then abort() fi;

} pool;