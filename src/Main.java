public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //task1
        int sequnceNumber = 4481;
        byte age = 46;
        short district = 20147;
        long creditsInTheAccount = 127_817;
        System.out.println("значение переменной с типом int равно 4481");
        System.out.println("значение переменной с типом byte равно 46");
        System.out.println("значение переменной с типом short равно 20147");
        System.out.println("значение переменной с типом long равно 127_817");

        //task2
        double a1 = 27.12d;
        long a2 = 987_678_965_549l;
        float a3 = 2.786f;
        short a4 = 569;
        int a5 = -159, a6 = 27897;
        byte a7 = 67;

        //task3

        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int sumOfStuident = (23 + 27 + 30);
        int vsegoListov = 480;
        int listovNaStuident = (480 / 80);
        System.out.println("Листов на ученика будет " + listovNaStuident);


        //task4
        int time=20;
        int botlesToMinutes=8;
        int minutesInHour=60;
        int minutesInDay=(minutesInHour*60);
        int minutesIn3day=(minutesInDay*3);
        int minutesInMonth=(minutesInDay*31);
        System.out.println("За 20 минут машина произвела "+(time*8)+"  штук бутылок");
        System.out.println("За час машина произвела "+(minutesInHour*8)+"  штук бутылок");
        System.out.println("За сутки  машина произвела "+(minutesInDay*8)+"  штук бутылок");
        System.out.println("За трое суток машина произвела "+(minutesIn3day*8)+"  штук бутылок");
        System.out.println("За месяц машина произвела "+(minutesInMonth*8)+"  штук бутылок");

        //task5
        int volumeOfCans=120;
        int brounCansPerClass=4;
        int whiteCansPerClass=2;
        int cansPerClass=(brounCansPerClass+whiteCansPerClass);
        int volumeOfClass=volumeOfCans/cansPerClass;
        System.out.println("В школе где "+(volumeOfClass)+" классов нужно "+(whiteCansPerClass*volumeOfClass)+"  банок белой краски и \n" +
                (brounCansPerClass*volumeOfClass)+"  банок коричневой краски");

        //task6
        float grammsInkg=1000f;
        int bananaWight=80;
        int milkWight=105;
        int iceCreamWight=100;
        int eggWight=70;
        int quantityOfBanana=5;
        int quantityOfMilk=2;
        int quantityOfIceCream=2;
        int quantityOfegg=4;
        int result=(bananaWight*quantityOfBanana)+(milkWight*quantityOfMilk)+(iceCreamWight*quantityOfIceCream)+
                (eggWight*quantityOfegg);
        float resultInKg=result/grammsInkg;
        System.out.println(resultInKg);

        //task7
        int targetToLoseWightKg=7;
        int grammsInKg=1000;
        int targetToLoseWightG=targetToLoseWightKg*grammsInKg;
        int minGrammInDay=250;
        int maxGrammInDay=500;
        int minDays=targetToLoseWightG/maxGrammInDay;
        int maxDays=targetToLoseWightG/minGrammInDay;
        int avgDays=(minDays+maxDays)/2;
        System.out.println("Min: "+ minDays);
        System.out.println("Max: "+maxDays);
        System.out.println("Avg: "+avgDays);

        //task8
        int mashaSalary=67_760;
        int denisSalary=83_690;
        int kristinaSalary=76_230;
        int percent=10;
        float newSalaryMultiplier=1+(percent/100f);
        int mashaNewSalary=(int)(mashaSalary*newSalaryMultiplier);
        int mashaTotalSalaryDiff=(mashaNewSalary-mashaSalary)*12;
        int denisNewSalary=(int)(denisSalary*newSalaryMultiplier);
        int denisTotalSalaryDiff=(denisNewSalary-denisSalary)*12;
        int kristinaNewSalary=(int)(kristinaSalary*newSalaryMultiplier);
        int kristinaTotalSalaryDiff=(kristinaNewSalary-kristinaSalary)*12;
        System.out.println(
                "Маша теперь получает: "+mashaNewSalary+"."+"Годовой доход вырос на "+mashaTotalSalaryDiff+
                        " рублей.");
        System.out.println(
                "Денис теперь получает: "+denisNewSalary+"."+"Годовой доход вырос на "+denisTotalSalaryDiff+
                        " рублей.");
        System.out.println(
                "Кристина теперь получает: "+kristinaNewSalary+"."+"Годовой доход вырос на "+kristinaTotalSalaryDiff+
                        " рублей.");
    }
}
