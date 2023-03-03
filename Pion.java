package echec;

public class Pion extends Piece{
    Pion(Position position, Couleur couleur, Plateaux p) {
        super(position, couleur,p);
    } 
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC) ? '\u2658':'\u265E';
    }
    public String getNom(){
        return "PION";
    }
    
}
