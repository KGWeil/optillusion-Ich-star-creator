
import processing.core.PApplet;

/**
 * Klasse WasZeichneIch.
 * Beschreibung: Code lesen und verstehen.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class WasZeichneIch extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,400);
    }        

    // Überlege dir, was die Anweisungen in der Methode "wasZeichneIch" auslösen könnten: Es zeichnet eine Ellipse, einen Strich und ein Rechteck
    // Verändere die Werte, die den Methoden übergeben werden. Was passiert? Wenn ich size ändere, ändert sich die Größe der Leinwand, wenn ich bei der setup()-Methode etwas verändere, kommt ein Fehler, da er die Variablen nicht kennt, wenn ich bei der ellipse x1 verändere, ändert sich die x-Postion der ellipse genau wie beim Rechteck!
    

    public void wasZeichneIch() {
        line(100, 50, 200, 100);
        ellipse(80, 200, 50, 100);
        rect(100, 100, 250, 20);
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        wasZeichneIch();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {WasZeichneIch.class.getName() });
    }

}
