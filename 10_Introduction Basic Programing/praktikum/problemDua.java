public class problemDua {

    public static void main(String[] args) {
        int StudentScore=80;

        if (StudentScore >= 80 && StudentScore <= 100) {
            System.out.println("Nilai : " + "A");
        }

        else if (StudentScore >= 65 && StudentScore <= 79) {
            System.out.println("Nilai : " + "B");
        }

        else if (StudentScore >= 65 && StudentScore <= 79) {
            System.out.println("Nilai : " + "B+");
        }

        else if (StudentScore >= 50 && StudentScore <= 64) {
            System.out.println("Nilai : " + "B");
        }

        else if (StudentScore >= 35 && StudentScore <= 49) {
            System.out.println("Nilai : " + "C");
        }

        else if (StudentScore >= 0 && StudentScore <= 34) {
            System.out.println("Nilai : " + "D");
        }

        else {
            System.out.println("INVALID");
        }
    }
}
