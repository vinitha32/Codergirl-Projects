package PatternMaker;

public class BaublePattern extends PatternClass {

   public String pattern() {
      String  pattern3=String.valueOf(short1.stitch()) +String.valueOf(short1.stitch()) +String.valueOf(circle.stitch());
      return pattern3;

   }
   boolean needleJam2 = true;
   public boolean isJammed()
   {

      return needleJam2;
   }
}
