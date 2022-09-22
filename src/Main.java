public class Main
{
    public static void main(String[] args)
    {
        String party = "T";


        if(party.equals("R"))
        {
            System.out.println("You get a republican elephant ");
        }
        else if (party.equals("D"))
        {
            System.out.println("You get a democratic donkey");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an independent human ");
        }
        else
        {
            System.out.println("You get other ");
        }
    }
}
