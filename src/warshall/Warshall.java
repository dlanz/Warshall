package warshall;

import java.util.ArrayList;

/**
 * @author Dan
 */
public class Warshall {
    private int[][][] relation;
    public void setRelation(int[][][] relation){
        this.relation = relation;
    }  
    public void setRelationSet(int i, int j, int k, int value){
        this.relation[i][j][k] = value;
    } 
    public int[][][] getRelation(){
        return this.relation;
    }
    public int getRelationSet(int i, int j, int k){
        return this.relation[i][j][k];
    }
    
    private int size;
    public void setSize(int size){
        this.size = size;
    }    
    public int getSize(){
        return this.size;
    }
    
    private int[][] tempArray;
    
    
    public void process() {
       
        for(int k = 1; k < this.size; k++){
            tempArray = new int[this.size][this.size];
            
            for(int i = 0; i < this.size; i++){
                for(int j = 0; j < this.size; j++){
                    
                    for(int node = 0; node < k; node++){
                        if(this.relation[i][j][k-1] == 1 || (this.relation[i][node][k-1] == 1 && this.relation[node][j][k-1] == 1)){
                            System.out.println("i = "+i+": j = "+j+": k = "+k+": node = "+node);
                            tempArray[i][j] = 1;
                        }
                    }
                }   
            }
            
            System.out.println("Kth -1:");
            this.outputRelationSet(k-1);
            
            System.out.println("Kth: ");
            for(int m = 0; m < this.size; m++){
                for(int n = 0; n < this.size; n++){
                    this.relation[m][n][k] = tempArray[m][n];
                    //System.out.println(tempArray[m][n]);
                    if(n == this.size-1){
                        System.out.println("'"+tempArray[m][n]+"'");
                    }else{
                        System.out.print("'"+tempArray[m][n]+"'");
                    }

                }
            }
            
        }
    }
    
    public void outputRelationSet(int set){
        
        for (int i=0; i < this.size; i++){
            for(int j=0; j < this.size; j++){
                 if(j == this.size-1){
                    System.out.println("'"+this.relation[i][j][set]+"'");
                 }else{
                     System.out.print("'"+this.relation[i][j][set]+"'");
                 }
            }
        }  
    }
}