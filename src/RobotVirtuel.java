/**
 * Created by Fatmi on 20/11/2016.
 */
public class Robot{
        private String nom;
        private int x;
        private int y;
        private String direction;
 public Robot (String nom){
        this.nom=nom;
        this.direction="Est";
        this.x=0;
        this.y=0;
    }
    public Robot (String nom,int x,int y,String direction){
        this.nom=nom;
        this.direction=direction;
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public String getNom() {
        return nom;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void avance(){
        switch(direction){
            case "Est":
                x++;
                break;
            case"Sud":
                y--;
                break;
            case "Nord":
                y++;
                break;
            case "Ouest":
                x--;
                break;
        }
    }
    public void droite(){
        switch(direction){
            case "Nord":
                direction="Est";
            case "Est":
                direction="Sud";
            case "Sud":
                direction="Ouest";
            case "Ouest":
                direction="Nord";
        }}
        public void affiche(){
            System.out.println("le robot est "+ nom +" sa position est "+ "(" + x +","+ y+")"+" sa direction est "+direction);
    }
}
      
