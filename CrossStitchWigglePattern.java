package PatternMaker;

public  class CrossStitchWigglePattern extends PatternClass {

public String pattern() {

String pattern1= String.valueOf(small.stitch())+String.valueOf(large.stitch());;
return  pattern1 ;
}
    boolean needleJam = (Math.random() < 0.05d);
public boolean isJammed()
{

    return needleJam;
}

}
