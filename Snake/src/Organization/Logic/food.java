package Organization.Logic;
import javafx.scene.paint.Color;

public class food {
    public static final Color COLOR = Color.ROSYBROWN;

    private Point point;

    food(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}

