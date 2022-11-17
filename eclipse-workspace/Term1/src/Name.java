public class Name
{
    public static void main(String[]args)
    {
        System.out.println();
        System.out.println("\tName\t\tHometown\tIntended Major");
        System.out.println("\t====\t\t========\t==============");
        System.out.println("\tSally\t\tRoanoke\t\tComputer Science");
        System.out.println("\tamber heard\t Texas\tActor");
        System.out.println("\tJoshua\t\tTaipei\t\tMovie");
        System.out.println("\tJohn\t\tBusan\t\tChemistry");
        System.out.println("\tRic\t\tIncheon\t\tComputer Science");
        String b = "TANAVA";
		for(int i =0; i<b.length()-1; i++) {
			if(b.substring(i,i+1).equals("A")) {
				b=b.substring(0,i)+b.substring(i+1,i+2)+b.substring(i,i+1)+b.substring(i+2);
			}
		}
		System.out.println(b);
    }
}