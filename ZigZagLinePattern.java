package PatternMaker;


public class ZigZagLinePattern extends PatternClass {
   public String pattern()
   {


       String pattern2=String.valueOf(zig.stitch()) +String.valueOf(zig.stitch())+String.valueOf(zig.stitch())+String.valueOf(fill.stitch())+String.valueOf(fill.stitch())+String.valueOf(fill.stitch());
       return pattern2;
    }
    boolean needleJam1 = true;
    public boolean isJammed()
    {

     return needleJam1;
    }
}
