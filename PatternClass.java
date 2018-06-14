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
    abstract boolean isJammed();


}

