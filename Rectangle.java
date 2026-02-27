
import java.util.Objects;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(0.0, 0.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean equals(Rectangle r) {
        return r != null && Double.compare(width, r.width) == 0 && Double.compare(height, r.height) == 0;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Rectangle r) && equals(r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}
