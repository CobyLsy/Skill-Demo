public class SkillDemo{
    public static int divide(int n, int m){
        if (m == 0){
            throw new ArithmeticException("Zero Division");
        }
        return n/m;
    }
}
