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