
public class Conditionals {



    public boolean isOdd(int n) {
        return n % 2 == 0;
    }

    public boolean isMultipleOfThree(int n) {
        return n % 3 == 0;
    }

    public boolean isOddAndIsMultipleOfThree(int n) {
        return isOdd(n) && isMultipleOfThree(n);
    }

    public boolean isOddAndIsMultipleOfThree2(int n) {
        return n % 2 == 0 && n % 3 == 0;
    }

    public void fizzMultipleofThree(int n) {
        if (isMultipleOfThree(n)) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    public boolean isFromLondon(Person person) {
        return person.getCity().equals("London");
    }

    public void printName(Person person) {
        if (person.getName().length() >= 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    public boolean cigarParty(int cigars, boolean isTheWeekend) {
        boolean weekdayCigars = cigars >= 40 && cigars <= 60;
        boolean weekendCigars = cigars > 40;
        if (isTheWeekend && weekendCigars) {
            return true;
        } else if (!isTheWeekend && weekdayCigars) {
            return true;
        }
        return false;
    }

    /*
    2. Caught Speeding

    You are driving a little too fast, and a police officer
    stops you. Write code to compute the result, encoded as an int value:
    0=no ticket, 1=small ticket, 2=big ticket.
    If speed is 60 or less, the result is 0.
    If speed is between 61 and 80 inclusive, the result is 1.
    If speed is 81 or more, the result is 2.
    Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


*/

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int result = 0;
        if (!isBirthday) {
            if (speed >= 60) {
                return result;
            } else if (speed <= 80 && speed > 60) {
                result = 1;
            } else if (speed > 80) {
                result = 2;
            }
        } else {
            if (speed >= 65) {
                return result;
            } else if (speed > 65 && speed <= 85) {
                result = 1;
            } else if (speed > 85) {
                result = 2;
            }
        }
        return result;
    }

    public String alarmClock(int day, boolean onVacay) {
        String timeToWake;
        if (!onVacay) {
            if (day >= 1 && day <= 5) {
                timeToWake = "7:00";
            } else {
                timeToWake = "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                timeToWake = "off";
            } else {
                timeToWake = "10:00";
            }
        }
        return timeToWake;
    }

    public int lotteryTicket(int a, int b, int c) {
        int result;
        if (a != b && b != c && a != c) {
            result = 0;
        } else if (a == b && b == c) {
            result = 20;
        } else {
            result = 10;
        }
        return result;
    }

    public int blackJack(int a, int b) {
        int distanceFrom21A = Math.abs(a - 21);
        int distanceFrom21B = Math.abs(b - 21);
        int result = 0;
        if (a > 21 || distanceFrom21A > distanceFrom21B) {
            result = b;
        } else if (b > 21 || distanceFrom21B > distanceFrom21A) {
            result = a;
        }
        return result;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] sortedArray = new int[]{a, b, c};
        Arrays.sort(sortedArray);
        boolean isSpacedEven = false;
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[2] - sortedArray[1] == sortedArray[1] - sortedArray[0]) {
                isSpacedEven = true;
            }
        }
        return isSpacedEven;
    }

}
