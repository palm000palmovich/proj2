//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int bigBall = 1000000;
        byte dencel = 6;
        short poltorashka = 31000;
        long pahan = 512047368;
        float pig = 1.3457f;
        double shrek = 4.567893;
        //System.out.println("Значение переменной с типом Integer ");
        System.out.println("Значение переменной с типом " + what_type(bigBall) + " равно " + bigBall + "\n"
                + "Значение переменной с типом " + what_type(dencel) + " равно " + dencel + "\n"
                + "Значение переменной с типом " +  what_type(poltorashka) + " равно " + poltorashka + "\n"
                + "Значение переменной с типом " + what_type(pahan) + " равно " + pahan + "\n"
                + "Значение переменной с типом " + what_type(pig) + " равно " + pig + "\n"
                + "Значение переменной с типом " + what_type(shrek) + " равно " + shrek);

        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }
        System.out.println("Задание 2");
        float x1 = 27.12f;
        long x2 = 987678965549l;
        double x3 = 2.786;
        int x4 = 569;
        int x5 = -159;
        int x6 = 27897;
        byte x7 = 67;
        int perc = 0;
        for (int i = 0; i < 4; i++){
            System.out.println("Processing: " + perc + "%");
            perc+=25;
        }
        System.out.println("Initialisation passed saccessfully!");

        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }

        System.out.println("Задание 3");
        int lp = 23, as = 27, ea = 30;
        int papper = 480;
        System.out.println("На каждого ученика рассчитано " + (papper/(lp + as + ea)) + " листов бумаги.");

        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }

        System.out.println("Задание 4");
        int speed_p_min = 8;
        int min = 20;
        int sutki = 1;
        int dni = 3;
        int mes = 1;
        System.out.println("За 20 минут машина произвела " + (speed_p_min * min) + " штук бутылок." + "\n"
                + "За сутки: " + (speed_p_min*(sutki*24*60)) + " бутылок " + "\n"
                + "За 3 дня: " + (speed_p_min*(sutki*24*60))*3 + " штук" + "\n"
                + "За месяц: " + (speed_p_min*(sutki*24*60))*30 + " бутылей.");

        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }

        System.out.println("Задание 5");
        byte sum = 120;
        byte bel = 2;
        byte kor = 4;
        System.out.println("В школе, где " + (sum / (bel + kor)) + " классов, нужно " + ((sum / (bel + kor))*bel)+ "\n"
                + "банок белой краски и " + ((sum / (bel + kor))*kor) + " банок коричневой краски.");

        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }

        System.out.println("Задание 6");
        byte banana = 5;
        byte milk = 2;
        byte ice_cream = 2;
        byte eggs = 4;
        float kg = (banana*80 + milk*105 + ice_cream*100 + eggs*70)/1000f;
        System.out.println("Общий вес завтрака: " + (banana*80 + milk*105 + ice_cream*100 + eggs*70) +
                " Граммов или " + kg + " Кг");



    }




    //Функция возвращает тип переменных
    public static String what_type(Object val){
        String type = "";
        if (val instanceof Integer){
            type = "Integer";
        } else if (val instanceof Byte) {
            type = "Byte";
        }
        if (val instanceof Short){
            type = "Short";
        } else if (val instanceof Long) {
            type = "Long";
        }
        if (val instanceof Float){
            type = "Float";
        } else if (val instanceof Double) {
            type = "Double";
        }
        return type;

    }
}