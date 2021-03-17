

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


/*

Crie uma aplicação Java que leia o valor de uma compra e a quantidade de
parcelas. Depois crie dois arrays com o tamanho da quantidade de parcelas lida,
para armazenar o valor de cada parcela e para a data de vencimento de cada
parcela. Realize o cálculo do valor da parcela e armazene no array o valor de
cada parcela. As datas de vencimento devem ser calculadas de 30 em 30 dias e
armazenadas no array, sendo que a data do primeiro vencimento deve ser
calculada a partir da data do sistema operacional. Depois exiba a seguinte saída
no console:


Valor da compra: 350.0
Total de parcelas: 5

Valor da parcela: 70.0 Data do 1º vencimento: 15/04/2021
Valor da parcela: 70.0 Data do 2º vencimento: 15/05/2021
Valor da parcela: 70.0 Data do 3º vencimento: 14/06/2021
Valor da parcela: 70.0 Data do 4º vencimento: 14/07/2021
Valor da parcela: 70.0 Data do 5º vencimento: 13/08/2021

*/

public class firstProgram {

    public static void main(String[] args) {
        
        // VARIAVEIS 
        
        Integer parcelas;
        Double valorParcela;
        Double valorCompra;
        String dataUsuario;
        
        // VETORES
        
        Integer vParcelas[];
        String vData[];
        
        //FORMATAÇAO DA DATA ATUAL
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
        Calendar data = Calendar.getInstance();
        
        // PARA NAO ACEITAR DATAS ERRADAS
         sdf.setLenient(false);
        
        //SCANNER PARA A LEITURA DOS DADOS
        Scanner ler;  
        ler = new Scanner(System.in);
        
        // CAPTURA DO VALOR DA COMPRA E DA QUANTIDADE DAS PARCELAS
        
        System.out.print("Digite o valor da compra: ");
        valorCompra = ler.nextDouble();
        System.out.print("\nDigite a quantidade de  parcelas:");
        parcelas = ler.nextInt();
        
        
        // EQUAÇAO VALOR DA PARCELA
        
        valorParcela = (valorCompra / parcelas);
        
        //ARRAYS GERADOS DINAMICAMENTE
        
        vParcelas = new Integer[parcelas];
        vData = new String[parcelas];
    
        // RESPECTIVAS DATAS E VALORES DAS PARCELAS SENDO ATRIBUIDAS AOS VETORES
        
        for(int i = 0 ; i<parcelas ; i++){
            
            vParcelas[i] = (valorParcela.intValue());
            data.add(Calendar.DAY_OF_MONTH,30);
            vData[i] = sdf.format(data.getTime());
            
            
            //System.out.print("\nData de pagamento: " + sdf.format(data.getTime()));
        }
        
        // RESULTADOS CONSOLE
        
        System.out.println("\n\n");
        
        System.out.print("Valor da compra: ");
        System.out.printf( "%.2f", valorCompra );
        System.out.print("\nTotal de parcelas: " + parcelas);
        
        System.out.println("\n\n");
       
        // contador a parte para as parcelas 
        Integer cont=1;
        
        // ULTIMO FOR PARA A LEITURA DOS VETORES
        
        for(int i = 0 ; i<parcelas ; i++){
            
            
            System.out.print("Valor da parcela: " + vParcelas[i]);
          //System.out.printf( "%.2f", vParcelas[i] );
            System.out.print(" |||||||| Data do " + cont + "º") ; cont++;
            System.out.print(" vencimento: ");
            System.out.println(vData[i]);
        
        }
        System.out.println("\n");
    }
    
  
    
}
