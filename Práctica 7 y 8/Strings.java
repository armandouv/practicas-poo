import java.util.Scanner;

public class Strings
{
    // --------------------------------------------
    // Reads an array of Strings, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main(String[] args)
    {
        String[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\n¿Cúantas cadenas quieres ordenar? ");
        size = scan.nextInt();
        strList = new String[size];
        
        System.out.println("\nDame las cadenas...");
        scan.nextLine();
        for (int i = 0; i < size; i++)
        {
            strList[i] = scan.nextLine();
        }
        Sorting.insertionSort(strList);
        System.out.println("\nLas cadenas ordenadas son:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(strList[i] + " ");
        }
        System.out.println();
    }
}
