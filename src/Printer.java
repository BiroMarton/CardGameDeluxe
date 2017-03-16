
/**
 * Created by Zsolt on 2017.03.01..
 */
public class Printer {

    public void print(String message) {
        System.out.println(message);
    }

    public void printObject(Object o) {
        System.out.println(o);
    }

    public void printList(java.util.List<Card> o)
    {
        for (Card i:o) {System.out.println(i);}
    }

    public void printWin() {
        printNudeThree();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        printNudeFour();
    }

    public void printNudeOne(){

        System.out.println(",----------------------------------------------------------------------.-------------.");
        System.out.println("|HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH|(C)Kroggscan |");
        System.out.println("|HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH`-------------+");
        System.out.println("|HHHHHHHHHHHHHHHHHHHHHHHHHHHHHF-.HHHHHHHHHF,,--,---`--`.:::::::::::::::::::/HHHHHHHHH|");
        System.out.println("|HHHHHHHHHHHHHHHHHHHHHHHHHHHF/:::::::::::::::::::::::::::_.dHHHHHHHHb.:.:.:/HHHHHHHHH|");
        System.out.println("|HHHHHHHHHHHHHHHHHHHHHHHHHHHj :.:.:.:.:.:.:.:.:.:.:.:.:.dHHHHHHHHHHHHHH : /HHHHHHHHHH|");
        System.out.println("|HHHHHHHHHHHHHHHHHHHHHHHHHHH|.:.:.:.:.:.:.:.:.:.:.:.:.dHHHHHHHF```HHHHHH:JHP:`:`:HHHH|");
        System.out.println("|HHHF': :`: :`:`: : : : `HHHF:.:.:.:.:.:.:.:.:.:.:.:.dHHHHHHF __  `HHHHHbF.:.:.: :.: |");
        System.out.println("|HHF': : : : : : : : : : : :F::::::::::::_.----.::::dHHHHHH'   _`.    HHHH:.: :.:.:.:|");
        System.out.println("|HF': : : : : : : : : : : : |::::::::;-'`       `::dHHHHHF    <j      HHHHb: :.: :.: |");
        System.out.println("|F': : : : : : : : : : : : :j:::::;-`            |:HHHHHF         _`-.HHHHP.: :.: :.:|");
        System.out.println("| : : : : : : : : : : : : : :/;--`                dHHHHF   ._  - /<jdHHHHF :.: : :.:.|");
        System.out.println("|: : : : : : : : : : : :_.--`                      ```      ``-.`  dHHHF:F:.: :.: :.:|");
        System.out.println("| :.: :.: : :.: :.: :,'`  ,             _.--'           ` .  `-'  dHHHF:j/.: :.:.:.:.|");
        System.out.println("|: :.: :.: :.: :.: :/     `.      _,--'`                 ` `. _.dHHHH:::| `.:.: :.: :|");
        System.out.println("|.: :.: :.: :.: :.: `       `--'``__               `     ,-dHHHHHHHHF:::F  / :.: :.:.|");
        System.out.println("|:.:.:.:.:.:.:.:.:.:.`        ````  ```-.           ` .,dHHHHHHHHHHF:::j    F.: :.: :|");
        System.out.println("|_:_:_:.:.:.:.:.:.:.:.:-.     `-.        `-.      - J  dHHHHHHHHHF`::::F    J:.:.:.:.|");
        System.out.println("|:.:.:`:`:`:`:`:`:`--.-`/        `.         `-.  : oJ  |HHHHHHF``    ``-.    /:_:_:_:|");
        System.out.println("|.:.:.:.:.:.:.:.:.: /  /         _ `-.         `-.`';  FHHHHHF                /.`.`.`|");
        System.out.println("|:.:.:.:.:.:.:.:.:_/   |        ; `-._`.          `.`  jHHHHF_____            /:.:.:.|");
        System.out.println("|.:.:.:.:.:.:.:.-' `.  | / /    |     ``            `-_;`HHF..:.:.:`:`:`-----'..:.:.:|");
        System.out.println("|:.: :.: :.: :`     :;.|; ;  /\\ \\                       `.:.:.:.:.:.:.:.:.::.:.:.:.:.|");
        System.out.println("|.:.: :.: :./       `'';-._,/. \\ \\                       `-.:.: :.: :.: :.: :.: :.: :|");
        System.out.println("|:.: :.: :./          (:\\`\\`-`\\(_/                          `-_:.: :.: :.: :.: :.: :.|");
        System.out.println("|.:.: :.: /            \\:\\`:.  \\_                              `..:.: :.: :.: :.: :.:|");
        System.out.println("|: : : : j              ``::'   .:-._                            `-:_:.: : :.: : :.: |");
        System.out.println("|.: : : :F                  ...:::'  ```-.._                         `-.: :.: : :.: :|");
        System.out.println("|: : : :/                _ :::''     _,'::::::-._                       `-.: : : : : |");
        System.out.println("|.: : :/                /       _,--`: : :`:`:`:::--._                      ``--:.: :|");
        System.out.println("|: : :/                /   _.-:`: : : : : : : : : : : :-._           /            `-.|");
        System.out.println("|.: ;/                /--:`: : : :       : : : : : : : : :`-._       \\               |");
        System.out.println("`------------------------------------------------------------------------------------'");
    }

