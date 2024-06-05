package app.generator;

import app.model.IFigure;
import app.model.MyCircle;
import app.model.MyRectangle;

/**
 * A class that generates rectangles.
 */
public final class RectangleGenerator implements ShapeGenerator {

    /**
     * Retrieves the type of shape generated by this generator.
     *
     * @return the shape type as a String
     */
    @Override
    public final String getShapeType() {
        return "Rectangle";
    }

    /**
     * Checks if the rectangle generator is ready to generate a rectangle.
     * The generator is considered ready if it has at least two points.
     *
     * @return true if the generator is ready, false otherwise
     */
    @Override
    public final boolean isReady() {
        return points.size() > 1;
    }

    /**
     * Creates a new rectangle based on the points stored in the generator.
     *
     * @return the created rectangle as an IFigure object
     */
    @Override
    public final IFigure createShape() {
        return new MyRectangle(points.get(0).getX(),
                points.get(0).getY(),
                points.get(1).getX(),
                points.get(1).getY());
    }

    /**
     * Returns a ghost shape of type IFigure based on the given coordinates.
     * If the number of points is equal to 1, a MyRectangle object is created with the given coordinates.
     * If the number of points is not equal to 1, a MyCircle object is created with an example radius of 3.
     * The color of the ghost shape is set to "#000000aa".
     *
     * @param x the x-coordinate of the ghost shape
     * @param y the y-coordinate of the ghost shape
     * @return a ghost shape of type IFigure
     */
    @Override
    public final IFigure ghostShape(double x, double y)
    {
        if (points.size() == 1)
        {
            MyRectangle ghost = new MyRectangle(points.get(0).getX(),
                    points.get(0).getY(),
                    x,
                    y);
            ghost.setColor("#000000aa");
            return ghost;
        }
        else {
            MyCircle ghost = new MyCircle(x, y, 3);
            ghost.setColor("#000000aa");
            return ghost;
        }
    }

}
