package PatternMaker;


public class BrokenWigglePattern extends PatternClass {

   public String pattern() {
       String  pattern5=String.valueOf(small.stitch()) +String.valueOf(large.stitch());
return pattern5;
}
    boolean needleJam4 = (Math.random() < 0.40d);

    public boolean isJammed() {

        return needleJam4;
    }
}
