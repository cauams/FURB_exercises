package unidade05;

public class Uni5Exe10 {
    public static void main(String[] args) {
        int[][] list = new int [10][2];
        list[0][0] = 8;
        list[0][1] = 1;
        list[1][0] = 0;
        list[1][1] = 10; 
        list[2][0] = 20; 
        list[2][1] = 25; 
        list[3][0] = 30;
        list[3][1] = 25;
        list[4][0] = 88;
        list[4][1] = 209;
        list[5][0] = 494;
        list[5][1] = 209;
        list[6][0] = 494;
        list[6][1] = 1729;
        list[7][0] = 744;
        list[7][1] = 1984;
        list[8][0] = 2450;
        list[8][1] = 2500;
        list[9][0] = 2550;
        list[9][1] = 2500;
        
        int result = 0;
        for(int i = 0; i <= 9; i++)
        {
           result = list[i][0] + list[i][1];
           System.out.println(Math.pow(result, 2));
        }
    }
}