    public void printNudeTwo(){

        System.out.println("                    _.._");
        System.out.println("                .-'    -.");
        System.out.println("                /  .-'` \\ `.");
        System.out.println("                |   |    .-= `.");
        System.out.println("                |   |_.-.\\` \\ '.");
        System.out.println("                |   |\\  _.-; |  \\");
        System.out.println("                |   | `\\`'' /   |");
        System.out.println("               _|  .---.|``_..  |");
        System.out.println("              /   /     `Y`   '.|\\");
        System.out.println("             /   /       |      \\   `\\");
        System.out.println("             |  /      . |.      \\ )  \\");
        System.out.println("            /  /      |  | |      \\|   \\");
        System.out.println("           /  /       /  | :       \\   |");
        System.out.println("          /  /       /   |  \\       |   \\");
        System.out.println("         /  /      /`    |   \\      \\   |");
        System.out.println("        |  /     /`      |    \\      \\  |");
        System.out.println("        |  `-. .-        |     `\\  .-'  )");
        System.out.println("        |   -.\\          |       \\/.-/ /");
        System.out.println("         \\  -`.\\        / \\      /`_///");
        System.out.println("          |/`'-.|       | | )     |_.-' \\");
        System.out.println("          /  `'-`        \\|/        \\-'` \\");
        System.out.println("          |    |`-_       .       _.|     )");
        System.out.println("          \\    |   `'-.._/ \\_..-'`  /    /");
        System.out.println("           \\   |                   /    /");
        System.out.println("            \\__|                  <____/");
    }
    public void printNudeThree()
    {
        System.out.println("    ?.$$$$$\"     `L         ;;;;;;;,          .`.`.`.`$;??h,_        `h\n" +
                "     ?$$$$$       \"\"'       `;;;;;;;;,         `.`.`.`.hJ\"  `\"??cc,    $\n" +
                " ?\"???\"??\"          j'       :;;;;;;;;;;,       .`.`.`.`$               $\n" +
                " ;;,                 $        :;;;;;;;;;;;,      `.`.`.`.$c,,__          $\n" +
                " i;;,                 h         `':;;;;;;;;;,      `.`.`.`h    `\"         ?c\n" +
                " `$;;;;,              $r           `:;;;;;;;;,      .`.`.`.$\n" +
                "   J$i;;h             $;             `:;;;;;;;,      `.`.`.`$\"\"=,\n" +
                " .$$$$h;,            ,C;       .j???c, `;t;;;;,        `.`.`.?c\n" +
                " $$$$$$h;,           $;,       J;;;;i;L. :?);;,           .`.`.?h,_\n" +
                " $$$$$$$;           j';        $;;;$h9;L `:?);;,                ,C?h.\n" +
                " ?$$$$$$;           $;,        `$;?ii$;;h `;L;;,                (C;;?h\n" +
                "  3$$$$?;          J?;,         `h;;;;;;P  :;L;,                `$;;$?L\n" +
                " .$$$$;;'         ,C;;,           `?CjjF   `;3;,                 $;;?h$\n" +
                " $$$$;;:          $;;;,                    `;3;                  `h;;;F\n" +
                " $$$?;;        `.JF;;;,                     ;3;                   `hiF    J\"\n" +
                " $$?;'     .`.`.c$h;;;;,                   ;;f;,                 ,;iF   z\" z\n" +
                " C;;       .`.`JCCC$;;;;;                 ;;$;;;; `;i;,         ;;J\"   J' J'\n" +
                " ;;      .`.` JF;;??$hi;;;;.            .;;$;;;;;, ;?$;;;,    ,;;i$   J'.P\n" +
                " '      `.`. ,C;;;;,  `\"h;;;;;;;;;;;;;;;i$?;;;;;;;, :;?h;;;;;;;;9\"?. j','\n" +
                "       .`.` .$;;;;'       \"??iijjjjii?\"\"`.`;;;;;;;,  `;;?h;;;;iP   $,'.P\n" +
                "      `.`. ,C;;;,                             `;;;;,  `;;;J\"\"'     `h $\n" +
                "     .`.  ,C;;;;'                               ;;,    ;;;9         $$\n" +
                "    `.`  ,C;;;;f                                `;;,   `;;J  r      `L\n" +
                "   .`   z$;;;;,                                 `;,     ;;9  $       h\n" +
                "       j\"`h;;;'                                 `;,     ;;$  `r      3\n" +
                "      j' ,c;;,                                   ;,     ;;$   $      `h\n" +
                "     .P <$;;,                                   `;,    .;;$.  ?.      $");
    }

