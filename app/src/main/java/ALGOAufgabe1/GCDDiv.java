package ALGOAufgabe1;

public class GCDDiv {
    public static int  EuclidDivisionRestIterative(int x,int y){
        int zwich = 0;
        while (y != 0){
            zwich = x % y;
            x = y;
            y = zwich;
        }
        return x;
    }
    public static int EuclidDivisionRestRecursive(int x ,int y){
        if (y == 0){
            return x;
        }else
            return EuclidDivisionRestRecursive(y,x%y);
    }
}
