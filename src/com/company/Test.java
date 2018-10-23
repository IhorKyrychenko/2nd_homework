/*
* Class Test
* calls class Hobby to work with its methods
* Created by Ihor Kyrychenko
*/

package com.company;

import com.company.Hobby;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Test {

    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Hobby examp1 = new Hobby();
        examp1.setAreYouLike(true);

        Hobby object = new Hobby();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your age:");
        object.setAge(scan.nextInt());
        logger.info("int = " + object.getAge());

        System.out.println("Enter your favourite letter:");
        object.setLetter(scan.next().charAt(0));
        logger.debug("char = " + object.getLetter());

        System.out.println("Enter the number of your hobbies:");
        object.setNumberOfHobbies(scan.nextShort());
        logger.warn("short = " + object.getNumberOfHobbies());

        System.out.println("Enter your favourite hobby:");
        object.setFavouriteHobby(scan.nextByte());
        logger.error("byte = " + object.getFavouriteHobby());

        System.out.println("Enter the number of hours i spend to name this field:");
        object.setNormNamesEnds(scan.nextLong());
        logger.info("long = " + object.getNormNamesEnds());

        System.out.println("Enter the current value of Hrivnya:");
        object.setCurrentHrivnyaValue(scan.nextFloat());
        logger.debug("float = " + object.getCurrentHrivnyaValue());

        System.out.println("Enter the current value of Bitcoin:");
        object.setCurrentBitcoinValue(scan.nextDouble());
        logger.warn("double = " + object.getCurrentBitcoinValue());

        System.out.println("Do you like my questions?");
        object.setAreYouLike(scan.nextBoolean());
        logger.error("bool = " + object.isAreYouLike());

        object.tellAboutHobby();
    }
}



