package ALGOAufgabe1;

public class GCDSub {
    public static int EuclidSubstractionIterative(int x , int y ){
        if(x ==0){
            return y;
        }else {
            while (y != 0){
                if(x > y){
                    x = x - y;
                }else{
                    y = y - x;
                }
            }
        }
        return x;
    }
    public static int EuclidSubstractionRecursive(int x , int y){
        if(y == 0){
            return x ;
        }else if(x == 0){
            return y;
        }else  if (x > y){
            return EuclidSubstractionRecursive(x-y,y);
        }else {
            return EuclidSubstractionRecursive(x,y-x);
        }

    }
}
