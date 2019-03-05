public class Drawer {
    private String filler;

    Drawer (String filler){
        this.filler = filler;
    }
/**            /|\
 *           /  |  \
 *         /    |    \
 *       /      |      \
 *     /    1   |   2    \
 *   /          |          \
 *  -------------------------
 *   \          |          /
 *     \    3   |   4    /
 *       \      |      /
 *         \    |    /
 *           \  |  /
 *             \|/
 *
 */
    void drawFirst(){
        System.out.println("First task");
        drawSecondTriangle();
        drawFourthTriangle();
    }
    void drawSecond(){
        System.out.println("Second task");
        drawThirdTriangle();
    }
    void drawThird(){
        System.out.println("Third task");
        drawFirstTriangle();
    }
    void drawFourth(){
        System.out.println("Fourth task");
        drawFirstTriangle();
        drawThirdTriangle();
    }
    void drawFifth(){
        System.out.println("Fifth task");
        drawPyramide();
        drawPyramide();
    }


    private void drawFirstTriangle(){
        int i = 1;
        while (i<=5) {
            drawAscendingTriangle(i);
            drawDescendingTriangle(i);
            System.out.println();
            i++;
        }
    }

    private void drawSecondTriangle(){
        int i = 1;
        while (i<=5) {
            drawDescendingTriangle(i);
            System.out.println();
            i++;
        }
    }

    private void drawThirdTriangle(){
        int i = 5;
        while (i>0) {
            drawAscendingTriangle(i);
            drawDescendingTriangle(i);
            System.out.println();
            i--;
        }
    }

    private void drawFourthTriangle(){
        int i = 5;
        while (i>0) {
            drawDescendingTriangle(i);
            System.out.println();
            i--;
        }
    }

    private void drawPyramide(){
        int i = 1;
        while (i<=5) {
            drawAscendingTriangle(i);
            int k = i*2;
            while (k>0){
                System.out.print(filler);
                k--;
            }
            System.out.println();
            i++;
        }
    }

    private void drawDescendingTriangle (int i){
        while (i>0){
            System.out.print(filler);
            i--;
        }

    }

    private void drawAscendingTriangle (int i){
        while (5-i>0) {
            System.out.print("  ");
            i++;
        }
    }
}