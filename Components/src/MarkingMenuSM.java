/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.lri.swingstates.canvas.CShape;
import fr.lri.swingstates.canvas.CStateMachine;
import fr.lri.swingstates.sm.State;
import fr.lri.swingstates.sm.Transition;
import fr.lri.swingstates.sm.jtransitions.ReleaseOnComponent;
import fr.lri.swingstates.sm.transitions.Drag;
import fr.lri.swingstates.sm.transitions.Press;
import java.awt.Component;

/*
 Machine à état contrôlant le comportement du marking menu
 */
/**
 *
 * @author Juliette
 */
public class MarkingMenuSM extends CStateMachine {

    private Component selectedComponent;

    public MarkingMenuSM() {
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
                //apparition du marking menu
            }
        };
    };
    /**
     * PRESSING.
     */
    public State Pressing = new State() {
        // Press of the pen on the left part of the strip
        Transition mouseDrag = new Drag(">> Dragging") {
            @Override
            public boolean guard() {
                return false; //true quand on détecte un mouvement
            }

            @Override
            public void action() {
                //
            }
        };
    };
    /**
     * DRAGGING.
     */
    public State Dragging = new State() {
        // Press of the pen on the left part of the strip
        Transition mousePress = new ReleaseOnComponent(BUTTON1, ">> Init") {
            @Override
            public boolean guard() {
                return false; //true quand on détecte un release
            }

            @Override
            public void action() {
                //disparition de marking menu et actionne le bouton sur lequel il release
                selectedComponent = getComponent();
            }
        };
    };

}
