package leecode;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/17
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _3 {
    public int maxPoints(Point[] points) {
        if (points == null) {
            return 0;
        }

        int len = points.length;
        if (len < 3) {
            return len;
        }

        int maxCount = 0, temp;
        Line line;
        for (int i = 0; i < len; i++) {
            for (int i1 = 0; i1 < len; i1++) {
                if (i != i1) {
                    line = new Line(points[i], points[i1]);
                    System.out.print(points[i].toString() + points[i1].toString() + ": \n");
                    temp = 0;
                    for (int i2 = 0; i2 < len; i2++) {
                        if (line.isOnLine(points[i2])) {
                            System.out.print(points[i2].toString());
                            temp++;
                        }
                    }
                    maxCount = Math.max(maxCount, temp);
                    System.out.println(maxCount);
                }
            }
        }

        return maxCount;
    }
}

class Line {
    Point start;
    Point end;
    float slop;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        slop = getSlop(start, end);
    }

    public boolean isOnLine(Point point) {
        return start == point || Math.abs((getSlop(start, point) - slop)) < 0.0000001f;
    }

    public static float getSlop(Point p1, Point p2) {
        if (p1.x == p2.x) {
            return Float.MAX_VALUE;
        }
        return (p2.y - p1.y) * 1f / (p2.x - p1.x);
    }
}

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") ";
    }
}
