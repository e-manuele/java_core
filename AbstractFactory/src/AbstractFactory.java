public interface AbstractFactory {
    Animal createAnimal(String animalType);

    Color createColor(String colorType);
}
