import java.util.Random;

public class jiahaoAemet {
    private static String[] jiahaoNombres = {"Sevilla", "Málaga", "Granada", "Córdoba", "Almería", "Jaén", "Huelva", "Cádiz"};
    private static String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    public static double[][] temp = new double[jiahaoNombres.length][diasSemana.length]; 
public static void main(String[] args) {
        GenerarRegistroTemp();
        ListarRegistroTemp();
    }
    public static void GenerarRegistroTemp() {
        Random random = new Random();
        for (int i = 0; i < jiahaoNombres.length; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                temp[i][j] = Math.round((40.0 + (random.nextDouble() * (40.0 - (-1.0)))) * 100.0) / 100.0;
            }
        }
    }
    public static void ListarRegistroTemp() {
        System.out.printf("%-10s", "Nombre");
        for (String dia : diasSemana) {
            System.out.printf("%-15s", dia);
        }
        System.out.println();
        for (int i = 0; i < jiahaoNombres.length; i++) {
            System.out.printf("%-10s", jiahaoNombres[i]);
            for (int j = 0; j < diasSemana.length; j++) {
                System.out.printf("%-15.2f", temp[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < jiahaoNombres.length; i++) {
            double maxTemp = Double.MIN_VALUE;
            double minTemp = Double.MAX_VALUE;
            for (int j = 0; j < diasSemana.length; j++) {
                if (temp[i][j] > maxTemp) {
                    maxTemp = temp[i][j];
                }
                if (temp[i][j] < minTemp) {
                    minTemp = temp[i][j];
                }
            }
            System.out.printf("Ciudad: %-10s Máxima: %-6.2f Mínima: %-6.2f%n", jiahaoNombres[i], maxTemp, minTemp);
    }
    }
    }