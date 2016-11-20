/**
 * Created by Fatmi on 20/11/2016.
 */
public class main {
    public static void main(String[] args) {
        RobotVirtuel []tab = new RobotVirtuel[3];
        tab[0]= new RobotVirtuel("test");
        tab[1]= new RobotNG(2,3,"test1","Est" );
        tab[2]= new RobotNG(7,4,"test2","Nord" );
       for(int i=0;i<3;i++){
            tab[i].avance();
           tab[i].affiche();
        }
        for(int i=1;i<3;i++){
            ( (RobotNG)  tab[i]).avance(3);
            tab[i].affiche();
        }
        for(int i=0;i<3;i++){
            tab[i].droite();
            tab[i].affiche();
        }
        for(int i=1;i<3;i++){
            ( (RobotNG)  tab[i]).demiTour();
            tab[i].affiche();
        }
    }
}


