/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.lri.swingstates.canvas.CShape;
import fr.lri.swingstates.canvas.CStateMachine;
import fr.lri.swingstates.canvas.transitions.PressOnShape;
import fr.lri.swingstates.sm.State;
import fr.lri.swingstates.sm.Transition;

/*
 Machine à état contrôlant le comportement du marking menu
 */
/**
 *
 * @author Juliette
 */
public class MarkingMenuSM extends CStateMachine {

    public MarkingMenuSM(CShape shape) {
        super();
    }
    /**
     * INIT.
     */
    public State Init = new State() {
        // Press of the pen on the left part of the strip
        Transition mousePress = new PressOnShape(BUTTON1, ">> Pressing") {
            @Override
            public boolean guard() {
                return false;
            }

            @Override
            public void action() {
            }
        };
    };
    /**
     * PRESSING.
     */
    public State Pressing = new State() {
        // Press of the pen on the left part of the strip
        Transition mousePress = new PressOnShape(BUTTON1, ">> Dragging") {
            @Override
            public boolean guard() {
                return false;
            }

            @Override
            public void action() {
            }
        };
    };
    /**
     * DRAGGING.
     */
    public State Dragging = new State() {
        // Press of the pen on the left part of the strip
        Transition mousePress = new PressOnShape(BUTTON1, ">> Init") {
            @Override
            public boolean guard() {
                return false;
            }

            @Override
            public void action() {
            }
        };
    };

}
