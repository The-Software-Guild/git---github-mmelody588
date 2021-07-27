/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.unittesting.logic;

/**
 *
 * @author mmelo
 */
public class LogicExerciseC {
    /**
     * Figure out if you're taking your dog for a walk.
     * Your dog wants to go for a walk - however, there are multiple factors 
     * that you must consider before going. 
     * 
     * You only go walking if it's light outside, or if you have a flashlight. 
     * Also only if it's not raining, or if you have an umbrella. 
     * And if it's not too hot (more than 95 degrees) and not too cold (less than 50 degrees).
     *
     * Ex:
     * goWalky( true, false, true, true, 75  ) ->  true
     * goWalky( false, true, false, false, 50  ) ->  true
     * goWalky( false, false, false, false, 30  ) ->  false
     * 
     * @param isDark
     * @param haveFlashlight
     * @param isRaining
     * @param haveUmbrella
     * @param degreesFarenheit
     * @return boolean
     */
    public static boolean goWalky(boolean isDark, boolean haveFlashlight, boolean isRaining, boolean haveUmbrella, int degreesFarenheit) {
        if(isDark == false || haveFlashlight == true){
            if(isRaining == false || haveUmbrella == true){
                if(degreesFarenheit <= 95 && degreesFarenheit >= 50){
                    return true;
                }
            }
        }
        return false;
    }
}
