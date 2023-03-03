package echec;

public class Fou extends Piece{
    Fou(Position position, Couleur couleur, Plateaux p) {
        super(position, couleur,p);
    }
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC ? '\u2656':'\u265C');
    }
    public String getNom(){
        return "FOU";
    }
    boolean deplacementValide(Position position) {
        if(move.diagonal(position,getPosition())){
            return true;
        }
        return false;
    }
}
