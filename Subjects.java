public class Subjects {
    //inside the class outside method
    //subjects (X)Maths=70, (y)Physics=50, (Z)Biology=86
    //calculating total percentage=(total/(total subjects*100)
    //average=total/total subjects
    public static void main(String[]args){

        int maths = 70;
        int physics = 50;
        int biology = 86;
        int total = (maths + physics + biology);
        int percentage = (total/3);

        System.out.println(total);
        System.out.println(percentage);
    }
}
