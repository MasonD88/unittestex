package animals.petstore.pet.types;

import animals.AnimalType;
import animals.petstore.pet.Pet;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.PetType;
import animals.petstore.pet.attributes.Skin;

import java.math.BigDecimal;

public class Snake extends Pet implements PetImpl {
    private Breed breed;
    public Snake(AnimalType animalType, Skin skinType, Gender gender, Breed breed)
    {
        this(animalType, skinType, gender, breed, new BigDecimal(0));
    }
    public Snake(AnimalType animalType, Skin skinType, Gender gender, Breed breed, BigDecimal cost)
    {
        this(animalType, skinType, gender, breed, cost, 0);
    }
    public Snake(AnimalType animalType, Skin skinType, Gender gender, Breed breed, BigDecimal cost, int petStoreId)
    {
        super(PetType.CAT, cost, gender, petStoreId);
        super.skinType = skinType;
        super.animalType = animalType;
        this.breed = breed;
    }
    public Breed getBreed() {
        return this.breed;
    }

    public AnimalType getAnimalType() {
        return this.animalType;
    }
    @Override
    public String toString() {
        return super.toString() +
                "The cat is " + this.animalType + "!\n" +
                "The cat breed is " + this.getBreed() + "!\n";
    }
}
