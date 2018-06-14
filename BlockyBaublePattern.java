package PatternMaker;

public class BlockyBaublePattern extends PatternClass {

    public String pattern() {
        String  pattern4=String.valueOf(block.stitch())+String.valueOf(block.stitch6) +String.valueOf(short1.stitch())+String.valueOf(short1.dStitch)+String.valueOf(fill.stitch3);
return pattern4;
    }
    boolean needleJam3 = (Math.random() < 0.10d);
    public boolean isJammed() {

        return needleJam3;
    }
}
