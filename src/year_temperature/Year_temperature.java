/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year_temperature;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Year_temperature {

    /**
     * @param args the command line arguments
     */
    
    public static enum Months{
        January, Febuary, March, April, May, June, July, August, September, October, November, December
    }
    
    public static void main(String[] args) {
        int min = -20, max = 20;
        int[][] YearsWeather = new int[12][];
        YearsWeather[0] = new int[31];
        YearsWeather[1] = new int[28];
        YearsWeather[2] = new int[31];
        YearsWeather[3] = new int[30];
        YearsWeather[4] = new int[31];
        YearsWeather[5] = new int[30];
        YearsWeather[6] = new int[31];
        YearsWeather[7] = new int[31];
        YearsWeather[8] = new int[30];
        YearsWeather[9] = new int[31];
        YearsWeather[10] = new int[30];
        YearsWeather[11] = new int[31];
        
        Random random = new Random();
        for (int i = 0; i < YearsWeather.length; i++) {
            System.out.println(Months.values()[i]);
            for (int j = 0; j < YearsWeather[i].length; j++) {
                YearsWeather[i][j] = random.nextInt(max - min + 1)+min;
                System.out.printf("%4d",YearsWeather[i][j]);
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
