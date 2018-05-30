package PatternMaker;

public abstract class PatternClass {

    ShortLineStitch short1 = new ShortLineStitch();

    Stitch small = new SmallCrossStitch();
    Stitch large = new LargeCrossStitch();
    Stitch circle = new CircleStitch();
    Stitch fill = new FillStitch();
    Stitch block = new BlockStitch();
    //Stitch block1=new BlockStitch();
    Stitch zig = new ZigZagStitch();


    abstract String pattern();
    boolean needleJam = (Math.random() < 0.05d);
    boolean needleJam1 = (Math.random() < 0.00d);
    boolean needleJam2 = (Math.random() < 0.00d);
    boolean needleJam3 = (Math.random() < 0.10d);
    boolean needleJam4 = (Math.random() < 0.40d);
    boolean[] s={needleJam,needleJam1,needleJam2,needleJam3,needleJam4};



    String  pattern1 = String.valueOf(small.stitch())+String.valueOf(large.stitch());
     String   pattern2=String.valueOf(zig.stitch()) +String.valueOf(zig.stitch())+String.valueOf(zig.stitch())+String.valueOf(fill.stitch())+String.valueOf(fill.stitch())+String.valueOf(fill.stitch());
    String  pattern3=String.valueOf(short1.stitch()) +String.valueOf(short1.stitch()) +String.valueOf(circle.stitch());
    String  pattern4=String.valueOf(block.stitch())+String.valueOf(block.stitch6) +String.valueOf(short1.stitch())+String.valueOf(short1.dStitch)+String.valueOf(fill.stitch3);
    String  pattern5=String.valueOf(small.stitch()) +String.valueOf(large.stitch());


    }
