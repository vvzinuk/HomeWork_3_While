public class Drawer {
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
        secondTriangle();
        fourthTriangle();
    }
    void drawSecond(){
        thirdTriangle();
    }
    void drawThird(){
        firstTriangle();
    }
    void drawFourth(){
        firstTriangle();
        thirdTriangle();
    }
    void drawFifth(){
        pyramide();
        pyramide();
    }


    private void firstTriangle(){
        int i = 1;
        while (i<=5) {
            int j = i;
            while (5-j>0){
                System.out.print("  ");
                j++;
            }
            int k = i;
            while (k>0){
                System.out.print(" *");
                k--;
            }
            System.out.println(" ");
            i++;
        }
    }

    private void secondTriangle(){
        int i = 1;
        while (i<=5) {
            int j = i;
            while (j>0){
                System.out.print(" *");
                j--;
            }
            System.out.println(" ");
            i++;
        }
    }

    private void thirdTriangle(){
        int i = 5;
        while (i>0) {
            int j = i;
            while (j<5){
                System.out.print("  ");
                j++;
            }
            int k = i;
            while (k>0){
                System.out.print(" *");
                k--;
            }
            System.out.println(" ");
            i--;
        }
    }

    private void fourthTriangle(){
        int i = 5;
        while (i>0) {
            int j = i;
            while (j>0){
                System.out.print(" *");
                j--;
            }
            System.out.println(" ");
            i--;
        }
    }

    private void pyramide(){
        int i = 1;
        while (i<=5) {
            int j = i;
            while (5-j>0){
                System.out.print("  ");
                j++;
            }
            int k = i;
            while (k>0){
                System.out.print(" *");
                k--;
            }
            int l = i;
            while (l>0){
                System.out.print(" *");
                l--;
            }
            System.out.println(" ");
            i++;
        }
    }
}