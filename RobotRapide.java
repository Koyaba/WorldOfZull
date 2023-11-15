/**
 * La classe RobotRapide représente un robot capable de se déplacer rapidement en utilisant une vitesse réglable.
 * Elle hérite de la classe RobotG, ce qui lui permet de partager certaines fonctionnalités avec d'autres robots.
 *
 * @author Kone Yacouba
 * @version 1.0
 */
public class RobotRapide extends RobotG {

    // La vitesse de déplacement du robot
    private int vitesse = 1;

    /**
     * Constructeur de la classe RobotRapide.
     *
     * @param nameRobot Le nom du robot.
     * @param dir La direction initiale du robot.
     * @param x La position en abscisse du robot.
     * @param y La position en ordonnée du robot.
     * @param vitesse La vitesse de déplacement initiale du robot.
     */
    public RobotRapide(String nameRobot, int dir, int x, int y, int vitesse) {
        super(nameRobot, dir, x, y);
        this.vitesse = vitesse;
    }

    /**
     * Permet au robot de se déplacer rapidement en répétant la fonction avancer plusieurs fois.
     */
    public void avancer() {
        for (int v = vitesse; v > 0; v--) {
            // On fait appel à la fonction avancer de la classe Robot pour se déplacer.
            super.avancer();
        }
    }

    /**
     * Permet à l'utilisateur de changer la vitesse de déplacement du robot.
     *
     * @param v La nouvelle vitesse de déplacement.
     */
    public void setVitesse(int v) {
        vitesse = v;
    }

    /**
     * Augmente la vitesse du robot d'un cran.
     */
    public void accelerer() {
        vitesse++;
    }

    /**
     * Diminue la vitesse du robot d'un cran, si la vitesse actuelle est supérieure à zéro.
     */
    public void ralentir() {
        if (vitesse > 0) {
            vitesse--;
        }
    }
}
