package Array;
class Array{

    void caculate_length(){

        int [] age = new int[3];

        age[0] = 10;
        age[1] = 20;
        age[2] = 30;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age.length);
    }

}
public class length {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.caculate_length();

    }
}
