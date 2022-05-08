import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void Random(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            Random random = new Random();
            arr[i] = random.nextInt(100 - (-100)) + (-100);
        }
    }

    public static void Input(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
    }

    public static void Output(int[] arr)
    {
        for (int val: arr)
            System.out.print(val + " ");
        System.out.println();
    }
	
	public  static int MinI(int[] arr)
    {
		int min_i = 0;
        for (int i = 0; i < arr.length; i++)
            if(arr[i] < arr[min_i])
                min_i = i;
		
		return min_i;
    }
	
	public static int DobZero(int[] arr) throws Exception {
        if(arr[0] == 0) throw new Exception("Перший елемент 0!");

		boolean have_zero = false;
        int dob = 1;
        for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == 0)
			{
				have_zero = true;
				break;
			}
			else dob*=arr[i];
        }
		
		if(have_zero == false) throw new Exception("Немає нулів!");
		
        return dob;
    }
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("Введіть розмір масиву: ");
            n = in.nextInt();
            if(n < 1) 
				System.out.println("Розмір не може бути меньше за 1!");
        }
        while (n < 1);
		int[] arr = new int[n];
		char inputtype;
        do
        {
            System.out.println("Оберіть метод заповнення масиву:");
            System.out.println("1 — ввід елементів з клавіатури");
            System.out.println("2 — рандомайзер.");
            System.out.print("метод: ");
            inputtype = in.next().charAt(0);

            switch (inputtype)
            {
                case '1':
                    Input(arr);
                    break;
                case '2':
                    Random(arr);
                    break;
                default:
                    System.out.println("Повторіть ввід даних");
                    break;
            }
            System.out.println();
        } while (inputtype != '1' && inputtype != '2');

        System.out.println("Масив: ");
        Output(arr);
		
		System.out.println("Номер мінімального елемента масиву: " + MinI(arr));
		
		try
		{
			System.out.println("Добуток елементів масиву, розташованих до першого нульового елемента: " + DobZero(arr));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
    }
}