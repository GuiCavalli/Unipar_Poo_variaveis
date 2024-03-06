public class ControleEstoque {
    public static void main(String[] args) {
       
int qtdVendasSmartPhone = 6;
String nomeSmartPhone = "Iphone 15 ProMax";
int qtdEstoqueSmartPhone = 8;
double valorSmartPhone = 8729.15;


int qtdVendasLaptop = 5;
String nomeLaptop = "Acer Nitro 5";
int qtdEstoqueLaptop = 3;
double valorLaptop =  10165.85;


int qtdVendasFoneBluetooth = 20;
String nomeFoneBluetooth = "Haylou X1 Pro";        
int qtdEstoqueFoneBluetooth = 50;  
double valorFoneBluetooth =  601.50;

System.out.println("Dados do Smartphone:");
System.out.println("Nome: " + nomeSmartPhone);
System.out.println("Quantidade de vendas Iphone 15 ProMax: " + qtdVendasSmartPhone);
System.out.println("Qauntidade em estoque: " + qtdEstoqueSmartPhone);
System.out.println ("Valor Iphone 15 ProMax: R$" + valorSmartPhone);

System.out.println ("");

System.out.println("Dados do Laptop:");
System.out.println("Nome: " + nomeLaptop);
System.out.println("Quantidade de vendas Acer Nitro 5: " + qtdVendasLaptop);
System.out.println("Qauntidade em estoque: " + qtdEstoqueLaptop);
System.out.println ("Valor Acer Nitro 5: R$" + valorLaptop);

System.out.println ("");

System.out.println("Dados do Fone Bluetooth:");
System.out.println("Nome: " + nomeFoneBluetooth);
System.out.println("Quantidade de vendas Acer Nitro 5: " + qtdVendasFoneBluetooth);
System.out.println("Qauntidade em estoque: " + qtdEstoqueFoneBluetooth);
System.out.println ("Valor Acer Nitro 5: R$" + valorFoneBluetooth);

    }
}
