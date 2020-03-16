import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import java.util.Locale;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
import java.io.*;

public class aula1 {

    public static void main(String[] args) {

//        --------------------------------------------------
//        System.out.println("Aula 1 \n");
//
//        byte a = -128;
//        byte b = 127;
//        System.out.println("Bytes: " + a + " e " + b);
//
//        short c = -32768;
//        short d = 3277;
//        System.out.println("Short: " + c + " e " + d);
//
//        int e = -2147483648;
//        int f = 2147483647;
//        System.out.println("Int: " + e + " e " + f);
//
//        long g;
//        g = -9128129831289312897L;
//        long h;
//        h = 2911812893128731293L;
//        System.out.println("Long: " + g + " e " + h);
//
//        float i = -100.123f;
//        float j = 123456.123f;
//        System.out.println("Float: " + i + " e " + j);
//
//        double k = -3133.3333;
//        double l = 2313213.2131;
//        System.out.println("Double: " + k + " e " + l);
//
//        boolean m = false;
//        boolean n = true;
//        System.out.println("Booleanos: " + m + " e " + n);
//
//        char o = 'a';
//        char p = '4';
//        char q = '?';
//        System.out.println("Char: " + o + ", " + p + " e " + q);

//        --------------------------------------------------
//        double base, altura, areaRetangulo;
//        base = 10.34;
//        altura = 20;
//        areaRetangulo = base * altura;
//
//        System.out.println("A área de um retângulo da base: " + base);
//        System.out.println("Altura: " + altura);
//        System.out.println("é: " + areaRetangulo);

//        --------------------------------------------------

//        System.out.println("JUROS SIMPLES \n");
//        double capital, taxaJuros, numeroPeriodos;
//        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US);
//
//        System.out.print("Insira o capital: R$");
//        capital = input.nextDouble();
//
//        System.out.print("Insira a taxa de juros: ");
//        taxaJuros = input.nextDouble();
//
//        System.out.print("Insira o número de períodos: ");
//        numeroPeriodos = input.nextDouble();
//
//        double jurosSimples = (capital * taxaJuros * numeroPeriodos);
//        double parcelas = jurosSimples / numeroPeriodos;
//        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
//        decimalFormat.setRoundingMode(RoundingMode.DOWN);
//        System.out.println("O valor das parcelas irão ficar em: R$" + decimalFormat.format(parcelas));

//        --------------------------------------------------
//        System.out.println("IMC \n");
//
//        double peso, altura;
//        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US);
//
//        System.out.print("Informe seu peso: ");
//        peso = input.nextDouble();
//
//        System.out.print("Informe sua altura: ");
//        altura = input.nextDouble();
//
//        double imc = peso / (altura*altura);
//        System.out.println("Seu IMC é: " + imc);

//        --------------------------------------------------
//        System.out.println("VELOCIDADE MÉDIA \n");
//
//        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US);
//        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
//        decimalFormat.setRoundingMode(RoundingMode.DOWN);
//        float velocidadeMaxima = 80;
//        float velocidadePercorrida, tempoEmMinutos, tempoEmHoras;
//
//        while (true) {
//            System.out.print("Informe a velocidade percorrida: ");
//            velocidadePercorrida = input.nextFloat();
//
//            System.out.print("Informe o tempo percorrido (em minutos): ");
//            tempoEmMinutos = input.nextFloat();
//
//            tempoEmHoras = tempoEmMinutos / 60;
//            double velocidadeMedia = velocidadePercorrida / tempoEmHoras;
//
//            System.out.println("A velocidade média foi de " + decimalFormat.format(velocidadeMedia) + ". A velocidade máxima é de " + decimalFormat.format(velocidadeMaxima) + ", logo, ");
//            if (velocidadeMedia < velocidadeMaxima) {
//                System.out.println("ela não foi ultrapassada.");
//            } else if (velocidadeMedia == velocidadeMaxima) {
//                System.out.println("o motorista estava no limite.");
//            } else {
//                System.out.println("ultrapassou o limite.");
//            }
//            System.out.println("\n");
//        }

//        --------------------------------------------------
//        System.out.println("ESTOQUE \n");
//
//        Scanner input = new Scanner(System.in);
//        int estoque;
//        System.out.print("Informe seu estoque: ");
//        estoque = input.nextInt();
//
//        if (estoque >= 100) {
//            System.out.println("Produto com quantidade suficiente.");
//        } else if (estoque < 100 && estoque > 50) {
//            System.out.println("Alerta: avaliar possibilidade de novo pedido.");
//        } else {
//            System.out.println("ATENÇÃO! Faça um novo pedido.");
//        }

//                --------------------------------------------------
        System.out.println("SALÁRIO \n");

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        Scanner input = new Scanner(System.in);
        float salario;
        double desconto, salarioComDesconto;

        while (true) {
            System.out.print("Informe seu salário: R$");
            salario = input.nextFloat();

            if (salario < 1700) {
                desconto = salario * 0.08;
                salarioComDesconto = salario - desconto;
            } else if (salario < 3000) {
                desconto = salario * 0.09;
                salarioComDesconto = salario - desconto;
            }else {
                desconto = salario * 0.11;
                salarioComDesconto = salario - desconto;
            }

            System.out.println("Desconto: " + desconto + ". Seu salário com desconto fica em R$" + decimalFormat.format(salarioComDesconto) + "\n");
        }
    }
}
