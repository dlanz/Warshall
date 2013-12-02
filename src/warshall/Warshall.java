package warshall;
/**
 * @author Dan
 */
public class Warshall {
    private int[][][] relation;
    public void setRelation(int[][][] relation){
        this.relation = relation;
    }    
    public int[][][] getRelation(){
        return this.relation;
    }
    
    private int size;
    public void setSize(int size){
        this.size = size;
    }    
    public int getSize(){
        return this.size;
    }
    
    public void process() {
    
        for(int k = 0; k < this.size-1; k++){
           for(int i = 0; i < this.size; i++){
               for(int j = 0; j < this.size; j++){
                   if(this.relation[i][j][k] == 1){
                       this.relation[i][j][k+1] = 1;
                   }

                   if(this.relation[i][j][k] == 1 && this.relation[i][j][k+1] == 1){
                       this.relation[i][k+1][k] = 1;
                       this.relation[k+1][j][k] = 1;
                   }
               } 
           }
       }
    }
    
    public void outputRelation(int step){
        
        for (int i=0; i < this.size; i++){
            for(int j=0; j < this.size; j++){
                 if(j == this.size-1){
                    System.out.println("'"+this.relation[i][j][step]+"'");
                 }else{
                     System.out.print("'"+this.relation[i][j][step]+"'");
                 }
            }
        }  
    }
}