package PatternMaker;
import java.util.Random;

public class TapestryController {
    public static void main(String[] args) {

    CrossStitchWigglePattern p=new CrossStitchWigglePattern();
        boolean needleJam = (Math.random() < 0.40d);
        if(needleJam)
        {
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 7; i++) {
                System.out.print(p.pattern1);
            }
            System.out.println(p.pattern1);
        }
        System.out.println("------------------");
        System.out.println("------------------");

        for (int k = 1; k <= 8; k++) {
            for (int c = 1; c <= 5; c++) {
                System.out.print(p.pattern1);
            }
            System.out.println(p.pattern1);
        }}


    ZigZagLinePattern z=new ZigZagLinePattern();

        boolean needleJam1 = (Math.random() < 0.00d);
        if(needleJam1)
                for (int j = 1; j <= 3; j++) {
                    for (int i = 1; i <= 7; i++) {
                        System.out.print(z.pattern2);
                    }
                    System.out.println(z.pattern2);
                }
                System.out.println("-------------------------------------");
                System.out.println("-------------------------------------");

                for (int k = 1; k <= 8; k++) {
                    for (int c = 1; c <= 5; c++) {
                        System.out.print(z.pattern2);
                    }
                    System.out.println(z.pattern2);
                }



            BaublePattern b=new BaublePattern();
        boolean needleJam2 = (Math.random() < 0.00d);
        if(needleJam2)
                for (int j = 1; j <= 3; j++) {
                    for (int i = 1; i <= 7; i++) {
                        System.out.print(b.pattern3);
                    }
                    System.out.println(b.pattern3);
                }
                System.out.println("------------------");
                System.out.println("------------------");

                for (int k = 1; k <= 8; k++) {
                    for (int c = 1; c <= 5; c++) {
                        System.out.print(b.pattern3);
                    }
                    System.out.println(b.pattern3);
                }


BlockyBaublePattern bp=new BlockyBaublePattern();
        boolean needleJam3 = (Math.random() < 0.10d);
if(needleJam3)
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 7; i++) {
                System.out.print(bp.pattern4);
            }
            System.out.println(bp.pattern4);
        }
        System.out.println("------------------");
        System.out.println("------------------");

        for (int k = 1; k <= 8; k++) {
            for (int c = 1; c <= 5; c++) {
                System.out.print(bp.pattern4);
            }
            System.out.println(bp.pattern4);

        }


    BrokenWigglePattern n=new BrokenWigglePattern();
        boolean needleJam4 = (Math.random() < 0.40d);
if(needleJam4)
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 7; i++) {
                System.out.print(n.pattern5);
            }
            System.out.println(n.pattern5);
        }
        System.out.println("------------------");
        System.out.println("------------------");

        for (int k = 1; k <= 8; k++) {
            for (int c = 1; c <= 5; c++) {
                System.out.print(n.pattern5);
            }
            System.out.println(n.pattern5);
        }
    }}
