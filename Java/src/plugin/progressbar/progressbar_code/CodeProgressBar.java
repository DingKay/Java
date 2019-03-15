package plugin.progressbar.progressbar_code;

/**
 * @author DingKai
 * @Classname CodeProgressBar
 * @Description TODO
 * @create 2019/2/18
 */
public class CodeProgressBar {
    private double barLength;
    private double percentage;
    private int endIndex = 50;
    private String head = "\033[36;4m";
    private String end = "\033[0m";

    public CodeProgressBar(double barLength){
        this.barLength = barLength;
    }

    public double getBarLength() {
        return barLength;
    }

    public void showBarByPoint(double currentPoint){
        this.percentage = currentPoint/this.barLength;
        System.out.print("\r" + this.endIndex * percentage + "\r" + makeBarBypercentage(this.percentage));
    }

    public String makeBarBypercentage(double percentage){
        /*Transformation:
        * The int type is used here for the better execution loop below
        * But this also caused a problem of 'loss of precision'
        * In order to solve this problem, the solution of 'five into one one' is adopted.
        * So use Math's round method*/
        int nowIndex = (int) Math.round(this.endIndex * percentage);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.endIndex; i++) {
            if (i == 0 && nowIndex != 0)
                sb.append(head);
            if (i < nowIndex){
                sb.append("=");
            } else if(i == nowIndex){
                sb.append(end + ">");
            } else {
                sb.append(" ");
            }
        }
        if (nowIndex == this.endIndex)
            sb.append(end);
        sb.append("]  ").append(String.format("%.2f", percentage * 100)).append("%");

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        CodeProgressBar codeProgressBar = new CodeProgressBar(100);
        for (double i = 0; i <= codeProgressBar.getBarLength(); i+=2.5D) {
            codeProgressBar.showBarByPoint(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
