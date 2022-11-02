public class Segment {
    public Segment(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    private Point a;

    private Point b;

    double segment = 0;

    public void CalcSegment(){
        segment = Math.sqrt(((b.x-a.x)*(b.x-a.x)) +((b.y-a.y) * ((b.y-a.y))));
    }

}
