package com.csayer.DogMachine;
import java.util.scanner;

public class DogMachine
{
    public static void main(String []args)
    {
        DogDb db = new DogDb();
        Dog cDog = new Dog();
    }
}

public class Dog
{
    private static int ver = 1;
    public int name = "";
    public int breed = 0;
}

public class DogDb
{
    private static int ver = 1;
    public void getDog(String dogName, Dog dogInfo)
    {
        System.out.println("getDog() called");
        switch(dogName)
        {
            case 1:
                //Beagle
                System.out.println("                            ..,,,,,,,,,..                               Dog machine v%d", ver);
                System.out.println("                     .,;%%%%%%%%%%%%%%%%%%%%;,.                         ---------------");
                System.out.println("                   %%%%%%%%%%%%%%%%%%%%////%%%%%%, .,;%%;,              Dog Name:   ");
                System.out.println("            .,;%/,%%%%%/////%%%%%%%%%%%%%%////%%%%,%%//%%%,             Dog Breed:  ");
                System.out.println("        .,;%%%%/,%%%///%%%%%%%%%%%%%%%%%%%%%%%%%%%%,////%%%%;,          Dog Weight: ");
                System.out.println("     .,%%%%%%//,%%%%%%%%%%%%%%%%@@%a%%%%%%%%%%%%%%%%,%%/%%%%%%%;,       Dog Age:    ");
                System.out.println("   .,%//%%%%//,%%%%///////%%%%%%%@@@%%%%%%///////%%%%,%%//%%%%%%%%,     ");
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

            case "6":
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case "6":
                System.out.println("WIP");
                break;

            default:
                System.out.println("[ INTERNAL ] SWitch encountered unknown value. Function: getDog()");
        }
    }
}