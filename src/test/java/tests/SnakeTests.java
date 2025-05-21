package tests;

import animals.petstore.pet.types.Dog;
import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;
    @BeforeAll
    public static void createAnimals()
    {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.FUR, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test Male")
    public void genderTestMale()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualSnake.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test White")
    public void genderSnakeBreed() {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.CORN);
        assertEquals(Breed.CORN, actualSnake.getBreed(), "Expecting Breed Corn!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test White")
    public void silentSnakeBreed() {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.UNKNOWN,Gender.FEMALE, Breed.CORN);
        assertEquals("the snake is silent", actualSnake.speak(), "I was expecting Bark");

    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test White")
    public void dogGoesHissTest()
    {
        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes Psss! Psss!", actualSnake.speak(), "I was expecting Bark");
    }
}
