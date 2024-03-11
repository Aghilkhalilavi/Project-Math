public class PythagoreanTheorem {
    
  public static void allPythagoreanNumbers(int upperBounded){
            for(int a=1;a<upperBounded;a++){
             for(int b=a;b<upperBounded;b++){
              for(int c=b;c<upperBounded;c++){
              if (a*a+b*b==c*c) {
                System.out.println("("+a+","+b+","+c+")");
              } 
            }
        }
    }    
    }
    public static void main(String[] args) {
        allPythagoreanNumbers(200);
    }
}
