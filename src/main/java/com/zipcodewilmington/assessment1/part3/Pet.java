package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */

    private PetOwner petOwner;
    private String petName = "";
    private int petAge = 0;

    public Pet() {
        this.petName = "Cat name";
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.petName = name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.petAge = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.petName = name;
        this.petAge = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {

        if (this.petName == "") this.petName = "Cat name";
        return this.petName;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return this.petAge;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        this.petOwner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {

        return this.petOwner;
    }
}
