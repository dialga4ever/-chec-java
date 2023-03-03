package echec;

public class Reine extends Piece{
    Reine (Position position, Couleur couleur, Plateaux p) {
        super(position, couleur,p);
    } 
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC) ? '\u2655':'\u265B';
    }
    public String getNom(){
        return "REINE";
    }
}
