public class temp {
    public static void main(String[] args) {
        int[][] temp = new int[4][7];
        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are");
        int[] row0 = {68, 70, 76, 70, 68, 71, 75};
        int[] row1 = {76, 76, 87, 84, 82, 75, 83};
        int[] row2 = {73, 72, 81, 78, 76, 73, 77};
        int[] row3 = {64, 65, 69, 68, 70, 74, 72};
        int[] col0 = {68, 76, 73, 64};
        int[] col1 = {70, 76, 72, 65};
        int[] col2 = {76, 87, 81, 69};
        int[] col3 = {70, 84, 78, 68};
        int[] col4 = {68, 82, 76, 70};
        int[] col5 = {71, 75, 73, 74};
        int[] col6 = {75, 83, 77, 72};


        System.out.print("7 AM:");
        for (int i = 0; i < 7; i++) {
            System.out.print((int) row0[i] + " ");

        }

        System.out.println();
        System.out.print("3 PM:");
        for (int i = 0; i < 7; i++) {

            System.out.print((int) row1[i] + " ");
        }
        System.out.println();
        System.out.print("7 PM:");
        for (int i = 0; i < 7; i++) {

            System.out.print((int) row2[i] + " ");
        }

        System.out.println();
        System.out.print("3 AM:");
        for (int i = 0; i < 7; i++) {

            System.out.print((int) row3[i] + " ");
        }

        System.out.println("\n");
        System.out.println("Based on that data, the following are the average temperatures for the week.");
        int avg = 0;
        int avg1 = 0;
        int avg2 = 0;
        int avg3 = 0;
        int avg4 = 0;
        int avg5 = 0;
        int avg6 = 0;
        for (int i = 0; i < 4; i++) {
            avg = avg + col0[i];
            avg1 = avg1 + col1[i];
            avg2 = avg2 + col2[i];
            avg3 = avg3 + col3[i];
            avg4 = avg4 + col4[i];
            avg5 = avg5 + col5[i];
            avg6 = avg6 + col6[i];
        }
        System.out.println("Sun:" + avg/4);
        System.out.println("Mon:" + avg1/4);
        System.out.println("Tue:" + avg2/4);
        System.out.println("Wed:" + avg3/4);
        System.out.println("Thu:" + avg4/4);
        System.out.println("Fri:" + avg5/4);
        System.out.println("Sat:" + avg6/4);



        System.out.println();
        int avg7=0;
        int avg8=0;
        int avg9=0;
        int avg10=0;
       for(int i=0;i<7;i++) {

           avg7 = avg7 + row0[i];
           avg8=avg8+row1[i];
            avg9=avg9+row2[i];
           avg10=avg10+row3[i];
       }
           System.out.println("7 AM:"+avg7/7);
        System.out.println("3 PM:"+avg8/7);
        System.out.println("7 PM:"+avg9/7);
        System.out.println("3 AM:"+avg10/7);

        System.out.println();
        int finavg=(((avg/4)+(avg1/4)+(avg2/4)+(avg3/4)+(avg4/4)+(avg5/4)+(avg6/4))/7);
        System.out.println("The final average temperature for the week was:" +finavg);



        }


    }