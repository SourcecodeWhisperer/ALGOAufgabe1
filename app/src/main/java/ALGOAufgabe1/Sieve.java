package ALGOAufgabe1;

import java.util.ArrayList;

public class Sieve {
    public static ArrayList<Integer> SieveofEutotilis(int x){
        ArrayList <Integer> primnumbers = new ArrayList<>();
        boolean[] isprim = new boolean[x+1];

        for(int z = 2; z < x;z++){
            isprim[z] = true;
        }
        for(int y = 2; y < x; y++){
            if(isprim[y] == true) {
                primnumbers.add(y);
                for(int m = y*y; m < x;m+=y)isprim[m] = false;
            }
        }

        return primnumbers;
    }
}
