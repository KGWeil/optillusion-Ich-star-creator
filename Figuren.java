
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(300,500); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

        // x und y bleiben bei den ellipsen immer gleich, nur die Höhe und Breite muss verändert werden

        // ***** Ende der eigenen Anweisungen **********
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        //x, y, b und h müssen geändert werden

        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); rect(50,50,200,200);ellipse (150,150,150,150); ellipse (150,150,110,110); ellipse (150,150,70,70);
        zeichneBildA(); ellipse (150,360,200,200); rect (87,300,125,125); rect (104,317,90,90); rect (121,334,55,55);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
