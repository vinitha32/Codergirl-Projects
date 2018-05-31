package PatternMaker;

public abstract class PatternClass {

    ShortLineStitch short1 = new ShortLineStitch();

    Stitch small = new SmallCrossStitch();
    Stitch large = new LargeCrossStitch();
    Stitch circle = new CircleStitch();
    Stitch fill = new FillStitch();
    Stitch block = new BlockStitch();
  
    Stitch zig = new ZigZagStitch();


    abstract String pattern();
   

    String  pattern1 = String.valueOf(small.stitch())+String.valueOf(large.stitch());
     String   pattern2=String.valueOf(zig.stitch()) +String.valueOf(zig.stitch())+String.valueOf(zig.stitch())+String.valueOf(fill.stitch())+String.valueOf(fill.stitch())+String.valueOf(fill.stitch());
    String  pattern3=String.valueOf(short1.stitch()) +String.valueOf(short1.stitch()) +String.valueOf(circle.stitch());
    String  pattern4=String.valueOf(block.stitch())+String.valueOf(block.stitch6) +String.valueOf(short1.stitch())+String.valueOf(short1.dStitch)+String.valueOf(fill.stitch3);
    String  pattern5=String.valueOf(small.stitch()) +String.valueOf(large.stitch());


    }





