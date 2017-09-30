package Test.Scribble;

import Scribble.ArtGenerator;
import org.junit.Test;

import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class ArtGeneratorTest extends TimerTask
{
    private static final int ARE_YOU_CHRISTIAN = 0;
    private static final int REFRESH_INTERVAL = 80;

    private ArtGenerator artGenerator = new ArtGenerator();

    private int program = 0;
    private int maxProgram = 10;
    private int programCounter = 0;
    Random random = new Random();
    Color color = Color.red;

    @Override
    public void run()
    {
        program = (ARE_YOU_CHRISTIAN == 1) ? 0x29A : program % maxProgram;
        if( programCounter % 10000 == 0 )
        {
            programCounter %= 256;
            //artGenerator.clear();
        }
        programCounter++;

        switch( 9 )
        {
            case 666:
                artGenerator.hailSatan();
                artGenerator.colorScribble();
                break;
            case 0:
                artGenerator.drawPolygon( ArtGenerator.Polygons.TRIANGLE, 100 );
                break;
            case 1:
                artGenerator.drawPolygon( ArtGenerator.Polygons.QUADRILATERAL, 100 );
                break;
            case 2:
                artGenerator.drawPolygon( ArtGenerator.Polygons.PENTAGON, 100 );
                break;
            case 3:
                artGenerator.drawPolygon( ArtGenerator.Polygons.HEXAGON, 100 );
                break;
            case 4:
                artGenerator.drawPolygon( ArtGenerator.Polygons.HEPTAGON, 100 );
                break;
            case 5:
                artGenerator.drawPolygon( ArtGenerator.Polygons.OCTAGON, 100 );
                break;
            case 6:
                artGenerator.drawPolygon( ArtGenerator.Polygons.NONAGON, 100 );
                break;
            case 7:
                artGenerator.drawPolygon( ArtGenerator.Polygons.DECAGON, 100 );
                break;
            case 8:
                artGenerator.drawSquare();
                artGenerator.drawTriangle( 200 );
            case 9:
                drawSpiral( artGenerator, programCounter);
                break;
            case 100:
                //artGenerator.drawWheel(200, 200, ArtGenerator.Polygons.QUADRILATERAL, Color.green);
                artGenerator.drawWheel( 200, ArtGenerator.Polygons.HEPTAGON, Color.red, 36, 10 );
                break;

        }
        program++;
    }

    private void drawSpiral( ArtGenerator artGenerator, int programCounter )
    {
        int bin = random.nextInt( 1 );
        this.color = new Color(
                random.nextInt( (programCounter%254)+1 ),
                random.nextInt(  bin==1 ? 254 - (programCounter%254) : (programCounter%254)+1 ),
                random.nextInt( (programCounter%254 )+1)
        );

        artGenerator.drawWheel( programCounter%50, ArtGenerator.Polygons.CIRCLE, this.color, programCounter/5, (programCounter%360)/100 );
    }

    public static void main( String[] args )
    {
        Timer timer = new Timer( "Space time" );
        timer.schedule( new ArtGeneratorTest(), 0, REFRESH_INTERVAL );
    }
}
