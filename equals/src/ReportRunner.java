
public class ReportRunner {
    public static void main(String[] args) {

        Report report1 = new Report("Android App Development", "Times New Roman", 50, 500);
        Report report2 = new Report("StealthCAPTCHA", "Times New Roman", 200, 1000);
        Report report3 = new Report("Android App Development", "Times New Roman", 50, 200);

        boolean isSame = report1.equals(report2);
        System.out.println("Report is same: " + isSame);
        boolean same = report1.equals(report3);
        System.out.println("Report is same: " + same);
    }
}