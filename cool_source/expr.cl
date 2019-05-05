main() : SELF_TYPE {
	(let c : Int in
	    {
	        -- trivially equal (see CoolAid)
	        if c
	        then 4
	        else 8
	        fi;
	    	-- equal
	        if c
	        then 3
	        else 2
	        fi;
	    }
	)
    };