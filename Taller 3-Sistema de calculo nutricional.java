// Autor: Vinicio Bombón
// Taller 3-Sistema de calculo nutricional

public class Nutricion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calorias = 0, proteinas = 0, grasas = 0, carbohidratos = 0;

        System.out.print("¿Cuántos ingredientes deseas ingresar?: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nIngrediente #" + (i + 1));
            System.out.print("Cantidad en gramos: ");
            double gramos = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            System.out.print("Grupo (caloría/proteína/grasa/carbohidrato): ");
            String grupo = sc.nextLine().toLowerCase();

            switch (grupo) {
                case "caloría": calorias += gramos; break;
                case "proteína": proteinas += gramos; break;
                case "grasa": grasas += gramos; break;
                case "carbohidrato": carbohidratos += gramos; break;
                default: System.out.println("Grupo inválido."); break;
            }
        }

        System.out.println("\nResumen Nutricional:");
        System.out.println("Calorías: " + calorias + " kcal");
        System.out.println("Proteínas: " + proteinas + " g");
        System.out.println("Grasas: " + grasas + " g");
        System.out.println("Carbohidratos: " + carbohidratos + " g");

        if (calorias <= 700 && proteinas >= 50 && grasas <= 30 && carbohidratos <= 100) {
            System.out.println("✅ Valor nutricional aceptable.");
        } else {
            System.out.println("❌ Valor nutricional NO aceptable.");
        }

        sc.close();
    }
}
