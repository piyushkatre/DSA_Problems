public class ShortestPath {
    public static int displacement(String path) {
        int x =0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // North
            if (dir == 'N') {
                y++;
            } else if (dir == 'E') { // East
                x++;
            } else if (dir == 'S') { // South
                y--;
            } else {  // West
                x--;
            }
        }


        int disp = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return disp;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path is: " + displacement(path));
    }
}
