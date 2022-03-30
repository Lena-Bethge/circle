package com.company;

public class Main {

    public static void main(String[] args) {
        Main {

                System.out.println("Enter numbers: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                System.out.println("It is "+dayOfWeek(number));
            }
            public static String dayOfWeek(int number) {
                String day;
                switch (number)
                {
                    case 1:
                        return day = "Monday";
                    case 2:
                        return day = "Tuesday";
                    case 3:
                        return day = "Wednesday";
                    case 4:
                        return day = "Thursday";
                    case 5:
                        return day = "Friday";
                    case 6:
                        return day = "Saturday";
                    case 7:
                        return day = "Sunday";
                    default:
                        return day = "not correct";
                }
            }

        }
    }
}
