import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		int size = 7;
		
		int[] memories = new int[size];
		float[] prices = new float[size];

        System.out.println("Ввід даних про жорсткі диски:");
		
		for(int i = 0; i < size; i++)
		{
			System.out.println("Жорсткий диск №" + (i+1));
			System.out.print("\tОбсяг пам'яті: ");
			memories[i] = in.nextInt();
			System.out.print("\tВартість: ");
			prices[i] = in.nextFloat();
		}
		
		System.out.println("Вартість:");
		int n = in.nextInt();
		
		System.out.println("Обсяг пам'яті вінчестерів, вартість яких більша за " + n + " гривень:");
		
		for(int i = 0; i < size; i++)
		{
			if(prices[i] > n)
				System.out.println(memories[i]);
		}		
    }
}
