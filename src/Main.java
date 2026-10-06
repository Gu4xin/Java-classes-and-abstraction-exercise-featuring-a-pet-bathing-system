import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static WashMachine washMachine = new WashMachine();


    public static void main(String[] args){
        scanner.useDelimiter("\\R"); // inclui quebra de linha (espaço) para o nome do pet. Sem ele o pet só pode ter um nome de uma palavra.
        var option = -1; // option começa em -1 para não interagir com nenhuma opção do menu, entrando no loop do "while".

        do {
            System.out.println("===Escolha uma opção===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> washMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInWashMachine();
                case 7 -> setPetInWashMachine();
                case 8 -> washMachine.removePet();
                case 9 -> washMachine.cleanMachine();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0); // Enquanto a opção for diferente de 0 o código segue rodando.
    }

    private static void setWater() {
        System.out.println("Colocando água na máquina...");
        washMachine.addWater();
    }

    private static void verifyWater() {
        var waterAmount = washMachine.getWater();
        System.out.println("A máquina está no momento com " + waterAmount + " litros de água.");
    }

    private static void setShampoo() {
        System.out.println("Colocando shampoo na máquina...");
        washMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var shampooAmount = washMachine.getShampoo();
        System.out.println("A máquina está no momento com " + shampooAmount + " litros de shampoo.");
    }

    private static void checkIfHasPetInWashMachine() {
        var hasPet = washMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void setPetInWashMachine() { // metodo que coloca o pet na máquina, pedindo o nome do pet e criando um objeto da classe Pet.
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }

        var pet = new Pet(name);
        washMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

}
