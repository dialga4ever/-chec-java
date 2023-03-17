package echec;

public class move {
    public static boolean horizontal(Position position1, Position position2) {
        return position1.getligne() == position2.getligne();
    }
    public static boolean vertical(Position position1, Position position2) {
        return position1.getColonne() == position2.getColonne();
    }
    public static boolean diagonal(Position position1, Position position2) {
        return Math.abs(position1.getligne() - position2.getligne()) == Math.abs(position1.getColonne() - position2.getColonne());
    }
    public static boolean Lmove(Position position1, Position position2){
        return (Math.abs(position1.getligne()-position2.getligne()+position1.getColonne()-position2.getColonne())==3)&& ((position1.getligne()-position2.getligne()*position1.getColonne()-position2.getColonne())!=0);
    }
}
