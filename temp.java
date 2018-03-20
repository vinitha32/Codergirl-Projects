public class temp {
    public static void main(String[] args) {
        int[][] temp = new int[4][7];
        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are");


        int row[][] = {{68, 70, 76, 70, 68, 71, 75},{76, 76, 87, 84, 82, 75, 83},{73, 72, 81, 78, 76, 73, 77},{64, 65, 69, 68, 70, 74, 72}};

        System.out.print("7 AM:");
        for (int i = 0; i < 7; i++) {
            System.out.print( row[0][i] + " ");

        }

        System.out.println();
        System.out.print("3 PM:");
        for (int i = 0; i < 7; i++) {

            System.out.print( row[1][i] + " ");
        }
        System.out.println();
        System.out.print("7 PM:");
        for (int i = 0; i < 7; i++) {

            System.out.print((int) row[2][i] + " ");
        }

        System.out.println();
        System.out.print("3 AM:");
        for (int i = 0; i < 7; i++) {

            System.out.print((int) row[3][i] + " ");
        }

        System.out.println("\n");
        System.out.println("Based on that data, the following are the average temperatures for the week.");
       int  avgsun=0;int avgmon=0;int tue=0;int wed=0;int thu=0;int fri=0;int sat=0;
        for(int j=0;j<4;j++) {
            avgsun = avgsun + row[j][0];
            avgmon = avgmon + row[j][1];
            tue = tue + row[j][2];
            wed = wed + row[j][3];
            thu = thu + row[j][4];
            fri = fri + row[j][5];
            sat = sat + row[j][6];
        }
            System.out.println("Sun:" + avgsun / 4);
            System.out.println("Mon:" + avgmon / 4);
            System.out.println("Tue:" + tue / 4);
            System.out.println("Wed:" + wed / 4);
            System.out.println("Thu:" + thu / 4);
            System.out.println("Fri:" + fri / 4);
            System.out.println("Sat:" + sat / 4);

        System.out.println();
        int avg7=0;
        int avg8=0;
        int avg9=0;
        int avg10=0;
       for(int i=0;i<7;i++) {

           avg7 = avg7 + row[0][i];
           avg8=avg8+row[1][i];
            avg9=avg9+row[2][i];
           avg10=avg10+row[3][i];
       }
           System.out.println("7 AM:"+avg7/7);
        System.out.println("3 PM:"+avg8/7);
        System.out.println("7 PM:"+avg9/7);
        System.out.println("3 AM:"+avg10/7);

        System.out.println();
        int finavg=(((avgsun/4)+(avgmon/4)+(tue/4)+(wed/4)+(thu/4)+(fri/4)+(sat/4))/7);
        System.out.println("The final average temperature for the week was:\n" );
        System.out.println("Overall:"+finavg);
        }
    }
