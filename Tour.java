package echec;

public class Tour extends Piece{
    Tour(Position position, Couleur couleur, Plateaux p) {
        super(position, couleur,p);
    } 
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC) ? '\u2655':'\u265B';
    }
    public String getNom(){
        return "TOUR";
    }
    boolean deplacementValide(Position position) {
        if(move.horizontal(getPosition(),position)){
            if(move.vertical(getPosition(),position)){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if(move.vertical(getPosition(),position)){
                return true;
            }
        }
        return false;
        
    };
}
