package echec;

public class Tour extends Piece{
    Tour(Position position, Couleur couleur) {
        super(position, couleur);
    } 
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC) ? '\u2655':'\u265B';
    }
    public String getNom(){
        return "TOUR";
    }
}
