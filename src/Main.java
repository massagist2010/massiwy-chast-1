public class Main {
    public static void main(String[] args) {
        // Массивы часть 1
        System.out.println("Массивы часть 1");
        System.out.println("Д.З. - 1, задание первое: ");
        ///////////////////////////////////////
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        double[] massive1 = {1.57, 7.654, 9.986};
        int[] massive2 = {2, 4, 8, 16, 17, 25};
        System.out.println("второе задание");
        for (int i = 0; i < massive.length; i++) {
                System.out.print(massive [i]);
            if (i!= massive.length - 1){
                System.out.print(", ");}
        }
        System.out.println("");
        for (int i = 0; i < massive1.length; i++) {
            System.out.print(massive1 [i]);
            if (i!= massive1.length - 1){
                System.out.print(", ");}
        }
        System.out.println("");
        for (int i = 0; i < massive2.length; i++) {
            System.out.print(massive2 [i]);
            if (i!= massive2.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("задание третье");
        for (int i = massive.length - 1; i>0; i--){
        System.out.print(massive [i]);
        if (i != 0){
                System.out.print(", ");
        }
        }
        System.out.println("");
        for (int i = massive1.length - 1; i>0; i--){
            System.out.print(massive1 [i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int i = massive2.length - 1; i>0; i--){
            System.out.print(massive2 [i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("задание четвертое ");
        for (int i = 0; i<massive.length; i ++ ) {
            if (massive[i] % 2 != 0)
                massive[i] += 1;
            {
                System.out.println(massive[i]);
                System.out.println("вроде бы все так");
            }
        }
    }
}