import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Agent1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            ArrayList<int[]> emptyCells = new ArrayList<>();
            for (int y = 0; y < size; y++) {
                String line = scanner.next();
                for (int x = 0; x < size; x++) {
                    if (line.charAt(x) == '.') {
                        emptyCells.add(new int[]{x, y});
                    }
                }
            }
            
            if (emptyCells.isEmpty()) break;
            int[] move = emptyCells.get(random.nextInt(emptyCells.size()));
            int x = move[0];
            int y = move[1];
            int numBlocks = (size == 6) ? 4 : 9;
            int block = random.nextInt(numBlocks);
            String dir = random.nextBoolean() ? "L" : "R";
            
            System.out.println(String.format("%d %d %d %s", x, y, block, dir));
        }
    }
}
