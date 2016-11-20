/**
 * Created by Fatmi on 20/11/2016.
 */
public class RobotNG extends RobotVirtuel {
     private String turbo;

    public RobotNG(String nom,int x,int y,String direction,String turbo) {
        super(nom,x,y,direction);
        this.turbo=turbo;
    }

    //solution1
 /*  public void avance(int nb){
    for(int i=0;i<nb;i++){
        avance();
    }}
    public void gauche(){
        for(int i=0;i<3;i++){
            droite();
        }
    }
    public void demiTour(){
        for(int i=0;i<2;i++){
            droite();
        }
    }*/
    //solution2
 /*   public void avance(int nb) {
        switch (getDirection()) {
            case "est":
                setX(getX() + nb);
                break;
            case "sud":
                setY(getY() - nb);
                break;
            case "nord":
                setY(getY() + nb);
                break;
            case "ouest":
                setX(getX() - nb);
                break;
        }
    }*/

    public void droite() {
        switch(getDirection()){
            case "Nord":
              setDirection("ouest");
                break;
            case "Est":
               setDirection("Nord");
                break;
            case "Sud":
               setDirection("Est");
                break;
            case "Ouest":
                setDirection("Sud");
                break;
        }}

    public void demiTour() {
        switch(getDirection()){
            case "Nord":
                setDirection("Sud");
                break;
            case "Est":
                setDirection("Ouest");
                break;
            case "Sud":
                setDirection("Nord");
                break;
            case "Ouest":
                setDirection("Est");
                break;
        }}
    //modification pour le mode turbo
    public void avance(int nb) {
        if(turbo.equals("on")){
            nb=nb*3;
        }
        switch (getDirection()) {
            case "Est":
                setX(getX() + nb);
                break;
            case "Sud":
                setY(getY() - nb);
                break;
            case "Nord":
                setY(getY() + nb);
                break;
            case "Ouest":
                setX(getX() - nb);
                break;
        }
    }
    public void affiche(){
        if(turbo.equals("on"))
        System.out.println("le robot est "+ getNom() +" sa position est "+ "(" + getX() +","+ getY()+")"+" sa direction est "+
                getDirection()+"le robot est au mode turbo");
    if(turbo.equals("off"))
        System.out.println("le robot est "+ getNom() +" sa position est "+ "(" + getX() +","+ getY()+")"+" sa direction est "+
                getDirection()+" le mode turbo est désactiver");

    }}
