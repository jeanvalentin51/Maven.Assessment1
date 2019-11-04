package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String petOwnerName;
    //private ArrayList<Pet> petList;
    private Pet [] petList;

    public PetOwner(String name, Pet... pets) {
        this.petOwnerName = name;
       // this.petList.addAll(Arrays.asList(pets));
        this.petList = pets;

        // loop through the array and set the pet's owner to each pet passed
        if (pets!=null) {
            for (int i = 0; i < pets.length; i++) {
                //this.petList.get(i).setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet... pet) {

        // loop through the array and set the pet's owner to each pet passed
        if (pet!=null) {
            for (int i = 0; i < pet.length; i++) {
                //this.petList[i] =
            }
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        //if (this.petList.size()>0) this.petList.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        // is the owner this object?
        //return pet.getOwner() == this;

        for (int i = 0; i < this.petList.length; i++) {
            if (this.petList[i].equals(pet)){
                return true;
            }
        }

        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int averageAge = 0;


//        for (int i = 0; i < this.petList.size(); i++) {
//            System.out.println(this.petList.get(i));
//        }
//        averageAge = averageAge/this.petList.size();

        return (float) averageAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int numberOfPets = 0;

        //numberOfPets = this.petList.size();

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

        return null;
    }
}
