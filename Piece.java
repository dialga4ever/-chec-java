package échec;

public abstract class Piece {
    private Position position;
    private final Couleur couleur;
    private final String nom;
    private final char symbole;



    public abstract String getNom();
    public abstract char getSymbole();
    abstract boolean deplacementValide(Position position);
    
    public Piece(Position position, Couleur couleur,String nom, char symbole) {
        this.position = position;
        this.couleur = couleur;
        this.nom = nom;
        this.symbole = symbole;
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
            setPosition(position);
            return true;
        }
        return false;
    }
}
