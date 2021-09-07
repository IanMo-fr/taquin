public class main {

    static public void main(String[] args) {
        try {
            Jeu jeu = new Jeu() {
                @Override
                public void succ() {

                }

                @Override
                public void jeuSimple() {

                }

                @Override
                public void reset() {

                }
            };
            new Animation(jeu).run(6);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
