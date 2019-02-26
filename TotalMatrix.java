import java.util.Scanner;

public class TotalMatrix {
    public static void main(String[] args) {
        //Tạo matrix và biến
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước 2 mảng bằng nhau :");
        System.out.println("Nhập kích thước hàng ngang:");
        int arrRow = scanner.nextInt();
        System.out.println("Nhập kích thước hàng dọc:");
        int arrCol = scanner.nextInt();
        int[][] arr = new int[arrRow][arrCol];
        int x = 0;
        int y = 0;
        int col;
        int totalCol = 0;
        int totalAll = 0;
        int totalBias = 0;
        int totalBias2 = 0;

        //Nhập giá trị vào mảng
        do {
            for ( x = 0; x < arrRow; x++)
            {
                for ( y = 0; y < arrCol; y++)
                {
                    System.out.println("arr["+ x +"][" + y + "] :");
                    arr[x][y] = scanner.nextInt();
                }
            }

        }while (x <= arr.length - 1);

        //Duyệt matrix lần đầu
        System.out.println("Mảng sau khi tạo:");
        for (  x = 0; x < arrRow; x++)
        {
            for (  y = 0; y < arrCol; y++)
            {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
        //tính tổng
        System.out.println("Nhập cột muốn tính :");
        do {
            col = scanner.nextInt();
            if (0 > col || col >arrCol)
            {
                System.out.println("Lớn hơn số hàng của mảng");
                break;
            }
            else if (col < arrCol)
            {
                for (x = 0; x < arrRow; x++)
                {
                    for (y = 0; y < arrCol; y++)
                    {
                        //hàng chéo
                        if (x == y)
                        {
                            totalBias += arr[x][y];
                        }
                        else if ((arrCol - 1 - y) == x)
                        {
                            totalBias2 += arr[x][y];
                        }
                        //Hàng ngang
                        if (y == col)
                        {
                            totalCol += arr[x][col];
                        }
                    }
                }
                System.out.println("Tổng hàng chéo \\ : " + totalBias);
                System.out.println("Tổng hàng chéo / : " + totalBias2);
                System.out.println("Tổng hàng dọc " + col + " là : " + totalCol);
                totalBias = 0;
                totalBias2 = 0;
                totalCol = 0;
            }
        }while (col <= arrCol);
    }
}
