
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

    private static final double DEFAULT_R1 = 0;
    private static final double DEFAULT_R2 = 100;
    private static final double DEFAULT_THETA = 0;
    private static final double DEFAULT_ALPHA = 45;

    private double internalRayon;
    private double externalRayon;
    private double alpha;
    private double theta;
    private Point center;

    public MenuShape(double internalRayon,
            double externalRayon,
            double alpha,
            double theta) {
        super();
        this.internalRayon = internalRayon;
        this.externalRayon = externalRayon;
        this.theta = theta;
        this.alpha = alpha;
        center = new Point(0, 0);
    }

    @Override
    public void paint(Graphics g) {

    }

    public MenuShape() {
        this(DEFAULT_R1, DEFAULT_R2, DEFAULT_ALPHA, DEFAULT_THETA);
    }

    /**
     * @return the internalRayon
     */
    public double getInternalRayon() {
        return internalRayon;
    }

    /**
     * @param internalRayon the internalRayon to set
     */
    public void setInternalRayon(double internalRayon) {
        this.internalRayon = internalRayon;
    }

    /**
     * @return the externalRayon
     */
    public double getExternalRayon() {
        return externalRayon;
    }

    /**
     * @param externalRayon the externalRayon to set
     */
    public void setExternalRayon(double externalRayon) {
        this.externalRayon = externalRayon;
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
    public static double getDEFAULT_INTERNAL_RAYON() {
        return DEFAULT_R1;
    }

    /**
     * @return the DEFAULT_R2
     */
    public static double getDEFAULT_EXTERNAL_RAYON() {
        return DEFAULT_R2;
    }

    /**
     * @return the DEFAULT_THETA
     */
    public static double getDEFAULT_THETA() {
        return DEFAULT_THETA;
    }

    /**
     * @return the DEFAULT_ALPHA
     */
    public static double getDEFAULT_ALPHA() {
        return DEFAULT_ALPHA;
    }
}
