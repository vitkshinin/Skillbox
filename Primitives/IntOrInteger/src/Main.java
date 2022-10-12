public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        System.out.println();

        char symbolEUp = 'Ё';
        int symbolEUpCode = symbolEUp;
        char symbolELow = 'ё';
        int symbolELowCode = symbolELow;

        for(char i = 'А'; i <= 'я'; i++) {
            int symbol = (char) i;
            System.out.println(i + " = " + symbol);
        }
        System.out.println(symbolEUp + " = " + symbolEUpCode + "\n" + symbolELow + " = " + symbolELowCode);
    }
}
