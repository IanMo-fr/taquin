import java.awt.Event;

public class Animation {

    Jeu jeu;

    public Animation(Jeu jeu) {this.jeu = jeu;}

    public void run (int d) throws InterruptedException {
        System.out.print((char) Event.ESCAPE + "7" );
        jeu.reset();

        for (int i=0; i<d; i++) {
            System.out.print((char) Event.ESCAPE + "[2J");
            System.out.print((char) Event.ESCAPE + "8");
            System.out.println();
            System.out.println(jeu);
            System.out.println("t = " + i);
            jeu.succ();
        }
    }
}
