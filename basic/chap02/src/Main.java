public class Main {

    public static void main(String[] args) {

        PhysicalExamination.PhyscData[] x = {
                new PhysicalExamination.PhyscData("eddy", 183, 0.2),
                new PhysicalExamination.PhyscData("lee", 167, 0.1)
        };

        System.out.println(PhysicalExamination.aveHeight(x));


    }
}
