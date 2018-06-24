package chapter5;

public class Money {

    private VariableMoneys value;

    private Money(VariableMoneys value) {
        this.value = value;
    }

    public static void main(String[] args) {
        for (VariableMoneys m : VariableMoneys.values()) {
            System.out.println("Номер купюры " + m + " = " + m.ordinal() + " ");
        }

        Money Ten = new Money(VariableMoneys.TEN);
        Money TwoThousand = new Money(VariableMoneys.TWO_THOUSAND);
        Money FiveHundred = new Money(VariableMoneys.FIVE_HUNDRED);
        Money OneHundred = new Money(VariableMoneys.ONE_HUNDRED);

        Ten.checkMoney();
        TwoThousand.checkMoney();
        FiveHundred.checkMoney();
        OneHundred.checkMoney();
    }


    private enum VariableMoneys {
        TEN, FIFTY, ONE_HUNDRED, FIVE_HUNDRED, ONE_THOUSAND, TWO_THOUSAND
    }

    private void checkMoney() {
        System.out.print(value + ", эта купюра имеет ");
        switch (value) {
            case TEN:
                System.out.println("зеленый цвет и изображение Красноярска");
                break;
            case FIFTY:
                System.out.println("серый цвет и изображение Питера");
                break;
            case ONE_HUNDRED:
                System.out.println("желтый цвет и изображение колесницы");
                break;
            case FIVE_HUNDRED:
                System.out.println("розовый цвет и изображение Архангельска");
                break;
            case ONE_THOUSAND:
                System.out.println("зеленый цвет и изображение Ярославля");
                break;
            case TWO_THOUSAND:
                System.out.println("ярко синий цвет и изображение моста");
                break;
            default:
                System.out.println("походу не купюра");
        }
    }
}
