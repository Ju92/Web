/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.lri.swingstates.canvas.CShape;
import fr.lri.swingstates.canvas.CStateMachine;
import fr.lri.swingstates.sm.State;
import fr.lri.swingstates.sm.Transition;
import fr.lri.swingstates.sm.transitions.Drag;
import fr.lri.swingstates.sm.transitions.Press;
import fr.lri.swingstates.sm.transitions.Release;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.views.AbstractView;

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
        Transition mousePress = new Press(">> Pressing") {
            @Override
            public boolean guard() {
                return false; // true quand on détecte un press
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
        Transition mousePress = new Drag(">> Dragging") {
            @Override
            public boolean guard() {
                return false; //true quand on détecte un mouvement
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
        Transition mousePress = new Release(">> Init") {
            @Override
            public boolean guard() {
                return false; //true quand on détecte un release
            }

            @Override
            public void action() {
            }
        };
    };

}
