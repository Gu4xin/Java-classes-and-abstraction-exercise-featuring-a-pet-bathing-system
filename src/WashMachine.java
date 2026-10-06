public class WashMachine { //classe da máquina de lavar pets
    

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeShower() { // metodo que representa o banho do pet, que consome água e shampoo da máquina e limpa o pet.
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }
        
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade máxima de água atingida.");
            return;
        }

        water += 2; 
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade máxima de shampoo atingida.");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) { // metodo que coloca o pet na máquina, verificando se a máquina está limpa e se já tem um pet dentro dela.
        if (!this.clean) {
            System.out.println("A máquina está suja, limpe-á antes de colocar o pet.");
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + "está na máquina atualmente.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() { // metodo que retira o pet da máquina, verificando se há um pet dentro dela e atualizando o estado de limpeza do pet.
        this.clean = this.pet.isClean();
        
        System.out.println("O pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }

    public void cleanMachine() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true; 
        System.out.println("A máquina foi limpa.");
    }


}
