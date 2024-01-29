import java.util.Scanner;
import java.io.IOException;
public class TestSolo {
    public static void main(String[] args) {
        int opcao = 0;
        do{
            System.out.println("----------------------------------");
            System.out.println("          VAREJOS S/A             ");
            System.out.println("     (Código GTIN-13/UPC/EAN-13)  ");
            System.out.println("----------------------------------");
            System.out.println("  1)Validar código GTIN-13        ");
            System.out.println("  2)Identificar País              ");
            System.out.println("  3)Sair                          ");
            System.out.println("----------------------------------");
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite a opção (1-3): ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("----------------------------------");
                System.out.println("          VAREJOS S/A             ");
                System.out.println("     (Código GTIN-13/UPC/EAN-13)  ");
                System.out.println("----------------------------------");
                System.out.println("VALIDAR CÓDIGO");
                System.out.print("Digite o código de 13 digitos: ");
                String codigoDeBarras = scanner.next();
                String verificadorDigito = codigoDeBarras.substring(12);
                System.out.println("DÍGITO VERIFICADOR: "+verificadorDigito);

                if (codigoDeBarras.length() == 13) {
                    String codigoSemDigitoVerificacao = codigoDeBarras.substring(0, 12);
                    int digitoVerificacao = Character.getNumericValue(codigoDeBarras.charAt(12));

                    int digitoVerificacaoCalculado = calcularDigitoVerificacao(codigoSemDigitoVerificacao);

                    if (digitoVerificacao == digitoVerificacaoCalculado) {
                        System.out.println("NÚMERO GTIN-13 VÁLIDO!");
                        System.out.println("----------------------------------");
                    } else {
                        System.out.println("NÚMERO GTIN-13 INVÁLIDO!");
                        System.out.println("----------------------------------");
                    }
                } else {
                    System.out.println("O código de barras deve conter 13 dígitos.");
                }
                pressEnterToContinue();
            } else if (opcao == 2) {
                System.out.println("IDENTIFICAR PAIS");
                System.out.print("Digite o código de 13 digitos:  ");
                String prefixo = scanner.next();
            
                if (prefixo.length() == 13){
                    String paisOrigem = prefixo.substring(0, 3);
                    switch(paisOrigem){
                    case "789":
                        System.out.println("GETIN-13 origem Brasil: "+ paisOrigem);
                        break;
                    case "790":
                        System.out.println("GETIN-13 origem Brasil: "+ paisOrigem);
                        break;
                    case "779":
                        System.out.println("GETIN-13 origem Argentina: "+ paisOrigem);
                        break;
                    case "773":
                        System.out.println("GETIN-13 origem Uruguai: "+ paisOrigem);
                        break;
                    case "780":
                        System.out.println("GETIN-13 origem Chile: "+ paisOrigem);
                        break;
                    case "784":
                        System.out.println("GETIN-13 origem Paraguai: "+ paisOrigem);
                        break;
                    case "786":
                        System.out.println("GETIN-13 origem Equador: "+ paisOrigem);
                        break;
                    case "770":
                        System.out.println("GETIN-13 origem Colômbia: "+ paisOrigem);
                        break;
                    case "743":
                        System.out.println("GETIN-13 origem Nicarágua: "+ paisOrigem);
                        break;
                    case "600":
                        System.out.println("GETIN-13 origem África do Sul: "+ paisOrigem);
                        break;
                    case "601":
                        System.out.println("GETIN-13 origem África do Sul: "+ paisOrigem);
                        break;
                    default:
                        System.out.println("VAREJOS S/A não vende para este pais: "+paisOrigem);
                        break;

                    }
                    pressEnterToContinue();

                }
            
            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }while(opcao != 3);
    }

    public static int calcularDigitoVerificacao(String codigo) {
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < codigo.length(); i++) {
            int digito = Character.getNumericValue(codigo.charAt(i));

            if (i % 2 == 0) {
                somaPares += digito;
            } else {
                somaImpares += digito;
            }
        }

        int somaTotal = somaPares + 3 * somaImpares;
        int digitoVerificacao = 10 - (somaTotal % 10);
        if (digitoVerificacao == 10) {
            digitoVerificacao = 0;
        }

        return digitoVerificacao;
    }
    private static void pressEnterToContinue() {
        System.out.println("Pressione ENTER para continuar...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}