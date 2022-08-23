import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // задача 1 объявление всех типов переменных

        var someVariable = "I'm a variable";
        byte smallest =8;
        short small = 16;
        int bigger = -234565;
        long biggestInteger= 999999999999999999L;

        float withPoint = 0.1f;
        double withLotsOfZerosBehindPoint = 0.00000000000000002;

        boolean trueFalse = false;

        //задача 2 про вес двух боксёров

        float boxer1Weight = 78.2f;
        float boxer2Weight= 82.7f;
        float weightDifference = boxer2Weight%boxer1Weight;
        float totalWeight = boxer1Weight+boxer2Weight;
        System.out.println("Вес двух боксёров составляет "+totalWeight+" кг");
        System.out.println("Боксёр 2 тяжелее боксёра 1 на "+weightDifference+" кг");


        //задача 3 на подсчёт веса спорт-завтрака

        int bananaWeight = 80;
        int milk100mlWeight = 105;
        int iceCreamWeight = 100;
        int rawEggWeight = 70;
        int breakfastWeightGrams = bananaWeight*5+milk100mlWeight*2+iceCreamWeight*2+rawEggWeight*4;
        float breakfastWeightKg = breakfastWeightGrams/1000f;
        System.out.println("Вес спорт-завтрака равен "+breakfastWeightKg+"кг"); //килограм еды на завтрак - это жёстко, имхо.

        //Задача 4 про похудение на 7 кг

        int plannedWeightKgLoss = 7;
        int weightLossGramsPerDay = 250;
        int daysForWeightLoss = plannedWeightKgLoss*1000/weightLossGramsPerDay;//перевёл в кг прямо здесь
        System.out.println("Спортсмен потеряет 7 кг по 250 г в день за "+daysForWeightLoss+" дней");
        weightLossGramsPerDay = 500; //сначала я объявил 2 отдельные переменные для сброса веса отдельно на 250 и 500 г.
        // потом понял, что можно воспользоваться одной и той же, просто присваивать ей другое значение.
        daysForWeightLoss = plannedWeightKgLoss*1000/weightLossGramsPerDay;//так же и здесь было 2 переменных для количества дней с разной скоростью похудения
        //решил так же оставить одну переменную
        System.out.println("Спортсмен потеряет 7 кг по 500 г в день за "+daysForWeightLoss+" дней");
        int daysForWeightLossAverage = (daysForWeightLoss+daysForWeightLoss*2)/2;// здесь я высчитывал среднее значение между двумя переменными
        //решил схитрить, зная что количество дней просто удвоилось.
        System.out.println("Спортсмен потеряет 7 кг в среднем за "+daysForWeightLossAverage+" дней");

        //Задача 5 про повышение зарплаты

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int rate = 10;

        int mashaMoneyPlus = mashaSalary/100*rate;
        int denisMoneyPlus = denisSalary/100*rate;
        int kristinaMoneyPlus = kristinaSalary/100*rate;

        mashaSalary = mashaSalary+mashaMoneyPlus;
        denisSalary = denisSalary+denisMoneyPlus;
        kristinaSalary = kristinaSalary+kristinaMoneyPlus;

        System.out.println("Маша теперь получает "+mashaSalary+" рублей. Годовой доход вырос на "+mashaMoneyPlus*12);
        System.out.println("Маша теперь получает "+denisSalary+" рублей. Годовой доход вырос на "+denisMoneyPlus*12);
        System.out.println("Маша теперь получает "+kristinaSalary+" рублей. Годовой доход вырос на "+kristinaMoneyPlus*12);




    }
}