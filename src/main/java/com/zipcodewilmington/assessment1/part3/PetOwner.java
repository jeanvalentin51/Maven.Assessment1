package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String petOwnerName;
    private Pet[] petList;

    public PetOwner(String name, Pet... pets) {
        this.petOwnerName = name;
        this.petList = pets;
//        if (pets != null) {
//            for (Pet eachPet : this.petList) {
//                eachPet.setOwner(this);
//            }
//        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet... pet) {
        this.petList = pet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        if (pet != null) {
            for (int i = 0; i < this.petList.length; i++) {
                this.petList[i] = null;
            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        for (int i = 0; i < this.petList.length; i++) {
            if (this.petList[i].equals(pet)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer age;
        Integer petAge = Integer.MAX_VALUE;

        for (Pet eachPet : this.petList) {
            age = eachPet.getAge();
            if (age < petAge) petAge = age;
        }

        return petAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer age;
        Integer petAge = 0;

        for (Pet eachPet : this.petList) {
            age = eachPet.getAge();
            if (age > petAge) petAge = age;
        }

        return petAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int averageAge = 0;

        for (Pet eachPet : this.petList) {
            averageAge += eachPet.getAge();
        }

        averageAge = averageAge / this.petList.length;

        return (float) averageAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int numberOfPets = 0;

        numberOfPets = this.petList.length;

        return numberOfPets;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.petOwnerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return this.petList;
    }
}
