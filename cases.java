package echec;

public class cases {
    private Position position;
    private Piece p;
    
    cases(){
        p=null;
        position=null;
    }
    cases(Position p, Piece pc){
        this.p = pc;
        position=p;
    }
    cases(Position p){
        
        this.p = null;
        position=p;
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

    /**
     * @return Piece return the p
     */
    public Piece getPiece() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setPiece(Piece p) {
        this.p = p;
    }
    @Override
    public String toString(){
        if(p!=null){
            return p.toString();
        }
        else{
            return ""+'.';
        }
        
    }
}
