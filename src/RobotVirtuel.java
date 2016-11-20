/**
 * Created by Fatmi on 20/11/2016.
 */
public class RobotVirtuel{
        private String nom;
        private int x;
        private int y;
        private String direction;

        public RobotVirtuel(int x, int y, String nom, String direction) {
            this.x = x;
            this.y = y;
            this.nom = nom;
            this.direction = direction;
        }

        public RobotVirtuel(String nom) {
            this.x = 0;
            this.y = 0;
            this.nom = nom;
            this.direction = "Est";
        }

        public void avance() {
            switch (direction) {
                case "Est":
                    x++;
                case "Nord":
                    y++;
                case "Sud":
                    y--;
                case "Ouest":
                    x--;
            }
        }

        public void droite() {
            if (direction == "Nord")
                direction = "Est";
            if (direction == "Est")
                direction = "Sud";
            if (direction == "Sud")
                direction = "Ouest";
            if (direction == "Ouest")
                direction = "Nord";
        }

        public void affiche() {
            System.out.println("le robot est " + nom + " sa direction est " + direction+" sa position est "+( +x+" , "+y));

        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }


}