    public void printNudeFour()
    {
        System.out.println("|mMMMMMMMMMMMm  mM                                                                                   |\n" +
                "|MMMMMMMMMMMMMMMmMM                        _,--'`-._         __                                      |\n" +
                "|MMMMMMMMMMMMMMMMMMm-.-._               ,-'   `\"\"'  `-.---,'\"  \"`-.                                  |\n" +
                "|MP\\_,  \",\",\"\"\"\"YMMMMMm._\\  ,._,   __ ,'           .:_,`'          `.                                |\n" +
                "|M\\__,-'| /|      `YMMMMMMMMMMMMP,\"\".\"`-._  ...._,-='               ;                                |\n" +
                "|m\\__.. ' `' _..  . `YMMMMMMMP'_.,-'      `. _,'.::.              ,'                                 |\n" +
                "|\\_`--'        ' //|  \\  `\"-/\"'         .:_,'           _____.,--<                                   |\n" +
                "|m `   / , `::, ;( )  :)::,'           .,'          ,-\"' __.,--'--._.                                |\n" +
                "|MMm  | |/      \\|/:.:/;;'           _,' ,          ;_,-'          -`-._                             |\n" +
                "|MMMm.` '        ._,-'\"  .:        ,' _,/          //               `-. `-.                          |\n" +
                "|MMMMMMMm    .::,'        `:.      `\"','          //      .::        `-. `-`-,                       |\n" +
                "|MMMMM\"\"\"\"\"\"---/         .           /  ,  ,     //      .;\"\"\"`-----=.._`-._,'.                      |\n" +
                "|              |          :.        / ,'/ /; /  /\"      .':      ..     `-.,'  `-._                  |\n" +
                "|              |            `.     / / / // // /       ;'          ::..            `-.               |\n" +
                "|              :              `:  '-' / // // /       /               ::.             `.             |\n" +
                "|               \\               \\::. (_/(_; y'       /                             _.   `._          |\n" +
                "|                \\               \\;;:._    /        /                  . .:      \"YMMm     `---..__  |\n" +
                "|                 \\              `.    \"\",'        /;                              YMMMm           ``|\n" +
                "|                  `.              :.  ,'         /\"\\                          `::. \"MMMI;:.         |\n" +
                "|                    `.            ::;'          /   \\                           `:  YMM;|::         |\n" +
                "|                      `.           '           /     \\       .                    `. |:;f:          |\n" +
                "|                        `.                    /       \\                             `|:j;           |\n" +
                "|                          `.                 /         \\     .                        `;::.         |\n" +
                "|                            `-.             /           \\    .                          `::.        |\n" +
                "|                               `-.        ,'             \\ .                              \\::       |\n" +
                "|                                  `-._  ,'                `.  .                            `::.     |\n" +
                "|                                      \"\"                    \\                                \\::.   |\n" +
                "|                                                             `.                               `::   |\n" +
                "|                                                               `._                              \\`\"-|\n");
    }
}
