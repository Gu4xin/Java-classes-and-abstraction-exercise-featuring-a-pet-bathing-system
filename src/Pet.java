public class Pet { // classe que representa o pet.
    
private final String name; // nome do pet.

private boolean clean; // indica se o pet está limpo ou não.

public Pet(final String name) { // construtor da classe Pet, que recebe o nome do pet como parâmetro e define o estado inicial de limpeza como falso (sujo).
    this.name = name;
    this.clean = false;
}

public String getName() { // metodo get para pegar o nome do pet.
    return name;
}

public boolean isClean() { // metodo get para verificar se o pet está limpo.
    return clean;
}

public void setClean(boolean clean) { // metodo set para definir o estado de limpeza do pet.
    this.clean = clean;
}


}
