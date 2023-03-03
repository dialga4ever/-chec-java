package echec;

public class roi extends Piece{
    roi (Position position, Couleur couleur, Plateaux p) {
        super(position, couleur,p);
    } 
    public char getSymbole(){
        return (this.getCouleur() == Couleur.BLANC) ? '\u2654':'\u265A';
    }
    public String getNom(){
        return "ROI";
    }
}

