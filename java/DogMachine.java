package com.csayer.DogMachine;
import java.util.Scanner;
import java.util.scanner;

public class DogMachine
{
    public static void main(String []args)
    {
        DogDb db = new DogDb();
        Dog cDog = new Dog();
        Scanner scn = new Scanner(System.in);
        String breed = "";
        //TODO:
        //Add scanner stuff here
        System.out.println("name: ");
        cDog.name = scn.nextLine();

        //Dog.breed is set to an int so we set it to a local variable
        //named breed then set Dog.breed to the int version
        System.out.println("breed: ");
        breed = scn.nextLine();

        System.out.println("weight: ");
        cDog.weight = scn.nextFloat();

        System.out.println("age: ");
        cDog.age = scn.nextInt();
        switch(breed)
        {
            case "beagle":
                break;
            
            

            default:
                System.out.println("[ FATAL ] Breed not recognized. Falling back...");
                //Fallback breed is beagle
                cDog.breed = 1;
        }
        //Finally, call getDog()
        db.getDog(cDog);
    }
}

public class Dog
{
    private static int ver = 1;
    public String name = "";
    public int breed = 0;
    public float weight = 0.0;
    public int age = 0;
    public boolean isRecognized = false;
}

public class DogDb
{
    private static int ver = 1;
    private String eggText = "Hi max!";
    public void getDog(Dog dogInfo)
    {
        System.out.println("getDog() called");
        switch(dogName)
        {
            case 1:
                //Beagle
                System.out.println("                            ..,,,,,,,,,..                               Dog machine v%d", ver);
                System.out.println("                     .,;%%%%%%%%%%%%%%%%%%%%;,.                         ---------------");
                System.out.println("                   %%%%%%%%%%%%%%%%%%%%////%%%%%%, .,;%%;,              Dog Name:   %s", dogInfo.name);
                System.out.println("            .,;%/,%%%%%/////%%%%%%%%%%%%%%////%%%%,%%//%%%,             Dog Breed:  %s", sBreed);
                System.out.println("        .,;%%%%/,%%%///%%%%%%%%%%%%%%%%%%%%%%%%%%%%,////%%%%;,          Dog Weight: %f", dogInfo.breed);
                System.out.println("     .,%%%%%%//,%%%%%%%%%%%%%%%%@@%a%%%%%%%%%%%%%%%%,%%/%%%%%%%;,       Dog Age:    %d", dogInfo.age);
                System.out.println("   .,%//%%%%//,%%%%///////%%%%%%%@@@%%%%%%///////%%%%,%%//%%%%%%%%,     %s", eggText);
                System.out.println(" ,%%%%%///%%//,%%//%%%%%///%%%%%@@@%%%%%////%%%%%%%%%,/%%%%%%%%%%%%%    ");
                System.out.println(".%%%%%%%%%////,%%%%%%%//%///%%%%@@@@%%%////%%/////%%%,/;%%%%%%%%/%%%    ");
                System.out.println("%/%%%%%%%/////,%%%%///%%////%%%@@@@@%%%///%%/%%%%%//%,////%%%%//%%%'    ");
                System.out.println("%//%%%%%//////,%/%a`  'a%///%%%@@@@@@%%////a`  'a%%%%,//%///%/%%%%%     ");
                System.out.println("%///%%%%%%///,%%%%@@aa@@%//%%%@@@@S@@@%%///@@aa@@%%%%%,/%////%%%%%      ");
                System.out.println("%%//%%%%%%%//,%%%%%///////%%%@S@@@@SS@@@%%/////%%%%%%%,%////%%%%%'      ");
                System.out.println("%%//%%%%%%%//,%%%%/////%%@%@SS@@@@@@@S@@@@%%%%/////%%%,////%%%%%'       ");
                System.out.println("`%/%%%%//%%//,%%%///%%%%@@@S@@@@@@@@@@@@@@@S%%%%////%%,///%%%%%'        ");
                System.out.println("  %%%%//%%%%/,%%%%%%%%@@@@@@@@@@@@@@@@@@@@@SS@%%%%%%%%,//%%%%%'         ");
                System.out.println("  `%%%//%%%%/,%%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@S@@%%%%%,/////%%'          ");
                System.out.println("   `%%%//%%%/,%%%@@@SS@@SSs@@@@@@@@@@@@@sSS@@@@@@%%%,//%%//%'           ");
                System.out.println("    `%%%%%%/  %%S@@SS@@@@@Ss` .,,.    'sS@@@S@@@@%'  ///%/%'            ");
                System.out.println("      `%%%/    %SS@@@@SSS@@S.         .S@@SSS@@@@'    //%%'             ");
                System.out.println("               /`S@@@@@@SSSSSs,     ,sSSSSS@@@@@'                       ");
                System.out.println("             %%//`@@@@@@@@@@@@@Ss,sS@@@@@@@@@@@'/                       ");
                System.out.println("           %%%%@@00`@@@@@@@@@@@@@'@@@@@@@@@@@'//%%                      ");
                System.out.println("       %%%%%%a%@@@@000aaaaaaaaa00a00aaaaaaa00%@%%%%%                    ");
                System.out.println("    %%%%%%a%%@@@@@@@@@@000000000000000000@@@%@@%%%@%%%                  ");
                System.out.println(" %%%%%%a%%@@@%@@@@@@@@@@@00000000000000@@@@@@@@@%@@%%@%%                ");
                System.out.println("%%%aa%@@@@@@@@@@@@@@0000000000000000000000@@@@@@@@%@@@%%%%              ");
                System.out.println("%%@@@@@@@@@@@@@@@00000000000000000000000000000@@@@@@@@@%%%%%            ");
                break;

            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case 4:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case 5:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case 6:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case 7:
                System.out.println("WIP");
                break;

            default:
                System.out.println("[ INTERNAL ] SWitch encountered unknown value. Function: getDog()");
        }
    }
}