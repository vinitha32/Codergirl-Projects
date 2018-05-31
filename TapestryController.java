package PatternMaker;

public class TapestaryController {
    public static void main(String[] args) {


        PatternClass cross = new CrossStitchWigglePattern();
        PatternClass zig = new ZigZagLinePattern();
        PatternClass bauble = new BaublePattern();
        PatternClass blocky = new BlockyBaublePattern();
        PatternClass broken = new BrokenWigglePattern();
        PatternClass[] c = {cross, zig, bauble, blocky, broken};
        



        for (int m = 0; m < c.length; m++) {

            System.out.println("Printing "+c[m]);
            if(c[m].isJammed())

            for (int j = 1; j <= 3; j++) {
                for (int i = 1; i <= 7; i++) {
                    System.out.print(c[m].pattern());
                }
                System.out.println(c[m].pattern());
            }

            System.out.println("-----------------------");
            System.out.println("-----------------------");
            {
                if(c[m].isJammed()) {
                    for (int p = 1; p <= 8; p++) {
                        for (int l = 1; l <= 5; l++) {
                            System.out.print(c[m].pattern());
                        }
                        System.out.println(c[m].pattern());

                    }

                }
            }
        System.out.println();

    }}}
