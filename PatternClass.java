package PatternMaker;

public class PatternClass {

    ShortLineStitch stitch = new ShortLineStitch();

    SmallCrossStitch stitch1 = new SmallCrossStitch();
    LargeCrossStitch stitch2 = new LargeCrossStitch();
    CircleStitch stitch3 = new CircleStitch();
    FillStitch stitch4 = new FillStitch();
    BlockStitch stitch6 = new BlockStitch();
    BlockStitch stitch5=new BlockStitch();
    ZigZagStitch stitch7 = new ZigZagStitch();



    String  pattern1 = String.valueOf(stitch1.stitch1)+String.valueOf(stitch2.stitch2);
     String   pattern2=String.valueOf(stitch7.stitch7) +String.valueOf(stitch7.stitch7)+String.valueOf(stitch7.stitch7)+String.valueOf(stitch4.stitch4)+String.valueOf(stitch4.stitch4)+String.valueOf(stitch4.stitch4);
    String  pattern3=String.valueOf(stitch.stitch) +String.valueOf(stitch.stitch) +String.valueOf(stitch.stitch3);
    String  pattern4=String.valueOf(stitch5.stitch5)+String.valueOf(stitch6.stitch6) +String.valueOf(stitch.stitch)+String.valueOf(stitch.stitch)+String.valueOf(stitch3.stitch3);
    String  pattern5=String.valueOf(stitch1.stitch1) +String.valueOf(stitch2.stitch2);


    }





