public class PhysicalExamination {

    static final int VMAX = 21;

    //중첩(Nested) 클래스
    static class PhyscData{
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat){
        double sum = 0;

        for (int i = 0; i < dat.length; i++){
            sum += dat[i].height;
        }
        return sum / dat.length;
    }
}
