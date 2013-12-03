package warshall;
/**
 * @author Dan
 */
import java.util.Arrays;

public class test {
    
    
    public static void main(String[] args) {
    
       int[][][] theArray = new int[6][6][6];
         
       for(int k = 0; k < 6; k++){
            for (int i=0; i < 6; i++){
                for(int j=0; j < 6; j++){
                    theArray[i][j][k] = 0;
                }
            }     
       }
       theArray[0][1][0] = 1;
       theArray[0][5][0] = 1;
       theArray[1][0][0] = 1;
       theArray[1][2][0] = 1;
       theArray[1][3][0] = 1;
       theArray[2][1][0] = 1;
       theArray[2][0][0] = 1;
       theArray[2][3][0] = 1;
       theArray[3][0][0] = 1;
       theArray[3][4][0] = 1;
       theArray[4][3][0] = 1;
       theArray[5][4][0] = 1;
       theArray[5][3][0] = 1;
       
       
       Warshall thisWarshall = new Warshall();
       
       thisWarshall.setRelation(theArray);
       thisWarshall.setSize(6);
       thisWarshall.process();
     
       
       thisWarshall.outputRelation(5);
    }
}
