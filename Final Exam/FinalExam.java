import javax.sound.midi.Soundbank;

public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if ((j <= 8 && i == 2 )) {
                    System.out.print(array[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println("2. FRAPPUCCINO ");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if ((j <= 12 && j >= 2) && i == 13 ) {
                    System.out.print(array[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");


        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if ((i <= 9 && i >= 2) && j == 9 ) {
                    System.out.print(array[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");

        int row1 = 7;
        int column1 = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i >= 13){
                    continue;
              }
              else if (i == row1 && j == column1){
                System.out.print(array[i][j]);
                row1++;
                column1++;
              }
              else {
                System.out.print(" ");
              }
            }
            System.out.println();
        }


        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");

        int row2 = 5;
        int column2 = 7;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i >= 13){
                    continue;
              }
              else if (i == row2 && j == column2){
                System.out.print(array[i][j]);
                row2++;
                column2--;
              }
              else {
                System.out.print(" ");
              }
            }
            System.out.println();
        }


        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if ((j <= 10 && j >= 4) && i == 1 ) {
                    System.out.print(array[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i <= 11 && i >= 1 && j == 14 ) {
                    System.out.print(array[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");

        int row3 = 0;
        int column3 = 14;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (j >= 6 && (i == row3 && j == column3)){
                    System.out.print(array[i][j]);
                    row3++;
                    column3--;
                }
              else {
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
 
