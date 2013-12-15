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
import java.util.ArrayList;

public class Warshall {
    private int[][] relation;
    public void setRelation(int[][] relation){
        this.relation = relation;
    }  
    
    private int size;
    public void setSize(int size){
        this.size = size;
    }    
    
    //Process a relation until the transitive closure is found
    public void process() {
        for(int k =0; k < this.size; k++){
            for(int i = 0; i < this.size; i++){
                for(int j = 0; j < this.size; j++){
                    if(this.relation[i][k] == 1 && this.relation[k][j] == 1){
                        this.relation[i][j] = 1;
                    }
                }
            }
        }
    }
    
    //Output the current state of the relation
    //If this.process() was used then this will be the transitive closure
    public void outputRelationSet(){
        for (int i=0; i < this.size; i++){
            for(int j=0; j < this.size; j++){
                 if(j == this.size-1){
                    System.out.println("'"+this.relation[i][j]+"'");
                 }else{
                     System.out.print("'"+this.relation[i][j]+"'");
                 }
            }
        }  
    }
}