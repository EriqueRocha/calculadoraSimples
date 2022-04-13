package calculadoraSimples;

import java.util.Scanner;

public class Hehe {
    public static void main(String[] args){
        Huhu huhu = new Huhu();
        Scanner scanner = new Scanner(System.in);
        huhu.setTexts("bem vindo à calculadora, aperte - enter - para começar");
        System.out.println(huhu.getTexts());
        String dig = scanner.nextLine();
        if(huhu.getEnter().equals(dig)){
            operations();
        }else if(true){
                huhu.setTexts("por favor, aperte enter se quiser começar");
                System.out.println(huhu.getTexts());
                System.out.println("se quiser fechar, digite - sair - ");
                Scanner scanner2 = new Scanner(System.in);
                String dig2 = scanner2.nextLine();
                String x = "sair";
                if(dig2.equals(x)){
                exit();
           }else{
                huhu.setTexts("vamos tentar novamente :)");
                System.out.println(huhu.getTexts());
                main(args);
            }
            }
    }
    public static void operations(){
        Huhu huhu = new Huhu();
        huhu.setTexts("escolha uma operação matemática e a difgite: ");
        System.out.println(huhu.getTexts());
        System.out.println("somar, subtrair, multiplicar ou duvidir.");
        Scanner scanner = new Scanner(System.in);
        String dig = scanner.nextLine();
        if("somar".equals(dig)){
            soma();
        }else if("subtrair".equals(dig)){
            sub();
        }else if("multiplicar".equals(dig)){
            mult();
        }else if("dividir".equals(dig)){
            div();
        } else{operations();}
    }
    public static void soma(){
        System.out.println("digite o primeiro valor e aperte ENTER.");
        Huhu huhu = new Huhu();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int dig = Integer.parseInt(scanner.nextLine());
        System.out.println("digite o segundo valor e aperte ENTER novamente");
        int dig2 = Integer.parseInt(scanner2.nextLine());
        huhu.setTexts("seu resultado é: ");
        System.out.println(huhu.getTexts()+(dig + dig2));
        forward();
    }
    public static void sub(){
        System.out.println("digite o primeiro valor e aperte ENTER.");
        Huhu huhu = new Huhu();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int dig = Integer.parseInt(scanner.nextLine());
        System.out.println("digite o segundo valor e aperte ENTER novamente");
        int dig2 = Integer.parseInt(scanner2.nextLine());
        huhu.setTexts("seu resultado é: ");
        System.out.println(huhu.getTexts()+(dig - dig2));
        forward();
    }
    public static void mult(){
        System.out.println("digite o primeiro valor e aperte ENTER.");
        Huhu huhu = new Huhu();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int dig = Integer.parseInt(scanner.nextLine());
        System.out.println("digite o segundo valor e aperte ENTER novamente");
        int dig2 = Integer.parseInt(scanner2.nextLine());
        huhu.setTexts("seu resultado é: ");
        System.out.println(huhu.getTexts()+(dig * dig2));
        forward();
    }
    public static void div(){
        System.out.println("digite o primeiro valor e aperte ENTER.");
        Huhu huhu = new Huhu();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int dig = Integer.parseInt(scanner.nextLine());
        System.out.println("digite o segundo valor e aperte ENTER novamente");
        int dig2 = Integer.parseInt(scanner2.nextLine());
        huhu.setTexts("seu resultado é: ");
        System.out.println(huhu.getTexts()+(dig / dig2));
        forward();
    }
    public static void forward(){
        Huhu huhu = new Huhu();
        huhu.setTexts("Deseja executar outra operação? aperte - enter -");
        System.out.println(huhu.getTexts());
        System.out.println("Se deseja sair, digite - sair -");
        Scanner scanner = new Scanner(System.in);
        String dig = scanner.nextLine();
        String enter = "";
        if (dig.equals("sair")){
            exit();
        }else if(dig.equals(enter)){
            operations();
        }else{
            System.out.println("============= Use apenas - SAIR - ou - ENTER - ================");
            forward();
        }
    }
public static void exit(){
        Huhu huhu = new Huhu();
        huhu.setTexts("obrigado");
    System.out.println(huhu.getTexts());
}

}
