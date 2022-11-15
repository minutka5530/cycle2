public class Main {
    public static void main(String[] args){

        // Задача 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while ( total < 2_459_000 ) {
            total += total / 100;
            i++;
            total += salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");}


        // Задача 2
        int a = 0;
            while (a < 10){
                a ++;

                System.out.println(a);}

        for (int c = 10; c > 0; c--){

            System.out.println(c);
        }
        // Задача 3
        int y = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int fertilityY = 1000;
        int perBirthYear = y / fertilityY * fertility;
        int mortality1 = y / fertilityY * mortality;
        for (int ap = 1; ap <=10; ap++){
            y+=perBirthYear-mortality1;{
                System.out.println("Год " + ap + " численность населения составляет" + y);
            }
        }


        // Задача 4,5
        int total2 = 0;
        int sumVasi = 15000;
        for (int w = 1; total2 <= 12_000_000; w++ ) {
            total2 += total2 / 100 * 7;
            total2 += sumVasi;
            if (w % 6 == 0){
                System.out.println("месяц " + w + " суммы накоплений " + total2);
            }


        }
        // Задача 6
        int vasy1 = 15000;
        for (int w = 1; w < 108; w++ ){
            vasy1 += vasy1 / 100 * 7;{
                System.out.println("Василий заработает  " + vasy1 );
            }
        }
        // Задача 7
        for (int friday = 5; friday < 31; friday+= 7 ){
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }


        int yearNow = 2022;
        int commentsBefore = 200;
        int commentsAfter = 100;
        int commentsWas = yearNow - commentsBefore;
        int commentsWill = yearNow + commentsAfter;
        for (int x1 = 0; x1 <= commentsWill; x1 += 79) {
            if (commentsWas<x1){
                System.out.println(x1);
            }



        }
        int u = 1;

//
        for(int w = 1; w <= 10;  w ++){
            System.out.println( "2 + "+ w +" = "+ w * 2 );
        }






    }


}