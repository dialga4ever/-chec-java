package échec;


public class Position {
    private int ligne;
    private int colonne;

    Position(int ligne, int colonne) {
        if (ligne < 1 || colonne < 1|| ligne > 8 || colonne > 8) {
            throw new IllegalArgumentException("ligne and colonne must be positive or lower than 8");
            
        }
        this.ligne = ligne;
        this.colonne = colonne;
    }
    

    /**
     * @return int return the ligne
     */
    public int getligne() {
        return ligne;
    }

    /**
     * @param ligne the ligne to set
     */
    public void setX(int ligne) {
        this.ligne = ligne;
    }

    /**
     * @return int return the Colonne
     */
    public int getColonne() {
        return colonne;
    }
    public char getColonneChar() {
        return (char) (colonne + 'A');
    }
    /**
     * @param colonne the colonne to set
     */
    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

}
