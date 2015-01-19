
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adrien
 */
public class MenuShape extends JComponent {

    private static final double DEFAULT_RAYON = 100;
    private static final double DEFAULT_THETA = 0;
    private static final double DEFAULT_ALPHA = 45;

    private double rayon;
    private double alpha;
    private double theta;
    private Point center;

    public MenuShape(double rRayon,
            double alpha,
            double theta) {
        super();
        this.rayon = rayon;
        this.theta = theta;
        this.alpha = alpha;
        center = new Point(0, 0);
    }

    @Override
    public void paint(Graphics g) {
        g.fi
    }

    public MenuShape() {
        this(DEFAULT_RAYON, DEFAULT_ALPHA, DEFAULT_THETA);
    }

    /**
     * @return the internalRayon
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * @param internalRayon the internalRayon to set
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    /**
     * @return the theta
     */
    public double getTheta() {
        return theta;
    }

    /**
     * @param theta the theta to set
     */
    public void setTheta(double theta) {
        this.theta = theta;
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @return the DEFAULT_R1
     */
    public static double getDEFAULT__RAYON() {
        return DEFAULT_RAYON;
    }
}
