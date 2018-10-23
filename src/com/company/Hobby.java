/*
* Class Hobby
* Has all primitive types and their description
* Created by Ihor Kyrychenko
*/
package com.company;

public class Hobby {
    private byte FavouriteHobby;
    private short NumberOfHobbies;
    private char Letter;
    private int Age;
    private long NormNamesEnds;
    private float CurrentHrivnyaValue;
    private double CurrentBitcoinValue;
    private boolean AreYouLike;

    Hobby(Hobby object){
        object.FavouriteHobby = FavouriteHobby;
        object.NumberOfHobbies = NumberOfHobbies;
        object.Letter = Letter;
        object.Age = Age;
        object.NormNamesEnds = NormNamesEnds;
        object.CurrentHrivnyaValue = CurrentHrivnyaValue;
        object.CurrentBitcoinValue = CurrentBitcoinValue;
        object.AreYouLike = AreYouLike;
    }

    Hobby(){
        this.FavouriteHobby = FavouriteHobby;
        this.NumberOfHobbies = this.NumberOfHobbies;
        this.Letter = Letter;
        this.Age = Age;
        this.NormNamesEnds = NormNamesEnds;
        this.CurrentHrivnyaValue = CurrentHrivnyaValue;
        this.CurrentBitcoinValue = CurrentBitcoinValue;
        this.AreYouLike = AreYouLike;
    }

    Hobby(byte a, short b, char c, int d, long e, float f, double g, boolean h){
        a = FavouriteHobby;
        b = NumberOfHobbies;
        c = Letter;
        d = Age;
        e = NormNamesEnds;
        f = CurrentHrivnyaValue;
        g = CurrentBitcoinValue;
        h = AreYouLike;
    }

    public byte getFavouriteHobby() {
        return FavouriteHobby;
    }

    public void setFavouriteHobby(byte favouriteHobby) {
        FavouriteHobby = favouriteHobby;
    }

    public short getNumberOfHobbies() {
        return NumberOfHobbies;
    }

    public void setNumberOfHobbies(short numberOfHobbies) {
        NumberOfHobbies = numberOfHobbies;
    }

    public char getLetter() {
        return Letter;
    }

    public void setLetter(char letter) {
        Letter = letter;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public long getNormNamesEnds() {
        return NormNamesEnds;
    }

    public void setNormNamesEnds(long normNamesEnds) {
        NormNamesEnds = normNamesEnds;
    }

    public float getCurrentHrivnyaValue() {
        return CurrentHrivnyaValue;
    }

    public void setCurrentHrivnyaValue(float currentHrivnyaValue) {
        CurrentHrivnyaValue = currentHrivnyaValue;
    }

    public double getCurrentBitcoinValue() {
        return CurrentBitcoinValue;
    }

    public void setCurrentBitcoinValue(double currentBitcoinValue) {
        CurrentBitcoinValue = currentBitcoinValue;
    }

    public boolean isAreYouLike() {
        return AreYouLike;
    }

    public void setAreYouLike(boolean areYouLike) {
        AreYouLike = areYouLike;
    }

    public void tellAboutHobby(){
        System.out.println("Your age is " + getAge());
        System.out.println("Your favourite letter is " + getLetter());
        System.out.println("The number of your hobbies " + getNumberOfHobbies());
        System.out.println("Your favourite hobby is " + getFavouriteHobby());
        System.out.println("The number of hours I was thinking how to name this field is " + getNormNamesEnds());
        System.out.println("The current Hrivnya value is " + getCurrentHrivnyaValue());
        System.out.println("The current Bitcoin value is " + getCurrentBitcoinValue());
        System.out.println("And you answer is " + isAreYouLike());
    }
}
