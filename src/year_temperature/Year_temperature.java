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
        Random random = new Random();
        int min = -20, max = 20, dayInMonth = 0;
        int[][] YearsWeather = new int[12][];
        System.out.print("           ");
        float average_sum=0;
        //номер столбца/дня
        for (int i = 0; i < 31; i++) {
            System.out.printf("%4d", i+1);
            System.out.print("|");
        }
        System.out.println("");//чтобы январь не улетел лул
        
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0: min = -20; max = -5; dayInMonth = 31; break;
                case 1: min = -20; max = 0; dayInMonth = 28; break;
                case 2: min = -15; max = 5; dayInMonth = 31; break;
                case 3: min = -10; max = 10; dayInMonth = 30; break;
                case 4: min = -5; max = 15; dayInMonth = 31; break;
                case 5: min = 5; max = 20; dayInMonth = 30; break;
                case 6: min = 10; max = 30; dayInMonth = 31; break;
                case 7: min = 10; max = 25; dayInMonth = 31; break;
                case 8: min = 0; max = 20; dayInMonth = 30; break;
                case 9: min = -5; max = 10; dayInMonth = 31; break;
                case 10: min = -10; max = 5; dayInMonth = 30; break;
                case 11: min = -15; max = 0; dayInMonth = 31; break;
                
            }
            //выставляем название месяца в начало
            
            System.out.printf("%9s: ",Months.values()[i]);//9s кол-во отступов перед словом
            YearsWeather[i] = new int[dayInMonth];//выставление кол-ва дней в месяц
            //заполняем дни температурой согласно месяцу
            for (int j = 0; j < YearsWeather[i].length; j++) {
                YearsWeather[i][j] = random.nextInt(max - min + 1)+min;
                System.out.printf("%4d",YearsWeather[i][j]);
                System.out.print("|");
                average_sum+=YearsWeather[i][j];
                
            }
            //average temp
            System.out.printf("%2.2f",average_sum/YearsWeather[i].length);
            average_sum=0;
            System.out.println();//для переноса месяца на новую строку
            
        }
        
       
        
        

        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
