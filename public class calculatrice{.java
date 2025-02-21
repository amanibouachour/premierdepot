public class calculatrice{
    public double addition(double a, double b){
        return a+b;
    }
    public double soustraction(double a, doubleb){
        return a-b;
    }
    public double multiplication(double a,double b){
        return a*b;
    }
    public double division(double a,double b){
        if(b==0){
            throw newarithmeticException("eureur");
        }
        return a/b;
    }
    pblic class test{
        public static void main(String[] args){
            Scanner Scanner=new Scanner(System.in);
            calculatrice cal=new calculatrice();
            system.out.println("entrer le premier nombre:");
            double num1=scanner.nextDouble();
            system.out.println("entrez l'operation");
            char operation=scanner .next().charAt(0);
            system .out.println("entrer le deuxieme numero");
            double num2=scanner.nextDoube();
            try{
                double resultat=0;
                switch(operation){
                    case'+':
                    resultat=cal.addition(num1,num2);
                    break;
                    case'-':
                    resultat=cal.soustraction(num1,num2);
                    break;
                    case'*':
                    resultat=cal.addition(num1,num2);
                    break;
                    resultat=cal.division(num1,num2);
                    break;
                    default:
                        System.out.println("invalide");
                        return;
                }
                System.out.println(resultat);
    
            }catch (arithmeticExeption e)
{
    System.out.println(e.getMessage());
}        }
    }finally{
        scanner.close();
    }

}