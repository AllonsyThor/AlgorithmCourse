/* Shuffling algorithm in FAQ www.planetpoker.com */

for i := 1 to 52 do begin
	r := random(51) + 1;
	swap := card[r];
	card[r] := card[i];
	card[i] := swap;
end;


/* Notes 
Bug 1: Random number r never 52, 52nd card can't end up in 52nd place.
Bug 2: Shuffle not unifiorm (should be between 1 & i)
Bug 3: random() uses 32-bit seed = 2^32 possible shuffles
*/