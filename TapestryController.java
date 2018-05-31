package PatternMaker;




public class TapestaryController {
    public static void main(String[] args) {

        boolean needleJam = (Math.random() < 0.05d);
        boolean needleJam1 =true; //(Math.random() < 0.00d);
        boolean needleJam2 = true;//(Math.random() < 0.00d);
        boolean needleJam3 = (Math.random() < 0.10d);
        boolean needleJam4 = (Math.random() < 0.40d);
        PatternClass cross = new CrossStitchWigglePattern();
        PatternClass zig = new ZigZagLinePattern();
        PatternClass bauble = new BaublePattern();
        PatternClass blocky = new BlockyBaublePattern();
        PatternClass broken = new BrokenWigglePattern();
        PatternClass[] c = {cross, zig, bauble, blocky, broken};

        boolean[] s={needleJam,needleJam1,needleJam2,needleJam3,needleJam4};

        boolean status=false;


{
        for (int m = 0; m < c.length; m++) {

            System.out.println("Printing "+c[m]);
            if(s[m]){
            for (int j = 1; j <= 3; j++) {
                for (int i = 1; i <= 7; i++) {
                    System.out.print(c[m].pattern());
                }
                System.out.println(c[m].pattern());
            }}

            System.out.println("-----------------------");
            System.out.println("-----------------------");
            {
                if (s[m]) {
                    for (int p = 1; p <= 8; p++) {
                        for (int l = 1; l <= 5; l++) {
                            System.out.print(c[m].pattern());
                        }
                        System.out.println(c[m].pattern());
                        status = true;
                    }

                }
            }
        System.out.println();

    }}}}
