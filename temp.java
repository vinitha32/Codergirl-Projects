public class temp {
    public static void main(String[] args) {
        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are");

 int temp[][] = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83}, {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};
String days[]={"Sun:","Mon:","Tue:","Wed:","Thu:","Fri:","Sat:"};
String time[]={"7 AM:","3 PM:","7 PM:","3 AM:"};

for(int i=0;i<temp.length;i++) {

           System.out.print(time[i]);

           for (int j = 0; j < temp[0].length; j++) {

               System.out.print(temp[i][j] + " ");
           }
           System.out.println();
       }

        System.out.println("\n");
        System.out.println("Based on that data, the following are the average temperatures for the week.\n");

            int sum=0;int totalSum=0;
                for (int c = 0; c < temp[0].length; c++) {
                    for (int r = 0; r < temp.length; r++) {
                        sum = sum + temp[r][c];
                    }

                    System.out.println(days[c] + " " + sum / temp.length);
                    totalSum = totalSum + sum / temp.length;
                    sum = 0;
                }
                   System.out.println();

        for(int r=0;r<temp.length;r++)
        {
            for(int c=0;c<temp[0].length;c++)
            {
                sum=sum+temp[r][c];
            }

            System.out.println(time[r]+" "+sum/temp[0].length);
            sum =0;
        }

        System.out.println("The final average temperature for the week was:\n");
        System.out.println("Overall:"+totalSum/temp[0].length);

        }}
