public class Main {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }




    int counter = 10;
    for(;counter >0;counter--)

    {
        System.out.print(counter + " ");
     System.out.println();

     int start = 1, end = 10;
     int sum = 0;
     for (int i = start; i < end; i++) {
         sum += 1;
     }
     System.out.println(sum);
    }

    // вложенный цикл
    for (int i = 1; i < 10; i++)  {
        for (int j = 1; j < 10; j++){
            System.out.print( i * j + "\t");
        }
        System.out.println();
     }

    int n2 = 10;
    for (int i = 0; i < n2; i++) {
        if (i % 2 != 0) {
            continue;
        }
        System.out.print(i + " ");
    }

}
}