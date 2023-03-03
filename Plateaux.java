package echec;

public class Plateaux {
    final private int taille=8;
    public Piece c[][];


    Plateaux(){
        c=new Piece[taille][taille];
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                //c[i][j]=new cases();
                //c[i][j].setPosition(new Position(i, j));
            }
        }
    }
/* 
    void x() {
        cases[0][0] = new cases(new Tour(new Position(0,0), Couleur.BLANC));
    }
*/
    @Override
    public String toString() {
        String s="";
        s="    ";
        for(int i=0;i<taille;i++){
            s=s+i+" ";
        }
        s=s+"\n    ";
        for(int i=0;i<taille;i++){
            s=s+"_ ";
        }
        s=s+"\n";
        for(int i=7;i>=0;i--){
            s=s+i+" | ";
            for(int j=0;j<taille;j++){
                if (c[i][j]==null) s=s+". ";
                else s=s+c[i][j].getSymbole()+" ";
            }
            s=s+" | "+i+"\n";
        }
        s=s+"    ";
        for(int i=0;i<taille;i++){
            s=s+"_ ";
        }
        s=s+"\n    ";
        for(int i=0;i<taille;i++){
            s=s+i+" ";
        }
        
        

        return s;
    }
}
