public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task1
        int sequnceNumber = 4481;
        byte age = 46;
        short district = 20147;
        long creditsInTheAccount = 127_817;
        float iq=-57.8f;
        double galaxy=8967.6789d;
        System.out.println("значение переменной с типом int равно 4481");
        System.out.println("значение переменной с типом byte равно 46");
        System.out.println("значение переменной с типом short равно 20147");
        System.out.println("значение переменной с типом long равно 127_817");
        System.out.println("значение переменной с типом float равно -57.8");
        System.out.println("значение переменной с типом double равно 8967.6789");


        //task2
        double a1 = 27.12d;
        long a2 = 987_678_965_549l;
        float a3 = 2.786f;
        short a4 = 569;
        int a5 = -159, a6 = 27897;
        byte a7 = 67;

        //task3

        int stuidentInClass1 = 23;
        int stuidentInClass2 = 27;
        int StudentInClass3 = 30;
        int sumOfStuident = (23 + 27 + 30);//общее количество учеников в трёх классах=80
        int vsegoListov = 480;
        int listovNaStuident = (480 / 80);
        System.out.println("Листов на ученика будет " + listovNaStuident);
        //если я правильно понял рекомендации,то для более лучшей читабельности кода предлагаю
        //ввести более корректные названия интовых переменных и добавить коммент для числа80,
        //т.к. в условии задачи оно вообще не фигурирует

        //task4
        int efficiency=16/2;//производительность 16 бутылок_за 2 мтнуты
        int minutesInHour=60;
        int minutesInDay=(minutesInHour*24);
        int minutesIn3day=(minutesInDay*3);
        int minutesInMonth=(minutesInDay*31);
        System.out.println("За 20 минут машина произвела "+(20*efficiency)+"  штук бутылок");
        System.out.println("За час машина произвела "+(minutesInHour*efficiency)+"  штук бутылок");
        System.out.println("За сутки  машина произвела "+(minutesInDay*efficiency)+"  штук бутылок");
        System.out.println("За трое суток машина произвела "+(minutesIn3day*efficiency)+"  штук бутылок");
        System.out.println("За месяц машина произвела "+(minutesInMonth*efficiency)+"  штук бутылок");
        //встроил параметр"производительность"

        //task5
        int volumeOfCans=120;
        int brounCansPerClass=4;
        int whiteCansPerClass=2;
        int cansPerClass=(brounCansPerClass+whiteCansPerClass);
        int volumeOfClass=volumeOfCans/cansPerClass;
        //System.out.println("В школе где "+(volumeOfClass)+" классов нужно "+(whiteCansPerClass*volumeOfClass)+"  банок белой краски и \n" +
        //       (brounCansPerClass*volumeOfClass)+"  банок коричневой краски");
        System.out.println("В школе где "+(volumeOfCans/cansPerClass)+" классов нужно, "+(whiteCansPerClass*volumeOfClass)+"  банок белой краски и \n" +
                (brounCansPerClass*volumeOfClass)+"  банок коричневой краски");
        //Закомментировал старый вариант,чтобы была видна разница
        //теперь всё вычисление происходит в выводе.

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
