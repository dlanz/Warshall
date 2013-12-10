package warshall;
/**
 * @author Dan
 */
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
    
        int size = 4;
        int[][][] theArray = new int[size][size][size];
       
        for (int k=0; k < size; k++){
            for (int i=0; i < size; i++){
                for(int j=0; j < size; j++){
                    theArray[i][j][k] = 0;
                }
            }     
        }
        
        theArray[0][3][0] = 1;
        theArray[1][2][0] = 1;
        theArray[2][0][0] = 1;
        theArray[3][1][0] = 1;
       
        Warshall thisWarshall = new Warshall();
        thisWarshall.setSize(size);
        thisWarshall.setRelation(theArray);
        thisWarshall.outputRelationSet(0);
        System.out.println();
       
        thisWarshall.process();
        System.out.println("Final: ");
        thisWarshall.outputRelationSet(3);       
    }
}