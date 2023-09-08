public class Main {
    public static void main(String[] args) {
        Main world = new Main();

    }
    public Main (){
        pattern1();
        pattern2();


    }
    public void pattern1(){
        for(int x = 1; x <= 5; x++){
            for(int i = 0; i < 6-x; i++){
                System.out.print("*");

            }
            System.out.println();


        }


    }
    public void pattern2(){
        for(int h = 1; h <= 6; h++){
            for(int l = 1; l < h; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
