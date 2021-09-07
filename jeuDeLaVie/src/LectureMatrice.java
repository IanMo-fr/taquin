import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConstructMatrice {
    public construct(String fichier) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fichier));
        int i = 0;
        String line = sc.nextLine();
        while (sc.hasNext()) {
            for (int j = 0; j < line.length; j++) {
                if (line.charAt(j) == "o" ) {

                }
            }

        }
    }

}
