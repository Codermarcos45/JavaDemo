import java.util.*;

//Given a route containing 4 directions (E,W,N,S), find  the shortest path to reach destination.
// Path : "WNEENESENNN"


public class ShotestPathString {
    
    public static float shortestPath(String str) {
        int x=0, y=0;

        for(int i=0;i<str.length();i++) {

            if(str.charAt(i) == 'W') {
                x--;
            } else if(str.charAt(i) == 'E') {
                x++;
            } else if(str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        //formula for displacement : sqrt of((x2-x1)^2 + (y2-y1)^2)
        double path = Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0),2));

        return (float) path;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.println("Shortest path : "+shortestPath(str));
    }
}
