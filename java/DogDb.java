public class DogDb
{
    private static int ver = 1;
    private String eggText = "Hi max!";
    public void getDog(Dog dogInfo)
    {
        System.out.println("getDog() called\n");
        switch(dogInfo.breed)
        {
            case 1:
                //Beagle
                System.out.printf("                            ..,,,,,,,,,..                               Dog machine v%d\n", ver);
                System.out.printf("                     .,;%%%%%%%%%%%%%%%%%%%%;,.                         ---------------\n");
                System.out.printf("                   %%%%%%%%%%%%%%%%%%%%////%%%%%%, .,;%%;,              Dog Name:   %s\n", dogInfo.name);
                System.out.printf("            .,;%/,%%%%%/////%%%%%%%%%%%%%%////%%%%,%%//%%%,             Dog Breed:  %s\n", dogInfo.breed);
                System.out.printf("        .,;%%%%/,%%%///%%%%%%%%%%%%%%%%%%%%%%%%%%%%,////%%%%;,          Dog Weight: %f\n", dogInfo.weight);
                System.out.printf("     .,%%%%%%//,%%%%%%%%%%%%%%%%@@%a%%%%%%%%%%%%%%%%,%%/%%%%%%%;,       Dog Age:    %d\n", dogInfo.age);
                System.out.printf("   .,%//%%%%//,%%%%///////%%%%%%%@@@%%%%%%///////%%%%,%%//%%%%%%%%,     %s\n", eggText);
                System.out.printf(" ,%%%%%///%%//,%%//%%%%%///%%%%%@@@%%%%%////%%%%%%%%%,/%%%%%%%%%%%%%    \n");
                System.out.printf(".%%%%%%%%%////,%%%%%%%//%///%%%%@@@@%%%////%%/////%%%,/;%%%%%%%%/%%%    \n");
                System.out.printf("%/%%%%%%%/////,%%%%///%%////%%%@@@@@%%%///%%/%%%%%//%,////%%%%//%%%'    \n");
                System.out.printf("%//%%%%%//////,%/%a`  'a%///%%%@@@@@@%%////a`  'a%%%%,//%///%/%%%%%     \n");
                System.out.printf("%///%%%%%%///,%%%%@@aa@@%//%%%@@@@S@@@%%///@@aa@@%%%%%,/%////%%%%%      \n");
                System.out.printf("%%//%%%%%%%//,%%%%%///////%%%@S@@@@SS@@@%%/////%%%%%%%,%////%%%%%'      \n");
                System.out.printf("%%//%%%%%%%//,%%%%/////%%@%@SS@@@@@@@S@@@@%%%%/////%%%,////%%%%%'       \n");
                System.out.printf("`%/%%%%//%%//,%%%///%%%%@@@S@@@@@@@@@@@@@@@S%%%%////%%,///%%%%%'        \n");
                System.out.printf("  %%%%//%%%%/,%%%%%%%%@@@@@@@@@@@@@@@@@@@@@SS@%%%%%%%%,//%%%%%'         \n");
                System.out.printf("  `%%%//%%%%/,%%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@S@@%%%%%,/////%%'          \n");
                System.out.printf("   `%%%//%%%/,%%%@@@SS@@SSs@@@@@@@@@@@@@sSS@@@@@@%%%,//%%//%'           \n");
                System.out.printf("    `%%%%%%/  %%S@@SS@@@@@Ss` .,,.    'sS@@@S@@@@%'  ///%/%'            \n");
                System.out.printf("      `%%%/    %SS@@@@SSS@@S.         .S@@SSS@@@@'    //%%'             \n");
                System.out.printf("               /`S@@@@@@SSSSSs,     ,sSSSSS@@@@@'                       \n");
                System.out.printf("             %%//`@@@@@@@@@@@@@Ss,sS@@@@@@@@@@@'/                       \n");
                System.out.printf("           %%%%@@00`@@@@@@@@@@@@@'@@@@@@@@@@@'//%%                      \n");
                System.out.printf("       %%%%%%a%@@@@000aaaaaaaaa00a00aaaaaaa00%@%%%%%                    \n");
                System.out.printf("    %%%%%%a%%@@@@@@@@@@000000000000000000@@@%@@%%%@%%%                  \n");
                System.out.printf(" %%%%%%a%%@@@%@@@@@@@@@@@00000000000000@@@@@@@@@%@@%%@%%                \n");
                System.out.printf("%%%aa%@@@@@@@@@@@@@@0000000000000000000000@@@@@@@@%@@@%%%%              \n");
                System.out.printf("%%@@@@@@@@@@@@@@@00000000000000000000000000000@@@@@@@@@%%%%%            \n");
                break;

            case 2:
                //Dauchshund
                System.out.printf("            __     \n");
                System.out.printf("(|,--------'()'--o \n");
                System.out.printf(" (_    ___    /~#  \n");
                System.out.printf("  (_)_)  (_)_)     \n");
                break;

            case 3:
                //Hound :]
                System.out.printf("    ___                     \n");
                System.out.printf(" __/ \\/ |                  \n");
                System.out.printf("|      \\                   \n");
                System.out.printf("|_--\\   \\              /- \n");
                System.out.printf("     \\   \\-___________/ / \n");
                System.out.printf("      \\                :   \n");
                System.out.printf("      |                :    \n");
                System.out.printf("      |      _____     )    \n");
                System.out.printf("       |  __/     \\    )   \n");
                System.out.printf("        | /         \\  |   \n");
                System.out.printf("        |l           \\ l   \n");
                System.out.printf("        |l            ll    \n");
                System.out.printf("        |l            ll    \n");
                System.out.printf("       / l           / l    \n");
                System.out.printf("       --/           --     \n");
                break;

            case 4:
                //Labrador
                System.out.printf("    _________      \n");
                System.out.printf("   |    |    \\    \n");
                System.out.printf("    \\   /    \\   \n");
                System.out.printf("   / \\_/   |  \\  \n");
                System.out.printf("  /            \\  \n");
                System.out.printf(" /    ____       0 \n");
                System.out.printf("/      /  \\_____/ \n");
                break;

            case 5:
                //Bulldog
                System.out.printf(",-.___,-.   \n");
                System.out.printf("\\_/_ _\\_/ \n");
                System.out.printf("  )O_O(     \n");
                System.out.printf(" { (_) }    \n");
                System.out.printf("  `-^-'     \n");
                break;

            case 6:
                //Westie/west highland terrier
                System.out.printf("/^-----^\\       \n");
                System.out.printf("V  o o  V        \n");
                System.out.printf(" |  Y  |         \n");
                System.out.printf("  \\ V /         \n");
                System.out.printf("  / - \\         \n");
                System.out.printf("  |    \\        \n");
                System.out.printf("  |     \\     ) \n");
                System.out.printf("  || (___\\====  \n");
                break;

            case 7:
                System.out.println("WIP");
                break;

            default:
                System.out.println("[ INTERNAL ] SWitch encountered unknown value. Function: getDog()");
        }
    }
}