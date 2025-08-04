//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();

        for(int i=0; i<5;i++) {
            System.out.println(e);
        }


        int i = 2;

        switch (i){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            default:
                System.out.println("Enter correct");
                break;
        }

    }
}