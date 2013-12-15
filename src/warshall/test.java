package warshall;
/**
 * @author Daniel Lanza
 * 
 * Group Members:
 * Daniel Lanza
 * Antonio Jemmott
 * Chanakya Chakravartula
 * Mihir Satish Sakhardande
 * Alldrin D'Costa
 */
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
    
        int size = 4;
        // Primitive values are auto initialized to zero
        int[][] theArray = new int[size][size];
        
        //Turn on particular values for the initial relation
        theArray[0][3] = 1;
        theArray[1][2] = 1;
        theArray[2][0] = 1;
        theArray[3][1] = 1;
       
        //Create instance of Warshall class
        Warshall thisWarshall = new Warshall();
        thisWarshall.setSize(size);
        thisWarshall.setRelation(theArray);
        thisWarshall.outputRelationSet();
        System.out.println();
       
        thisWarshall.process();
        System.out.println("Final: ");
        thisWarshall.outputRelationSet();       
    }
}