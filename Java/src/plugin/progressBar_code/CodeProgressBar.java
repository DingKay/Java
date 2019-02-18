package plugin.progressBar_code;

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

    public CodeProgressBar(double barLength){
        this.barLength = barLength;
    }

    public double getBarLength() {
        return barLength;
    }

    public void showBarByPoint(double currentPoint){
        this.percentage = currentPoint/this.barLength;
        System.out.print("\r");
        System.out.print(makeBarBypercentage(this.percentage));
    }

    public String makeBarBypercentage(double percentage){
        int nowIndex = (int)(this.endIndex * percentage);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.endIndex; i++) {
            if (i < nowIndex){
                sb.append("#");
            }
            else {
                sb.append(" ");
            }
        }
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
