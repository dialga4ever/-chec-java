package echec;

public class Plateaux {
    final private int taille=8;
    public Piece c[][];


    Plateaux(){
        c=new Piece[taille][taille];
    }

    public void init(){
        c[0][0] = new Tour(new Position(0,0), Couleur.BLANC,this);
        c[0][1] = new Cavalier(new Position(0,1), Couleur.BLANC,this);
        c[0][2] = new Fou(new Position(0,2), Couleur.BLANC,this);
        c[0][3] = new Reine(new Position(0,3), Couleur.BLANC,this);
        c[0][4] = new roi(new Position(0,4), Couleur.BLANC,this);
        c[0][5] = new Fou(new Position(0,5), Couleur.BLANC,this);
        c[0][6] = new Cavalier(new Position(0,6), Couleur.BLANC,this);
        c[0][7] = new Tour(new Position(0,7), Couleur.BLANC,this);
        for(int i=0;i<taille;i++){
            c[1][i] = new Pion(new Position(1,i), Couleur.BLANC,this);
        }
        c[7][0] = new Tour(new Position(7,0), Couleur.NOIR,this);
        c[7][1] = new Cavalier(new Position(7,1), Couleur.NOIR,this);
        c[7][2] = new Fou(new Position(7,2), Couleur.NOIR,this);
        c[7][3] = new Reine(new Position(7,3), Couleur.NOIR,this);
        c[7][4] = new roi(new Position(7,4), Couleur.NOIR,this);
        c[7][5] = new Fou(new Position(7,5), Couleur.NOIR,this);
        c[7][6] = new Cavalier(new Position(7,6), Couleur.NOIR,this);
        c[7][7] = new Tour(new Position(7,7), Couleur.NOIR,this);
        for(int i=0;i<taille;i++){
            c[6][i] = new Pion(new Position(6,i), Couleur.NOIR,this);
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
