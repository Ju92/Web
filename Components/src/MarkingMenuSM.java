/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import fr.lri.swingstates.canvas.CStateMachine;

/*
    Machine à état contrôlant le comportement du marking menu
*/
/**
 *
 * @author Juliette
 */
public class MarkingMenuSM extends CStateMachine {
   
    public StripSM(CShape shape, StripView stripView) {
        super(Desktop.getCanvasInstance());
        this.leftShape = shape;
        this.stripView = stripView;
        points = new ArrayList<>();
    }
    /**
     * START.
     */
    public State Start = new State() {
        // Press of the pen on the left part of the strip
        Transition penPress = new PressOnShape(BUTTON1, ">> Drawing") {
            @Override
            public boolean guard() {
                return isStylus() && getShape() == leftShape;
            }

            @Override
            public void action() {
                //Initialisation of the drawing
                lastDrawPoint = getPoint();
                gesture.addPoint(lastDrawPoint.getX(), lastDrawPoint.getY());
                polyLine = new CPolyLine(lastDrawPoint);
                polyLines.add(polyLine);
                polyLine.setStroke(new BasicStroke(2));
                polyLine.setOutlinePaint(Color.RED);
                polyLine.setTransparencyOutline(0.6f);
                polyLine.setPickable(false);
                Desktop.getCanvasInstance().addShape(polyLine);
            }
        };

    
}
