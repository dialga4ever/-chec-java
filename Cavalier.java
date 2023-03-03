package echec;

public class Cavalier extends Piece{
    Cavalier(Position position, Couleur couleur, Plateaux p) {
        super(position, couleur,p);
    }
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC) ? '\u2657':'\u265D';
    }
    public String getNom(){
        return "CAVALIER";
    }
}
