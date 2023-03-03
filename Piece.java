package echec;

public abstract class Piece {
    private Position position;
    private final Couleur couleur;
    private Plateaux plateau;



    public abstract String getNom();
    public abstract char getSymbole();
    abstract boolean deplacementValide(Position position);
    
    public Piece(Position position, Couleur couleur, Plateau p) {
        this.position = position;
        this.couleur = couleur;
        this.plateau = p;

    }


    /**
     * @return Position return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    public Couleur getCouleur() {
        return couleur;
    }
    boolean deplace(Position position) {
        if (deplacementValide(position)) {
            plateau.c[this.position.getColonne()][this.position.getligne()]=null;
            setPosition(position);
            plateau.c[position.getColonne()][position.getligne()]=this;            
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return symbole;
    }
}
