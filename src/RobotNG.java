/**
 * Created by Fatmi on 20/11/2016.
 */
public class RobotNG extends RobotVirtuel {
    public RobotNG (int x,int y,String nom, String direction){
        super(x, y, nom, direction);
    }
    /*public void avance(int nb){
    for(int i=0;i<=nb;i++){
        avance();
    }
}*/
    public void gauche(){
        for(int j=0; j<=3; j++){
            droite();
        }
    }
    /* public void demitour(){
         for(int k=0;k<=2;k++){
             droite();
         }
     }*/
    public void avance(int nb){
        switch(getDirection()){
            case "Est":
                setX(getX()+nb);
            case "Nord":
                setY(getY()+nb);
            case"Sud":
                setY(getY()-nb);
            case"Ouest":
                setX(getX()-nb);
        }}
    public void droite(){

        if(getDirection().equals("Nord"))
            setDirection("Est");
        if(getDirection().equals("Est"))
            setDirection("Sud");
        if(getDirection().equals("Est"))
            setDirection("Ouest");
        if(getDirection().equals("Ouest"))
            setDirection("Nord"); }
    public void demitour(){
        switch(getDirection()){
            case "Nord":
                setDirection("Sud");
            case "Ouest":
                setDirection("Est");
            case "Sud":
                setDirection("Nord");
            case "Est":
                setDirection("Ouest");
        }
    }
    public void affiche(String turbo,int nb){
        if(turbo=="ON"){
            avance(nb*3);
            if(turbo=="OFF"){
                avance();
            }
        }
    }
}
