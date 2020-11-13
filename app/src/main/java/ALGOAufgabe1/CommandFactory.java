package ALGOAufgabe1;

import java.util.ArrayList;
import java.util.LinkedList;

public class CommandFactory {
    static private final String sTextPleaseInsertANumber = "\tPlease insert a number:";
    static private final String sExitMessage = "CLI program closed!";
    static private final String sTextPleaseInsertAMaxNumber = "\tPlease insert your max Number";
    static public LinkedList<ICommand> returnCommandList() {
        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(createExitCommand());
        list.add(createEuclidSubtractionRecursive());
        list.add(createEuclidSubtractionIterative());
        list.add(createEuclidDivisionRestRecursive());
        list.add(createEuclidDivisionRestIterative());
        list.add(createSieve());
        list.add(readProperties());
        return list;
    }

    static private ICommand createEuclidDivisionRestRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int result = GCDDiv.EuclidDivisionRestRecursive(x,y);
                return System.lineSeparator() + "Your GCD Result is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.";
            }
        };
    }

    static private ICommand createEuclidSubtractionIterative() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int result = GCDSub.EuclidSubstractionIterative(x,y);
                return System.lineSeparator() + "Your GCD Result is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.";
            }
        };
    }

    static private ICommand createEuclidSubtractionRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int result = GCDSub.EuclidSubstractionRecursive(x,y);
                return System.lineSeparator() + "Your GCD Result is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction.";
            }
        };
    }

    static private ICommand createEuclidDivisionRestIterative() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int result = GCDDiv.EuclidDivisionRestIterative(x,y);
                return System.lineSeparator() + "Your GCD Result is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.";
            }
        };
    }
    private static ICommand createSieve(){
        return new ICommand() {
            @Override
            public String execute() {
                ArrayList<Integer> result = new ArrayList<>();
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertAMaxNumber,1);
                result = Sieve.SieveofEutotilis(x);
                return System.lineSeparator() + "Your max Number is: "+ x +"\tYour Prime Numbers are: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Sieve of Eratosthanes.";
            }
        };
    }
    private static ICommand readProperties(){
        return  new ICommand() {
            @Override
            public String execute() {
                String prename = "";
                String surname = "";
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber,1);
                prename = Console.readStringFromStdIn("\tplease inserat an prename");
                surname = Console.readStringFromStdIn("\tplease inserat an surname");

                return prename + System.lineSeparator() + surname + System.lineSeparator() + x + System.lineSeparator() + y ;
            }

            @Override
            public String description() {
                return "Read properties like surename, prename, x and y.";
            }
        };
    }

    private static ICommand createExitCommand() {
        return new ICommand() {
            @Override
            public String execute() {
                System.out.println(sExitMessage);
                System.exit(0);
                return null;
            }

            @Override
            public String description() {
                return "Exit";
            }
        };
    }
}
