package echec;

public class Main {
    
    public static void main(String[] args) {
        Plateaux plat=new Plateaux();
        System.out.println(plat);
        plat.c[0][0]=new Tour(new Position(1,1),Couleur.BLANC,plat);

        System.out.println(plat);
    }
}
